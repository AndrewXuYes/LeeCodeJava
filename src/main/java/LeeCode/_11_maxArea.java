package LeeCode;

public class _11_maxArea {
    public static int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxarea = Math.max((j - i) * (Math.min(height[i], height[j])), maxarea);
            }
        }
        return maxarea;
    }


    public static int maxArea2(int[] height) {
        int maxarea = 0;
        int i = 0, j = height.length-1;
        while (j > i) {
            maxarea = Math.max((j - i) * (Math.min(height[i], height[j])), maxarea);
            if (height[j] > height[i]) i++;
            else j--;
        }
        return maxarea;
    }

    public static void main(String[] args) {

    }
}
