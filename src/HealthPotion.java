public class HealthPotion extends Consumable {
    void consume(Character self){
        if(hp + 20 > maxHealth)
            hp = maxHealth;
        else
            hp =+ 20;
    }
}