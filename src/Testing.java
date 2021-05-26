

import java.util.Arrays;

public class Testing {


    public static void main(String[] args) {
        X x = new X();
        x.greet();
        ((Y)x).greet();
        ((Z)x).greet();

        }

    }

    class X {
    void greet(){
        System.out.println("Good morning");
    }
    }

class Y extends X {
    void greet(){
        System.out.println("Good afternoon");
    }
}


class Z extends Y {
    void greet(){
        System.out.println("Good night");
    }
}