package me.guillaume.recruitment.tournament;

public class Buckler {
    private int durability ;
    private boolean blockNextBlow;

    public Buckler(){
        this.durability = 3;
        this.blockNextBlow = false;
    }

    public boolean blockBlow() {
        blockNextBlow = !blockNextBlow;
        return blockNextBlow;
    }

    public boolean isDestroyed(){
        return durability<=0;
    }

    public void getDamage(WeaponType type) {
        if(type == WeaponType.AXE){
            durability--;
        }
    }
}
