package advanced;


import java.util.ArrayList;
import java.util.List;

public class NewFactorial {
    /**
     * 正整数阶乘
     * in：6
     * out：7
     * 7=6*5/4+3-2*1
     */

    //ERROR
    //ERROR


    //ERROR


    public static int newFactorial(int num) {
        if (num < 3) return num;
        int sum = num;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = num - 1, count = 1; i > 0; i--, count++) {
            switch (count % 4) {
                case 1:
                    sum *= i;
                    if (i == 1) list.add(1);
                    break;
                case 2:
                    sum /= i;
                    list.add(sum);
                    break;
                case 3:
                    list.add(i);
                    break;
                case 0:
                    if (i == 1) list.add(i);
                    break;
            }
        }

        int finalsum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (i % 2 == 1) finalsum += list.get(i);
            if (i % 2 == 0) finalsum -= list.get(i);
        }
        return finalsum;
    }

    public static void main(String[] args) {
//        System.out.println("NewFactorial=0=" + newFactorial(0));
//        System.out.println("NewFactorial=6=" + newFactorial(3));
//        System.out.println("NewFactorial=7=" + newFactorial(4));
//        System.out.println("NewFactorial=7=" + newFactorial(5));

        System.out.println("NewFactorial=8=" + newFactorial(6));
//        System.out.println("NewFactorial=5=" + newFactorial(7));
//        System.out.println("NewFactorial=12=" + newFactorial(8));
//        System.out.println("NewFactorial=5=" + newFactorial(9));
        System.out.println("NewFactorial=12=" + newFactorial(10));
    }
}
