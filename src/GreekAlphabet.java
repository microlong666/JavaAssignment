import java.util.*;

/**
 * 猜数
 *
 * @author MicroLOONG
 */

public class GreekAlphabet {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.print("给你一个1至100之间的整数，请猜测这个数\n");
        int realNumber = random.nextInt(100) + 1;

        int yourGuess;
        System.out.print("输入你的猜测：");
        yourGuess = reader.nextInt();
        while (yourGuess != realNumber) {
            if (yourGuess > realNumber) {
                System.out.print("猜大了，再输入你的猜测：");
            } else {
                System.out.print("猜小了，再输入你的猜测：");
            }
            yourGuess = reader.nextInt();
        }
        System.out.println("猜对了！");
    }
}
