class A {
    public void mA() {
        System.out.println("in A ma()");
    }
}

class B extends A{
    public void mA() {
        System.out.println("in B ma()");
    }
    public void mB() {
        System.out.println("in B mb()");
    }
}

class C extends B{
    public void mC(){
        System.out.println("in C mc()");
    }
}

class Test {

    public static void main(String[] args) {
        A x = new B();
        B y = new B();
        B z = new C();

        x.mA();
        y.mA();
        z.mB();
        z.mA();
    }
}
