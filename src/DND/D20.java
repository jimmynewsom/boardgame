package DND;

import java.util.Random;

public class D20 {
    public static Random r = new Random();

    public static int rolld4() {
        return 1 + r.nextInt(4);
    }

    public static int rolld6(){
        return 1 + r.nextInt(6);
    }

    public static int rolld8(){
        return 1 + r.nextInt(8);
    }

    public static int rolld10(){
        return 1 + r.nextInt(10);
    }

    public static int rolld12(){
        return 1 + r.nextInt(12);
    }

    public static int rolld20(){
        return 1 + r.nextInt(20);
    }

    public static int rolld100(){
        return 1 + r.nextInt(100);
    }
}
