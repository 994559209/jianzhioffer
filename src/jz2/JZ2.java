package jz2;

public class JZ2 {

    //public String replaceSpace(StringBuffer str) {
    //       return str.toString().replace(" ","%20");
    //    }

    /**
     *替换空格
     *在当前字符串上进行从后往前的替换
     *
     *先计算替换后的字符串需要多大的空间，并对原字符串空间进行扩容；
     *从后往前替换字符串的话，每个字符串只需要移动一次；
     *如果从前往后，每个字符串需要多次移动，效率较低。
     * @param str 输入的字符串
     * @return 输出替换完成的字符串
     */
    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spacenum++;
            }
        }
        int oldLength = str.length();
        int oldIndex = oldLength - 1;
        int newLength = oldLength + spacenum * 2;
        str.setLength(newLength);
        int newIndex = newLength - 1;
        for (; oldIndex >= 0 && oldLength < newLength; oldIndex--) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
        }
        return str.toString();
    }
}
