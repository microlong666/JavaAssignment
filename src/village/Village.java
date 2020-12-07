package village;

/**
 * 上机实践：两个村庄共同拥有一片森林
 *
 * @author MicroLOONG
 */

class Village {
    /**
     * 森林中树木的数量
     */
    static int treeAmount;
    /**
     * 村庄的人数
     */
    int peopleNumber;
    /**
     * 村庄的名字
     */
    String name;

    Village(String s) {
        name = s;
    }

    void treePlanting(int n) {
        treeAmount = treeAmount + n;
        System.out.println(name + "植树" + n + "棵");
    }

    void fellTree(int n) {
        if (treeAmount - n >= 0) {
            treeAmount = treeAmount - n;
            System.out.println(name + "伐树" + n + "棵");
        } else {
            System.out.println("无树木可伐");
        }
    }

    static int lookTreeAmount() {
        return treeAmount;
    }

    void addPeopleNumber(int n) {
        peopleNumber = peopleNumber + n;
        System.out.println(name + "增加了" + n + "人");
    }
}
