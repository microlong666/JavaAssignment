package threadclass;

/**
 * 将处于休眠状态的线程转换为runnable状态
 *
 * @author MicroLOONG
 */
public class ClassInterrupt implements Runnable {

    String teacherName = "teacher";
    String student1Name = "student1";
    String student2Name = "student2";

    Thread teacher;
    Thread student1;
    Thread student2;

    /**
     * 构造方法：创建线程
     */
    ClassInterrupt() {
        teacher = new Thread(this);
        student1 = new Thread(this);
        student2 = new Thread(this);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        final int count = 3;

        if (name.equals(student1Name)) {
            try {
                System.out.println(name + " 想睡10分钟后再上课");
                // 休眠10分钟
                Thread.sleep(1000 * 60 * 10);
            } catch (InterruptedException e) {
                System.out.println(name + " 被 teacher吵醒了");
            }
            // student1 叫醒 student2
            student2.interrupt();
        } else if (name.equals(student2Name)) {
            try {
                System.out.println(name + " 想睡1小时后再上课");
                // 休眠1小时
                Thread.sleep(1000 * 60 * 60);
            } catch (InterruptedException e) {
                System.out.println(name + " 被 student1吵醒了");
            }
        } else if (name.equals(teacherName)) {
            for (int i = 0; i < count; i++) {
                System.out.println("上课");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // teacher 叫醒 student1
            student1.interrupt();
        }
    }
}
