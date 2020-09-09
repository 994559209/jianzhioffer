package jz12;

public class JZ12 {
    /**
     * 调用Math函数
     * @param base
     * @param exponent
     * @return
     */
//    public double Power(double base, int exponent) {
//        if (base == 0) {
//            return 0.0;
//        }
//        if (exponent == 0) {
//            return 1;
//        }
//        return Math.pow(base, exponent);
//    }

    /**
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        Math.pow(2,2);
        boolean flag = exponent < 0;
        if (flag) {
            exponent = -exponent;
        }
        double result = getPower(base, exponent);
        return flag ? 1 / result : result;
    }

    public static double getPower(double base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        double ans = getPower(base, exp >> 1);
        ans *= ans;
        if ((exp & 1) == 1) {
            ans *= base;
        }
        return ans;
    }
}

