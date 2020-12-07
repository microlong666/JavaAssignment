package village;

/**
 * 上机实践：两个村庄与森林
 *
 * @author MicroLOONG
 */

public class MainClass {

    public static void main(String[] args) {
        Village zhaoZhuang, maJiaHeZhi;
        zhaoZhuang = new Village("赵庄");
        maJiaHeZhi = new Village("马家河子");
        // 初始化各村庄的人数
        zhaoZhuang.peopleNumber = 100;
        maJiaHeZhi.peopleNumber = 150;

        // 初始化森林树木的数量
        Village.treeAmount = 200;
        // 剩余树木的数量
        int leftTree = Village.treeAmount;
        System.out.println("森林中有 " + leftTree + " 棵树");

        // 赵庄植树50棵
        // 非法表达 "Village.treeAmount(50);"：非静态方法不能用类名调用
        zhaoZhuang.treePlanting(50);
        leftTree = Village.lookTreeAmount();
        System.out.println("森林中有 " + leftTree + " 棵树");

        // 马家河子砍树70棵
        maJiaHeZhi.fellTree(70);
        leftTree = Village.lookTreeAmount();
        System.out.println("森林中有 " + leftTree + " 棵树");

        // 赵庄人口增加12前后的人数
        System.out.println("赵庄的人口：" + zhaoZhuang.peopleNumber);
        zhaoZhuang.addPeopleNumber(12);
        System.out.println("赵庄的人口：" + zhaoZhuang.peopleNumber);

        // 马家河子人口增加10前后的人数
        System.out.println("马家河子的人口：" + maJiaHeZhi.peopleNumber);
        maJiaHeZhi.addPeopleNumber(10);
        System.out.println("马家河子的人口：" + maJiaHeZhi.peopleNumber);
    }
}
