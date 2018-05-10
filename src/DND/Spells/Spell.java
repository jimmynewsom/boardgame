package DND.Spells;

import DND.Actors.Actor;

//not sure whether to use an interface or an abstract classes
//also not sure whether to extend the class or use some kind of factory
//edit: apparently this is the right way to do this. this is kind of the Command pattern

public abstract class Spell {

    //easy shortcut. later spells can have targets & locations, when I change the UI
    public abstract void use(Actor[] target_s);
}
