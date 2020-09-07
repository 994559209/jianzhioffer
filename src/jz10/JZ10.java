package jz10;

public class JZ10 {
    /**
     *f[n] = f[n-1] + f[n-2]，初始条件f[1] = 1, f[2] =2
     * @param target 2*target的矩形
     * @return 覆盖方法
     */
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int sum = 2;
        int oneNum = 1;
        for (int i = 3; i <= target; i++) {
            sum = sum + oneNum;
            oneNum = sum - oneNum;
        }
        return sum;
    }
}
