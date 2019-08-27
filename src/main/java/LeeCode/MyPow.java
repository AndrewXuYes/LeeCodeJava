package LeeCode;

public class MyPow {

    /**
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
     *
     * 示例 1:
     *
     * 输入: 2.00000, 10
     * 输出: 1024.00000
     * 示例 2:
     *
     * 输入: 2.10000, 3
     * 输出: 9.26100
     * 示例 3:
     *
     * 输入: 2.00000, -2
     * 输出: 0.25000
     * 解释: 2-2 = 1/22 = 1/4 = 0.25
     *
     */
    public static double pow(double x, int n) {
        return pow(x, n);
    }

    public static double pow2(double x, int n) {
        int N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        for (long i = 0; i < N; i++)
            ans = ans * x;
        return ans;
    }

    public static double pow3(double x, int n) {
        return pow(x, n);
    }

}
