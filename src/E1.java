/**
 * @author MicroLOONG
 */

public class E1 {

    public static void main(String[] args) {
        Cry hello = new Cry() {
            @Override
            public void cry() {
                System.out.println("大家好，祝工作顺利！");
            }
        };
        hello.cry();
    }
}

class Cry {

    public void cry() {
        System.out.println("大家好");
    }
}
