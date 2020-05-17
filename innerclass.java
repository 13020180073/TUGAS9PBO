class A {
    class B {
        void sesuatuDiKelasB() {
            System.out.println("Hello, ini di method kelas B");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.sesuatuDiKelasB();
    }
}

