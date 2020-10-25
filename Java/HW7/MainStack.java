public class MainStack {
    public static void main(String[]args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(2);
        System.out.println(stack.isEmpty());
        stack.push(69);
        stack.push(306);
        stack.push(1);
        stack.push(15);

        System.out.println(stack.size());
        System.out.println(stack.peek());
        int i = stack.pop();
        System.out.println(i);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        while(!stack.isEmpty())
            stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.pop();

    }
}