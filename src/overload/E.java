package overload;

/**
 * 习题6：继承中重载方法
 *
 * @author MicroLOONG
 */

public class E {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.f(3, 5));
        System.out.println(b.f(3.0, 5.0));
    }
}




