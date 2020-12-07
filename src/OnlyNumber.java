import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 剔除一个字符串中的全部非数字字符
 *
 * @author MicroLOONG
 */

public class OnlyNumber {

    public static void main(String[] args) {
        // 所有非数字字符
        String regex = "\\D";

        System.out.print("Input a string: ");
        String string = new Scanner(System.in).next();
        // 使用输入的字符串初始化匹配对象
        Matcher matcher = Pattern.compile(regex).matcher(string);
        // 输出纯数字
        System.out.println(matcher.replaceAll(""));
    }
}
