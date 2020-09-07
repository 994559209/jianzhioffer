package jz8;

public class JZ8 {
    /**
     * 同斐波那契
     * @param target 台阶数
     * @return 跳法
     */
    public int JumpFloor(int target) {
        if ( target<= 1) {
            return target;
        }
        int sum = 1;
        int oneNum = 1;
        for (int i = 2; i <= target; i++) {
            sum = sum + oneNum;
            oneNum = sum - oneNum;
        }
        return sum;
    }
}
