import java.util.StringTokenizer;

/**
 * 上机实践：提取价格并计算总和，输出货品名称
 *
 * @author MicroLOONG
 */
public class E2 {

    public static void main(String[] args) {
        String s1 = "苹果：56.7圆，香蕉：12圆，芒果：19.8圆";
        String s2 = "酱油：6.7圆，精盐：0.8圆，榨菜：9.8圆";
        ComputePiece computePiece = new ComputePiece();

        double priceSum;
        String regex1 = "[^0-9.]+";
        String regex2 = "[0-9.]+圆";

        String s1Number = s1.replaceAll(regex1, "*");
        priceSum = computePiece.compute(s1Number, "*");
        System.out.printf("\"%s\"价格总和：\n%f圆\n", s1, priceSum);

        String s2Number = s2.replaceAll(regex1, "#");
        priceSum = computePiece.compute(s2Number, "#");
        System.out.printf("\"%s\"价格总和：\n%f圆\n", s2, priceSum);

        String temp = s2.replaceAll(regex2, "");
        temp = temp.replaceAll("：", " ");
        temp = temp.replaceAll("，", " ");
        System.out.println(temp);
    }
}

class ComputePiece {
    /**
     * 计算价格总和
     *
     * @param string    待解析的字符串
     * @param delimiter 分隔符
     * @return sum 总价格
     */
    double compute(String string, String delimiter) {
        StringTokenizer analyze = new StringTokenizer(string, delimiter);
        double sum = 0;
        double digitItem;
        while (analyze.hasMoreTokens()) {
            String str = analyze.nextToken();
            digitItem = Double.parseDouble(str);
            sum += digitItem;
        }
        return sum;
    }
}
