public abstract class Monster {
    String type;
    private int hp, attack, defense;
    private boolean isAlive = true;

    Monster(String type, int hp, int attack, int defense){
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

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