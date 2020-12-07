/**
 * 输出全部大写英文字母
 *
 * @author MicroLOONG
 */

public class CapitalLetter {

    public static void main(String[] args) {
        CapitalLetter c = new CapitalLetter();
        c.capitalLetter1();
        c.capitalLetter2();
        c.capitalLetter3();
        c.capitalLetter4('A');
    }

    /**
     * 直接输出
     */
    public void capitalLetter1() {
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    /**
     * 循环输出
     */
    public void capitalLetter2() {
        final char firstLetter = 'A';
        final char lastLetter = 'Z';
        for (char letter = firstLetter; letter <= lastLetter; letter++) {
            System.out.print(letter);
        }
        System.out.println();
    }

    /**
     * 按 ASCII 码输出
     */
    public void capitalLetter3() {
        final int count = 26;
        final int firstLetter = 65;
        for (int i = 0; i < count; i++) {
            System.out.print((char) (firstLetter + i));
        }
        System.out.println();
    }

    /**
     * 递归输出
     *
     * @param letter 字母
     */
    public void capitalLetter4(char letter) {
        final char lastLetter = 'Z';
        if (letter <= lastLetter) {
            System.out.print(letter++);
            capitalLetter4(letter);
        }
    }
}
