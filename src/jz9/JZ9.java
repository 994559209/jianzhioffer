package jz9;

public class JZ9 {
    /**
     * 测试main函数
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new JZ9().JumpFloorII(3));
    }

    /**
     *同斐波那契
     * @param target 台阶数
     * @return 解法数
     */
//    public   int JumpFloorII(int target) {
//        if (target <= 1) {
//            return 1;
//        }
//        int sum = 0;
//        int oneNum = 1;
//        for (int i = 2; i <= target; i++) {
//            sum = oneNum << 1;
//            oneNum = sum;
//        }
//        return sum;
//    }

    /**
     * 2的n-1次方
     * @param target 台阶数
     * @return 解法数
     */
//    public  static int JumpFloorII(int target) {
//        if (target <= 1) {
//            return 1;
//        }
//        return (int) Math.pow(2,target-1);
//    }

    /**
     * 更简单写法
     * @param target 台阶数
     * @return 解法数
     */
    public int JumpFloorII(int target) {
        return 1<<(target-1);
    }
}
