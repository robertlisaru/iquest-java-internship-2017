package com.iquestgroup.remotelearning.week2.rpg;

public class SuperHedgehog extends Actor {
    private String race;

    @Override
    public void specialAttack(Actor target) {
        System.out.println(race + " blasts spikes at " + target.getName() + ".");
        target.receiveDamage(100, this);
        if (!target.isDead()) {
            System.out.println(target.getName() + " HP: " + target.getStringHP());
        }
    }

    @Override
    public void receiveDamage(int damage, Actor attacker) {
        int effectiveDamage = damage > armor ? (damage - armor) : 0;
        health -= effectiveDamage;
        System.out.println(getName() + " receives " + effectiveDamage + " damage.");
        System.out.println(attacker.getName() + " is stung by SuperHedgehog's pointy spikes.");
        attacker.receiveDamage(25, this);
        if (health < 1) {
            die();
        }
    }

    @Override
    public String getName() {
        return race;
    }

    @Override
    public void die() {
        dead = true;
        System.out.println(race + " dies.");
    }

    public String toString() {
        return race +
                "\nHP: " + health + "/" + maxHealth +
                "\nStrength: " + strength +
                "\nArmor: " + armor + "\n";
    }

    SuperHedgehog(int attackDamage, int armor, int maxHealth) {
        super(attackDamage, armor, maxHealth);
        race = this.getClass().getSimpleName();
        experienceBounty = 80;
        System.out.println(this);
    }
}
