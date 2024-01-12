package me.guillaume.recruitment.tournament;

public class Viking extends Fighter {
    public Viking() {
        super(120, new Weapon(WeaponType.AXE, 6));
    }

    @Override
    public Viking equip(String item) {
        if ("buckler".equals(item)) {
            this.buckler = new Buckler();
        }
        return this;
    }

    @Override
    public String toString() {
        return "Viking";
    }

}
