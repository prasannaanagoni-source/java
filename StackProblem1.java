import java.util.*;
class StackProblem1{
    public static int[]nextGreaterEle(int[] arr){
        Stack<Integer>stack=new Stack<Integer>();
        int n=arr.length;
        int[]res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!(stack.isEmpty())&& stack.peek()<=arr[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String args[]){
        int[]arr={3,8,13,45};
        int[]res=nextGreaterEle(arr);
        System.out.println(Arrays.toString(res));
    }
}