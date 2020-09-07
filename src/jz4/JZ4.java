package jz4;

import java.util.Arrays;

public class JZ4 {
    public static void main(String[] args) {
        TreeNode treeNode = new JZ4().reConstructBinaryTree(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
        System.out.println(treeNode.val);
    }

    /**
     *重构二叉树
     *
     *根据前序序列第一个结点确定根结点
     *根据根结点在中序序列中的位置分割出左右两个子序列
     *对左子树和右子树分别递归使用同样的方法继续分解
     *
     * @param pre 前序遍历序列
     * @param in 中序遍历序列
     * @return 重构的二叉树
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i <in.length ; i++) {
            if (in[i]==pre[0]) {
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                break;
            }
        }
        return root;
    }
}
