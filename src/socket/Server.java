package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket：客户端输入三角形三边，服务端计算返回三角形面积
 *
 * @author MicroLOONG
 */
public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        while (true) {
            try {
                try {
                    serverSocket = new ServerSocket(8080);
                } catch (IOException e) {
                    System.out.println("Listening to Port 8080...");
                }
                try {
                    // accept() 可能产生 'java.lang.NullPointerException'
                    assert serverSocket != null;
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    System.out.println("Waiting For Client...");
                }
                if (socket != null) {
                    // 内部类中要求 socket 为 final
                    Socket finalSocket = socket;
                    // 创建线程，建议使用线程池
                    new Thread(() -> {
                        double[] arr = new double[3];
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(finalSocket.getInputStream()));
                            PrintWriter printWriter = new PrintWriter(finalSocket.getOutputStream(), true);
                            for (int i = 0; i < arr.length; i++) {
                                double side = Double.parseDouble(bufferedReader.readLine());
                                arr[i] = side;
                            }
                            Triangle triangle = new Triangle(arr);
                            if (triangle.getArea() > 0) {
                                printWriter.println("三角形面积为：" + triangle.getArea());
                            } else {
                                printWriter.println("三角形三边输入有误");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            } catch (Exception e) {
                e.printStackTrace();
                // 退出循环
                return;
            }
        }
    }
}
