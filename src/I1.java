interface I1 {
    public default void m1() {
        System.out.println("in I1.m1");
    }
}

interface I2 {
    public default void m1() {
        System.out.println("in I2.m2");
    }
}

class C1 implements I1, I2{

    @Override
    public void m1() {

    }
}