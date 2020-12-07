import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * PrintStream 类过滤输出流，以文本格式显示
 *
 * @author MicroLOONG
 */
public class E3 {

    public static void main(String[] args) {
        try {
            File file = new File("src/p.txt");
            FileOutputStream outputStream = new FileOutputStream(file);
            PrintStream printStream = new PrintStream(outputStream);
            printStream.print(12345.6789);
            printStream.println("How are you");
            printStream.println(true);
            printStream.close();
        } catch (IOException ignored) {
        }
    }
}
