package com.iquestgroup.remotelearning.week2.rpg;

public class Hero extends Actor {
    private String name = new String();
    private int level = 1;
    private int experience = 0;
    private int nextLevelExperience = 100;

    @Override
    public void basicAttack(Actor target) {
        System.out.println(name + " attacks " + target.getName() + ".");
        target.receiveDamage(strength, this);
        if (!target.isDead()) {
            System.out.println(target.getName() + " HP: " + target.getStringHP());
        } else {
            experience += target.getExperienceBounty();
            System.out.println(getName() + " +" + target.getExperienceBounty() + "exp");

            if (experience >= nextLevelExperience) {
                levelUP();
            }
        }
    }

    private void levelUP() {
        level++;
        strength += 3 * level;
        armor += 2 * level;
        maxHealth += 10 * level;
        nextLevelExperience *= 1.5;
        System.out.println("\n" + getName() + " level UP!  Next level at: " +
                nextLevelExperience + "exp" + "\n" + this);
    }

    @Override
    public void specialAttack(Actor target) {
        System.out.println(name + " karate kicks " + target.getName() + ".");
        target.receiveDamage(strength + 100, this);
        if (!target.isDead()) {
            System.out.println(target.getName() + " HP: " + target.getStringHP());
        } else {
            experience += target.getExperienceBounty();
            System.out.println(getName() + " +" + target.getExperienceBounty() + "exp");

            if (experience >= nextLevelExperience) {
                levelUP();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void die() {
        dead = true;
        System.out.println(name + " dies.");
    }

    @Override
    public String toString() {
        return name + "   Level " + level +
                "\nHP: " + health + "/" + maxHealth +
                "\nStrength: " + strength +
                "\nArmor: " + armor + "\n";
    }

    public Hero(int attackDamage, int armor, int maxHealth, String name) {
        super(attackDamage, armor, maxHealth);
        this.name = name;
        System.out.println(this);
    }
}
