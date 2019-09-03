package Advanced;

public class ZJTD03 {
    //https://www.nowcoder.com/test/16516564/summary

    /**
     * 小包最近迷上了一款叫做雀魂的麻将游戏，但是这个游戏规则太复杂，小包玩了几个月了还是输多赢少。
     * 于是生气的小包根据游戏简化了一下规则发明了一种新的麻将，只留下一种花色，并且去除了一些特殊和牌方式（例如七对子等），具体的规则如下：
     * <p>
     * 总共有36张牌，每张牌是1~9。每个数字4张牌。
     * 你手里有其中的14张牌，如果这14张牌满足如下条件，即算作和牌
     * 14张牌中有2张相同数字的牌，称为雀头。
     * 除去上述2张牌，剩下12张牌可以组成4个顺子或刻子。顺子的意思是递增的连续3个数字牌（例如234,567等），刻子的意思是相同数字的3个数字牌（例如111,777）
     * <p>
     * 例如：
     * 1 1 1 2 2 2 6 6 6 7 7 7 9 9 可以组成1,2,6,7的4个刻子和9的雀头，可以和牌
     * 1 1 1 1 2 2 3 3 5 6 7 7 8 9 用1做雀头，组123,123,567,789的四个顺子，可以和牌
     * 1 1 1 2 2 2 3 3 3 5 6 7 7 9 无论用1 2 3 7哪个做雀头，都无法组成和牌的条件。
     * <p>
     * 现在，小包从36张牌中抽取了13张牌，他想知道在剩下的23张牌中，再取一张牌，取到哪几种数字牌可以和牌。
     * 输入描述:
     * 输入只有一行，包含13个数字，用空格分隔，每个数字在1~9之间，数据保证同种数字最多出现4次。
     * <p>
     * 输出描述:
     * 输出同样是一行，包含1个或以上的数字。代表他再取到哪些牌可以和牌。若满足条件的有多种牌，请按从小到大的顺序输出。若没有满足条件的牌，请输出一个数字0
     * <p>
     * 输入例子1:
     * 1 1 1 2 2 2 5 5 5 6 6 6 9
     * <p>
     * 输出例子1:
     * 9
     * <p>
     * 例子说明1:
     * 可以组成1,2,6,7的4个刻子和9的雀头
     * <p>
     * 输入例子2:
     * 1 1 1 1 2 2 3 3 5 6 7 8 9
     */

//    import java.util.*;
//
//    public class Main {
//
//        private void sln() {
//            Scanner sc = new Scanner(System.in);
//            int[] state = new int[9], helpArr = new int[9];
//            ArrayList<Integer> res = new ArrayList<>();
//            for (int i = 0; i < 13; i++) {
//                int num = sc.nextInt();
//                state[num - 1]++;
//            }
//            for (int i = 0; i < 9; i++) {
//                if (state[i] < 4) {
//                    int num = i + 1;
//                    System.arraycopy(state, 0, helpArr, 0, 9);
//                    helpArr[i]++;
//                    if (canHu(helpArr, 14, false)) res.add(num);
//                }
//            }
//            if (res.isEmpty()) System.out.println(0);
//            else {
//                StringBuffer sbf = new StringBuffer();
//                sbf.append(res.get(0));
//                for (int i = 1; i < res.size(); i++) {
//                    sbf.append(" ");
//                    sbf.append(res.get(i));
//                }
//                System.out.println(sbf.toString());
//            }
//        }
//
//        private boolean canHu(int[] arr, int total, boolean hasHead) {
//            if (total == 0) return true;
//            if (!hasHead) {
//                for (int i = 0; i < 9; i++) {
//                    if (arr[i] >= 2) {
//                        arr[i] -= 2;
//                        if (canHu(arr, total - 2, true)) return true;
//                        arr[i] += 2;
//                    }
//                }
//                return false;
//            } else {
//                for (int i = 0; i < 9; i++) {
//                    if (arr[i] > 0) {
//                        if (arr[i] >= 3) {
//                            arr[i] -= 3;
//                            if (canHu(arr, total - 3, true)) return true;
//                            arr[i] += 3;
//                        }
//                        if (i + 2 < 9 && arr[i + 1] > 0 && arr[i + 2] > 0) {
//                            arr[i]--;
//                            arr[i + 1]--;
//                            arr[i + 2]--;
//                            if (canHu(arr, total - 3, true)) return true;
//                            arr[i]++;
//                            arr[i + 1]++;
//                            arr[i + 2]++;
//                        }
//                    }
//                }
//            }
//            return false;
//        }
//
//        public static void main(String[] args) {
//            new Main().sln();
//        }
//    }

    /**

     * 给出一个算法思路吧，编程用C++或是Python可自己实现或参考其余评论的代码：
     * /*原理：如果该手牌胡牌，那么每个数字必然是，雀头、刻子、顺子的成员，
     * 编程实现：递归算法 ： 从最小的数字开始尝试，如果把其当成雀头成员，该数字划掉两个，并看余下的数字能否划空
     *                                 如果是刻子成员，该数字划掉三个，并查看余下数字能否划空
     *                                 如果是顺子成员，划掉该值 a ,a+1,a+2，并查看余下数字能否划空
     *             如果上述三种尝试都无法划空数组，说明存在数字无法是 雀头、刻子、顺子的成员， 即无法胡牌。
     *             （上述任何一种情况能划空数组，都可以胡牌）
     *
     */
    public static int quePai(int[] num) {


        return 1;
    }


    public static void main(String[] args) {
        int[] num = {1, 1, 1, 2, 2, 2, 6, 6, 6, 7, 7, 7, 9};
        int[] num2 = {1, 1, 1, 1, 2, 2, 3, 3, 5, 6, 7, 8, 9};
        int[] num3 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 7, 7, 9};

        System.out.println(quePai(num));
        System.out.println(quePai(num2));
        System.out.println(quePai(num3));
    }
}
