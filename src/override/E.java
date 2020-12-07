package override;

/**
 * 习题7：重写方法（static 方法不能重写）
 *
 * @author MicroLOONG
 */

public class E {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.f(10.0, 8.0));
        System.out.println(B.g(3));
    }
}




