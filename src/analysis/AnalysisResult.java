package analysis;

import java.io.*;

/**
 * 上机实践：从文件读取并提取成绩，计算总分后写入文件
 *
 * @author MicroLOONG
 */

public class AnalysisResult {

    public static void main(String[] args) {
        File fRead = new File("src/analysis/score.txt");
        File fWrite = new File("src/analysis/scoreAnalysis.txt");
        try {
            // 创建指向文件 fRead 的输出流，从文件的末尾写入数据
            Writer out = new FileWriter(fWrite, true);
            // 使用 BufferedWriter 流读取文件
            BufferedWriter bufferedWriter = new BufferedWriter(out);
            // 创建指向文件 fWrite 的输入流
            Reader in = new FileReader(fRead);
            // 使用 BufferedReader 流写入文件
            BufferedReader bufferedReader = new BufferedReader(in);

            String string;
            while ((string = bufferedReader.readLine()) != null) {
                double totalScore = Analyze.getTotalScore(string);
                // 字符串拼接
                StringBuilder stringBuilder = new StringBuilder(string);
                stringBuilder.append(" 总分: ").append(totalScore);
                System.out.println(stringBuilder);
                // 按行写入拼接好的字符串
                bufferedWriter.write(String.valueOf(stringBuilder));
                bufferedWriter.newLine();
                // 刷新缓存
                bufferedWriter.flush();
            }
            // 关闭流
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
