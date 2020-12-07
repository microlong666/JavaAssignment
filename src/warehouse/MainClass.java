package warehouse;

/**
 * 线程联合
 *
 * @author MicroLOONG
 */
public class MainClass {

    public static void main(String[] args) {
        ThreadJoin threadJoin = new ThreadJoin();
        threadJoin.driver.setName("运货司机");
        threadJoin.shipper.setName("装运工");
        threadJoin.manager.setName("仓库管理员");
        threadJoin.driver.start();
    }
}
