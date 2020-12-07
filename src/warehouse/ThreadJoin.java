package warehouse;

/**
 * 线程联合
 *
 * @author MicroLOONG
 */
public class ThreadJoin implements Runnable {

    String driverName = "运货司机";
    String shipperName = "装运工";
    String managerName = "仓库管理员";

    Thread driver;
    Thread shipper;
    Thread manager;

    /**
     * 构造方法：创建线程
     */
    ThreadJoin() {
        driver = new Thread(this);
        shipper = new Thread(this);
        manager = new Thread(this);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals(driverName)) {
            System.out.println("运货司机等待装运工完成工作...");
            try {
                // 启动装运工线程，并联合装运工
                shipper.start();
                shipper.join();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("运货司机开车");
        } else if (name.equals(shipperName)) {
            System.out.println("装运工等待仓库管理员打开仓库...");
            try {
                // 启动仓管员线程，并联合仓管员
                manager.start();
                manager.join();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("装运工开始搬运货物");
        } else if (name.equals(managerName)) {
            System.out.println("仓库管理员去打开仓库");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("仓库管理员打开了仓库");
        }
    }
}
