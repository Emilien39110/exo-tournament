package me.guillaume.recruitment.tournament;

public class Swordsman {
    private int hitPoints;
    private int dmg;

    public Swordsman() {
        hitPoints = 100;
        dmg = 5;
    }

    public void engage(Viking viking) {
        hitPoints -= viking.getDamage();
        if(hitPoints<0) hitPoints=0;
        if(viking.hitPoints() > 0){
            viking.engage(this);
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return dmg;
    }
}
