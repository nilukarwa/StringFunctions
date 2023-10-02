public class B1 extends A {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }

    public void m1() throws IndexOutOfBoundsException {
        System.out.println("I'm in m1 B");
    }
}