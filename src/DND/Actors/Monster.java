package DND.Actors;

public class Monster extends Actor {
    public String monsterName;
    private enum monsterType {ABERRATIONS, BEASTS, CELESTIALS, CONSTRUCTS, DRAGONS, ELEMENTALS,
        FEY, FIENDS, GIANTS, HUMANOIDS, MONSTROSITIES, OOZES, PLANTS, UNDEAD}
    private int challengeRating, xp;



    void attack(Character player) {
        player.takeDamage(attack);
    }

    boolean takeDamage(int damage){
        hp =- damage;
        if(hp <= 0) {
            isAlive = false;
            return false;
        } else
            return true;
    }

    void specialAttack(Character player){
        System.out.println("special attack");
    }
}