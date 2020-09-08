package jz11;

public class JZ11 {
    /**
     * Integer.toBinaryString  int转换成二进制字符串
     * 如果一个整数不为0，那么这个整数至少有一位是1。
     * 如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，
     * 原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。
     * 其余所有位将不会受到影响。
     * 把一个整数减去1，再和原整数做与运算，
     * 会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，
     * 就可以进行多少次这样的操作
     * @param n 输入整数
     * @return 整数二进制中1的个数
     */
    public int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}

