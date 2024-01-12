package me.guillaume.recruitment.tournament;

public class Viking {
    private int hitPoints;
    private int dmg;

    public Viking(){
        hitPoints = 120 ;
        dmg = 6 ;
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void engage(Swordsman swordsman){
        hitPoints -= swordsman.getDamage();
        if(hitPoints<0){
            hitPoints=0;
        }else {
            if (swordsman.hitPoints() > 0) {
                swordsman.engage(this);
            }
        }
    }

    public int getDamage() {
        return dmg;
    }
}
