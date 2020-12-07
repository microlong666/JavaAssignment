package geometry;

/**
 * 圆面积计算
 *
 * @author MicroLOONG
 */

public class Circle extends Geometry {

    /**
     * 半径
     */
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
