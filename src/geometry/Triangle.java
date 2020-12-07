package geometry;

/**
 * 三角形面积计算
 *
 * @author MicroLOONG
 */
public class Triangle extends Geometry {

    /**
     * 三边
     */
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        // 海伦公式
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
