package jz6;

public class JZ6 {
    /**
     * 3 4 5 1 2 （一般情况）
     * 1 2 3 4 5 / 2 2 2 2 2（容易想到的点）
     * 1 0 1 1 1 / 1 1 1 0 1（扑街）
     * 处于递增：low上移
     *
     * 处于递减：high下移（如果是high-1，则可能会错过最小值，因为找的就是最小值）
     *
     * 其余情况：low++缩小范围
     *
     * @param array 输入数组
     * @return 数组中最小数字
     */
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        int low = 0, high = array.length - 1;
        while (low < high) {
            if (array[low] < array[high]) {
                return array[low];
            }
            int mid = (low + high) >> 1;
            if (array[mid] > array[low]) {
                low = mid + 1;
            } else if (array[mid] < array[high]) {
                high = mid; // 如果是mid-1，则可能会错过最小值，因为找的就是最小值
            } else low++;  // 巧妙避免了offer书上说的坑点（1 0 1 1 1）
        }
        return array[low];
    }
}
