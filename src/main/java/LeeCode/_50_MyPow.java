package LeeCode;

public class _50_MyPow {

    /**
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 2.00000, 10
     * 输出: 1024.00000
     * 示例 2:
     * <p>
     * 输入: 2.10000, 3
     * 输出: 9.26100
     * 示例 3:
     * <p>
     * 输入: 2.00000, -2
     * 输出: 0.25000
     * 解释: 2-2 = 1/22 = 1/4 = 0.25
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
        int N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (int i = N; i > 0; i /= 2) {
            if ((i % 2) == 1)
                ans = ans * current_product;
            current_product = current_product * current_product;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("MyPow");
        System.out.println(pow3(2, 9));
    }

}
