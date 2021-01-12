/**
 * 水仙花数（每位的 3 次幂之和等于它本身的三位数）
 *
 * @author MicroLOONG
 */
public class NarcissisticNumber {

    final static int START = 100;
    final static int END = 1000;

    public static void main(String[] args) {
        for (int i = START; i < END; i++) {
            int unit = i / 100;
            int ten = i / 10 % 10;
            int hundred = i % 10;
            if (Math.pow(unit, 3) + Math.pow(ten, 3) + Math.pow(hundred, 3) == i) {
                System.out.println(i);
            }
        }
    }
}