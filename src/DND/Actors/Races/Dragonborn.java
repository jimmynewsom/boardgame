package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;
import DND.Actors.Monster;
import DND.Game;

public class Dragonborn extends Race {
    private Monster.Dragon.DragonColor color;
    private Game.DamageType resistanceType;

    public Dragonborn(Monster.Dragon.DragonColor color){
        super(Actor.Size.MEDIUM, 30, Actor.Vision.REGULARSIGHT, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.DRACONIC});
        this.color = color;
        switch (color){
            case BLACK:
                resistanceType = Game.DamageType.ACID;
                break;
            case BLUE:
                resistanceType = Game.DamageType.LIGHTNING;
                break;
            case BRASS:
                resistanceType = Game.DamageType.FIRE;
                break;
            case BRONZE:
                resistanceType = Game.DamageType.LIGHTNING;
                break;
            case COPPER:
                resistanceType = Game.DamageType.ACID;
                break;
            case GOLD:
                resistanceType = Game.DamageType.FIRE;
                break;
            case GREEN:
                resistanceType = Game.DamageType.POISON;
                break;
            case RED:
                resistanceType = Game.DamageType.FIRE;
                break;
            case SILVER:
                resistanceType = Game.DamageType.COLD;
                break;
            case WHITE:
                resistanceType = Game.DamageType.COLD;
                break;
        }
    }

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
    }

    /*
    strength +2, charisma +1
    size = medium
    speed = 30
    draconic ancestry & breath weapon
    resistance to type determined by ancestry
    languages = [draconic, common]
     */

}
