package com.dsh.leetcode;

import java.util.Stack;

/** 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 例如：123->321  -123->-321
 * @author DSH
 * @date 2020/12/2
 * @description
 */
public class NumberReverse {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
        System.out.println(StringBufferReverse(-2147483648));
        System.out.println(bestReverse(-2147483648));
    }

    private static int bestReverse(int x) {
        int ans = 0;
        while (x!=0){
            int pop = x%10;
            if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&pop>Integer.MAX_VALUE%10)){
                return 0;
            }
            if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&pop<Integer.MIN_VALUE%10)){
                return 0;
            }
            ans = ans*10+pop;
            x /= 10;
        }
        return ans;
    }

    /**
     * StringBuffer字符串反转
     * @param x
     * @return
     */
    private static int StringBufferReverse(int x) {
        boolean minus = false;
        StringBuffer sb = new StringBuffer(String.valueOf(x)).reverse();
        String str = sb.toString();
        if (str.contains("-")){
            minus = true;
            str=str.replace("-","").trim();
        }
        long result = Long.parseLong(minus?"-"+str:str);
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

    /**
     * 利用栈的后进先出的特性实现反转
     * @param x
     * @return
     */
    public static int reverse(int x){
        boolean minus = false;
        Stack stack = new Stack();
        StringBuilder stringBuilder = new StringBuilder();
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            char c = (char) stack.pop();
            if(c=='-'){
                minus = true;
                continue;
            }
            stringBuilder.append(c);
        }
        String s1 = stringBuilder.toString();
        if (minus){
            s1 = "-"+s1;
        }
        long result = Long.parseLong(s1);
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

}
