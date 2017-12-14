package com.iquestgroup.remotelearning.week2.rpg;

public class Wolf extends Actor {
    private static int instanceCount = 0;
    private static int packSize = 3;
    private static int packBonusDmg = 0;
    private String race;

    @Override
    public void specialAttack(Actor target) {
        System.out.println(race + " uses double attack on " + target.getName() + ".");
        target.receiveDamage((strength + packBonusDmg) * 2, this);
        if (!target.isDead()) {
            System.out.println(target.getName() + " HP: " + target.getStringHP());
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
        instanceCount--;
        if (instanceCount == packSize - 1) {
            packBonusDmg = 0;
            System.out.println("\nWolf pack broken!\n");
        }
    }

    public String toString() {
        return race +
                "\nHP: " + health + "/" + maxHealth +
                "\nStrength: " + strength +
                "\nArmor: " + armor + "\n";
    }

    public Wolf(int attackDamage, int armor, int maxHealth) {
        super(attackDamage, armor, maxHealth);
        race = this.getClass().getSimpleName();
        experienceBounty = 50;
        instanceCount++;
        System.out.println(this);
        if (instanceCount >= packSize) {
            packBonusDmg = 10;
            System.out.println("Wolves are in pack! (They deal +" + packBonusDmg + " damage)\n");
        }
    }
}
