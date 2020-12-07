/**
 * 两个 for 循环分别输出大写字母和小写字母
 *
 * @author MicroLOONG
 */

public class Alphabet {

//    【 只需一个 for 循环解决方法 】
//    【1. 单例设计模式 - 饿汉式】
//    /**
//     * 不允许该类被实例化
//     */
//    private Alphabet() {
//    }
//
//    private static Alphabet instance = new Alphabet();
//
//    public static Alphabet getInstance(){
//        return instance;
//    }
//
//    public void outputAlphabet(char firstLetter, char lastLetter) {
//        for (char letter = firstLetter; letter <= lastLetter; letter++) {
//            System.out.print(letter);
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        // 获取唯一对象
//        Alphabet alphabet = Alphabet.getInstance();
//        alphabet.outputAlphabet('overload.A', 'Z');
//        alphabet.outputAlphabet('a', 'z');
//    }
//
//    【2. 构造方法】
//    /**
//     * 构造方法
//     * @param firstLetter 首字母
//     * @param lastLetter 末字母
//     */
//    public Alphabet(char firstLetter, char lastLetter) {
//        for (char letter = firstLetter; letter <= lastLetter; letter++) {
//            System.out.print(letter);
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        new Alphabet('overload.A', 'Z');
//        new Alphabet('a', 'z');
//    }

    public static void main(String[] args) {
        // 大写字母
        char firstCapitalLetter = 'A';
        char lastCapitalLetter = 'Z';
        for (char letter = firstCapitalLetter; letter <= lastCapitalLetter; letter++) {
            System.out.print(letter);
        }
        System.out.println();

        // 小写字母
        char firstLowerCaseLetter = 'a';
        char lastLowerCaseLetter = 'z';
        for (char letter = firstLowerCaseLetter; letter <= lastLowerCaseLetter; letter++) {
            System.out.print(letter);
        }
    }
}
