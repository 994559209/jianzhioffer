package jz7;

public class JZ7 {
    /**
     * 暴力递归解法
     * @param n
     * @return
     */
//    public int Fibonacci(int n) {
//        if(n<=1){
//            return n;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);
//    }

    /**
     * 优化递归
     * @param n
     * @return
     */
//    public int Fibonacci(int n) {
//        int[] ans = new int[40];
//        ans[0] = 0;
//        ans[1] = 1;
//        for (int i = 2; i < 40; i++) {
//            ans[i] = ans[i - 1] + ans[i - 2];
//        }
//        return ans[n];
//    }

    /**
     * 减少空间复杂度
     *
     * sum 存储第 n 项的值
     * oneNum 存储第 n-1 项的值
     * twoNum 存储第 n-2 项的值
     * @param n
     * @return
     */
//    public int Fibonacci(int n) {
//        if (n<=1){
//            return n;
//        }
//        int sum=0;
//        int oneNum=1;
//        int twoNum=0;
//        for (int i = 2; i <= n; i++) {
//            sum=oneNum+twoNum;
//            twoNum=oneNum;
//            oneNum=sum;
//        }
//        return sum;
//    }

    /**
     * n-1项 可以通过 n项 - n-2项
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 1;
        int oneNum = 0;
        for (int i = 2; i <= n; i++) {
            sum = sum + oneNum;
            oneNum = sum - oneNum;
        }
        return sum;
    }
}
