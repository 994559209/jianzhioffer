package jz1;

public class JZ1 {
    /**
     *二维数组中的查找
     *每一行都按照从左到右递增的顺序排序，
     *每一列都按照从上到下递增的顺序排序
     *
     *当 array[row][col] < target，由于 array[row][col] 已经是该行最大的元素，想要更大只有从列考虑，取值右移一位
     *当 array[row][col] > target，由于 array[row][col]已经是该列最小的元素，想要更小只有从行考虑，取值上移一位
     *当 array[row][col] = target，找到该值，返回 true
     * @param target 目标整数
     * @param array 二维数组
     * @return 二维数组是否包含该目标整数
     */
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
        //左小坐标
        int row = rows - 1;
        int col = 0;
        while (row>=0&&col<cols) {
            if (array[row][col]<target){
                col++;
            }else if (array[row][col]>target){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }
}
