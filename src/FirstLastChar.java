import java.util.Scanner;

/**
 * 使用 charAt() 方法得到一个字符串中的第一个和最后一个字符
 *
 * @author MicroLOONG
 */

public class FirstLastChar {

    public static void main(String[] args) {
        System.out.print("Input a string: ");
        String string = new Scanner(System.in).next();
        System.out.println("First character: " + string.charAt(0));
        System.out.println("Last character: " + string.charAt(string.length() - 1));
    }
}
