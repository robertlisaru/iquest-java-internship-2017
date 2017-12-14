package com.iquestgroup.remotelearning.week2.rpg;

public abstract class Actor {
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int armor;
    protected int experienceBounty;
    protected boolean dead = false;

    public void basicAttack(Actor target) {
        System.out.println(getName() + " attacks " + target.getName() + ".");
        target.receiveDamage(strength, this);
        if (!target.isDead()) {
            System.out.println(target.getName() + " HP: " + target.getStringHP());
        }
    }

    public void receiveDamage(int damage, Actor attacker) {
        int effectiveDamage = damage > armor ? (damage - armor) : 0;
        health -= effectiveDamage;
        System.out.println(getName() + " receives " + effectiveDamage + " damage.");
        if (health < 1) {
            die();
        }
    }

    public boolean isDead() {
        return dead;
    }

    public String getStringHP() {
        return health + "/" + maxHealth;
    }

    public int getExperienceBounty() {
        return experienceBounty;
    }

    public abstract void specialAttack(Actor target);

    public abstract String getName();

    public abstract void die();

    public Actor(int attackDamage, int armor, int maxHealth) {
        this.strength = attackDamage;
        this.armor = armor;
        this.maxHealth = this.health = maxHealth;
    }
}
