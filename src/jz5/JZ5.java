package jz5;

import java.util.Stack;

public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     *直接将int类型的元素插入stack1中
     * @param node int类型的元素
     */
    public void push(int node) {
        stack1.push(node);
    }

    /**
     * 当弹出时，当 stack2 不为空，弹出 stack2 栈顶元素
     * 如果 stack2 为空，将 stack1 中的全部数逐个出栈入栈 stack2
     * 再弹出 stack2 栈顶元素
     * @return stack2 栈顶元素
     */
    public int pop() {
        if (stack2.size()<=0){
            while (stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
