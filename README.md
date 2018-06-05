# boardgame
!!!Right now this code is a little messy. I know that. I'm rapidly prototyping a bunch of features, and I'll clean it up later.

Implementation of a role play game using open game content as described in the included Open Gaming License.
Practicing OOD.

It's an interesting project. Some people do this as a beginner project, but theres a lot of depth to it so I'm doing it now. For example, okay, yeah the player is an object, but how do you represent races and classes? Are they instances of race and class classes or subclasses? (I was thinking subclasses, because it's an is-a relationship) And races are immutable, so I think I should use a factory for those, but classes are not, because I need to save spell lists and subclasses inside the classes. What about monsters? They could all be subclasses, but maybe I should use some kind of builder instead? So yeah, it's a pretty good practice problem for OOD.

Also super frustrating, because there are some things I can't implement without making limiting choices, but I suppose that's what it is.

I'm not sure this is the best way to show recruiters I know how to code, so I think I should probably have a few other projects going too. But I'm planning on gradually adding features to this thing, probably making some sort of text-based JavaFX game.
