package me.guillaume.recruitment.tournament;

public abstract class Fighter {
    protected int hitPoints;
    protected Weapon weapon;
    protected Buckler buckler;

    public Fighter(int initialHitPoints, Weapon initialWeapon) {
        this.hitPoints = initialHitPoints;
        this.weapon = initialWeapon;
    }

    public  void engage(Fighter opponent){
        if(opponent.buckler != null && opponent.buckler.blockBlow()) {
            //System.out.println(this + " attaque " + opponent + " est bloque");
            opponent.buckler.getDamage(this.weapon.getType());
            if (opponent.buckler.isDestroyed()) {
                opponent.buckler = null;
            }
            opponent.engage((this));
            return;
            //System.out.println(opponent.toString() + " " + opponent.hitPoints);
        }
        opponent.hitPoints -= weapon.getDamage();
        //System.out.println(opponent + " " + opponent.hitPoints);
        if(opponent.hitPoints < 0 ){
            //System.out.println("<0");
            opponent.hitPoints = 0;
        }else{
            opponent.engage(this);
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public abstract Fighter equip(String item);

    public abstract String toString();

}
