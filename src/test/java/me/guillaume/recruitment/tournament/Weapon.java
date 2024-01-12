package me.guillaume.recruitment.tournament;

public class Weapon {
    private WeaponType type;
    private int damage;

    public Weapon(WeaponType initialType, int initialeDamge){
        type = initialType;
        damage = initialeDamge;
    }

    public int getDamage() {
        return damage;
    }

    public WeaponType getType(){
        return type;
    }
}
