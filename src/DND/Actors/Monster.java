package DND.Actors;

public class Monster extends Actor {
    public String monsterName;
    private enum creatureType {ABERRATIONS, BEASTS, CELESTIALS, CONSTRUCTS, DRAGONS, ELEMENTALS,
        FEY, FIENDS, GIANTS, HUMANOIDS, MONSTROSITIES, OOZES, PLANTS, UNDEAD}
    private int challengeRating;

    void specialAttack(Character player){
        System.out.println("special attack");
    }

    public static class Dragon extends Monster {
        public enum DragonColor {BLACK, BLUE, BRASS, BRONZE, COPPER, GOLD, GREEN, RED, SILVER, WHITE}
    }

    public static class MonsterBuilder {
    }
}