public class B extends A {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        //a.m2();
    }

    public void m1() {
        System.out.println("I'm in m1 B");
    }

    public void m2() {
        System.out.println("I'm in m2 B");
    }
}