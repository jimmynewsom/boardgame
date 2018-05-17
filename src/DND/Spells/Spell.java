package DND.Spells;

import DND.Actors.Actor;

//spells should be function objects

//spells can target 1 creature (including the caster), multiple creatures, a location. they can have a range
//they often have an area of effect

//range and area of effect sound like a bitch to implement, and already part of most engines, so ill skip em
//how to implement all those targeting methods sounds unpleasant though

public abstract class Spell {
    private String name;
    private int spellLevel, range, duration;
    private enum SchoolOfMagic {ABJURATION, CONJURATION, DIVINATION, ENCHANTMENT, EVOCATION, ILLUSION, NECROMANCY, TRANSMUTATION}
    private enum targeting_type {SELF, SINGLE_TARGET, MULT_TARGET, LOCATION}
    //private enum components {V, S, M}

    //easy shortcut. later spells can have targets & locations, when I change the UI
    public abstract void cast(Actor[] target_s);
}
