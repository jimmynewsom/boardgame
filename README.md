# boardgame
Implementation of a role play game using open game content as described in the included Open Gaming License.
practicing OOD and TDD.

its an interesting OOD problem. like, each character should be an object right? But then within each character race and class should also be objects.
Except maybe I only want a single static instance of each race and class and map to them with enums, might be more efficient. Every class uses the same moves right?
And maybe the classes should be interfaces, because classes determine what your character can do (essentially verbs/methods)

and then on top of that what should be public and what should be private, and whats better for encapsulation and whats better for readability (Ive been doing a lot of javascript lately).

its an interesting project, and there's lots of ways to do it, and I haven't figured out the best one yet. I plan on gradually tweaking this over time while I work on other things.

The first version of this will be text based, later versions might use JavaFX and a GUI.