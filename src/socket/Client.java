package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Socket：客户端输入三角形三边，服务端计算返回三角形面积
 *
 * @author MicroLOONG
 */
public class Client {

    /**
     * 控制循环输入三次
     */
    static final int NUM = 3;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Connection Established.");

            System.out.println("输入三角形的三边边长：");
            double side;
            boolean flag = true;
            do {
                for (int i = 1; i < NUM + 1; i++) {
                    try {
                        side = Double.parseDouble(reader.readLine());
                        printWriter.println(side);
                        flag = false;
                    } catch (NumberFormatException e) {
                        System.out.println("输入异常，请重新输入：");
                        // 倒退重新输入
                        i--;
                    }
                }
            } while (flag);
            System.out.println(bufferedReader.readLine());

            bufferedReader.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Connection To Server Is Disabled.");
        }
    }
}
