package leecode;

public class _42_trap {

    //脑子不够用打扰了
    public static int trap(int[] height) {
        int sum = 0;
        int max = 0;

        //求最高
        for (int i = 0; i < height.length; i++)
            if (height[i] > max) max = height[i];

        //一层层扫描
        for (int i = 1; i <= max; i++) {
            boolean isStart = false;
            //每层的所有水
            int temp_sum = 0;
            //算每层中有多少水，value为
            for (int value : height) {
                //核心判断条件***
                if (isStart && value < i) temp_sum++;

                if (value >= i) {
                    sum += temp_sum;
                    temp_sum = 0;
                    isStart = true;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(nums));
    }
}
