package DND.Spells;

import DND.Actors.Actor;

/*
spells should be function objects (command pattern)

spells can target 1 creature (including the caster), multiple creatures, or a location
I should have 3 subclasses of spell for each kind of input (Item 20: Prefer class hierarchies to tagged classes)
*/

public abstract class Spell {
    private String name;
    private int spellLevel, range, duration;
    private enum SchoolOfMagic {ABJURATION, CONJURATION, DIVINATION, ENCHANTMENT, EVOCATION, ILLUSION, NECROMANCY, TRANSMUTATION}
    private enum targeting_type {SELF, SINGLE_TARGET, MULT_TARGET, LOCATION}
    //private enum components {V, S, M}

    //easy shortcut. later spells can have targets & locations, when I change the UI
    public abstract void cast(Actor[] target_s);
}
