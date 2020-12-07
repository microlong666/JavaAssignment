package geometry;

/**
 * 计算面积和
 *
 * @author MicroLOONG
 */

public class Student {

    /**
     * 计算多个不同图形面积的和
     *
     * @param p 可变参数
     * @return sum 面积之和
     */
    public double area(Geometry... p) {
        double sum = 0;
        for (Geometry geometry : p) {
            sum = sum + geometry.getArea();
        }
        return sum;
    }
}
