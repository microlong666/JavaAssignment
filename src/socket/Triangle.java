package socket;

/**
 * 三角形面积计算
 *
 * @author MicroLOONG
 */
public class Triangle {

    /**
     * 三边
     */
    double a;
    double b;
    double c;

    /**
     * 三角形三边各自取出
     *
     * @param arr 三角形边长数组
     */
    Triangle(double[] arr) {
        a = arr[0];
        b = arr[1];
        c = arr[2];
    }

    /**
     * 计算三角形面积
     *
     * @return 返回面积，如果不为三角形则返回0
     */
    public double getArea() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // 海伦公式
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }
}
