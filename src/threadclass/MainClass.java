package threadclass;

/**
 * 将处于休眠状态的线程转换为runnable状态
 *
 * @author MicroLOONG
 */
public class MainClass {

    public static void main(String[] args) {
        ClassInterrupt classInterrupt = new ClassInterrupt();
        classInterrupt.teacher.setName("teacher");
        classInterrupt.student1.setName("student1");
        classInterrupt.student2.setName("student2");
        classInterrupt.student1.start();
        classInterrupt.student2.start();
        classInterrupt.teacher.start();
    }
}
