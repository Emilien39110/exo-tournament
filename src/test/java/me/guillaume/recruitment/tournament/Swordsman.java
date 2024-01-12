package me.guillaume.recruitment.tournament;

public class Swordsman extends Fighter {
    public Swordsman() {
        super(100, new Weapon(WeaponType.SWORD, 5));
    }

    @Override
    public Swordsman equip(String item) {
        if ("buckler".equals(item)) {
            this.buckler = new Buckler();
        }
        return this;
    }

    @Override
    public String toString() {
        return "Swordsman";
    }


}
