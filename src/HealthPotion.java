public class HealthPotion extends Consumable {
    void use(Character self){
        self.heal(20);
    }
}