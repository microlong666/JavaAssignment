package geometry;

/**
 * 矩形面积计算
 *
 * @author MicroLOONG
 */

public class Rectangle extends Geometry {

    /**
     * 长和宽
     */
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
