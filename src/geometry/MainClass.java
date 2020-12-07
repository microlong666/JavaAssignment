package geometry;

/**
 * 上机实践：计算多个不同的图形面积之和
 *
 * @author MicroLOONG
 */

public class MainClass {

    public static void main(String[] args) {
        Student zhang = new Student();
        double area = zhang.area(new Rectangle(2, 3), new Circle(5.2), new Circle(12));
        System.out.printf("2个圆和1个矩形图形的面积和：\n%.3f\n", area);
        double area1 = zhang.area(new Triangle(5, 8, 10), new Circle(5.2), new Circle(12));
        System.out.printf("2个圆和1个三角形图形的面积和：\n%.3f", area1);
    }
}
