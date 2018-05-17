# boardgame
!!!Right now this code is a mess. I know that. I'm rapidly prototyping a bunch of features, and I'll clean it up later.

Implementation of a role play game using open game content as described in the included Open Gaming License.
practicing OOD

its an interesting project, and there's lots of ways to do it, and I haven't figured out the best one yet. Some people do this as a beginner project, but theres a lot of depth to this problem

one good thing about it is I need to implement a logical system that changes and evolves over time, like adding features to an existing codebase
I plan on gradually tweaking this over time while I work on other things.

one challenge is that DND with humans is infinitely extensible. Like, since people are smart, they can take the rules and add a new rule or an exception to a rule at any time.
kind of like, if we were playing, and we decided "maybe it would be cool if it worked like this", so we change it and make that the rule
its a cool idea for a game, but hard to implement as a program. maybe i should use a different language with first class functions? things to consider


The first version of this will be text based, later versions might use JavaFX and a GUI or Unity.

Problem #1: so, encountered an issue. more conceptual than coding. If I want to make the fighting as detailed as possible, and avoid cutting corners like using a tile system or something,
then I need a visual representation of the game. Not impossible, I could pick an engine and let it do most of the work for me. Need to find models and stuff, but doable
But, one of the best parts of dnd is in its storytelling potential and the way people use their imaginations. So, the more concrete I make things, the less they get to imagine / decide for themselves.

I want the game to be be story driven and the visuals to play a supporting role.

I think for practical purposes I should use a grid system with tiles. and maybe add spell effects later