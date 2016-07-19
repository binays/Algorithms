import java.util.Scanner;

/**
 * Created by binay on 7/18/16.
 */
public class Stack {

    int length=10;
    int[] stack=new int[10];
    int stackTop=-1;
    public Stack()
    {


        Scanner scanner=new Scanner(System.in);
        int input=0;
        while(input!=4)
        {
            System.out.println("1.Push 2.Pop 3.StackTop 4.quit");
           input=scanner.nextInt();
            if(input==1)
            {
                System.out.println("Enter element to push:");
                int inp=scanner.nextInt();
                Push(inp);
            }
            else if(input==2)
            {
                Pop();
            }
            else if(input==3)
            {
                if(stackTop>=0)
                    System.out.println("Stack top element is:"+stack[stackTop]);
                else
                    System.out.println("Stack is empty");
            }

        }

    }

    public void Push(int i)
    {
        if(stackTop==length-1)
            System.out.println("Stack is full.Can't push.");
        else
        {
            stack[++stackTop]=i;

            System.out.println("Element "+stack[stackTop]+ " is pushed.");
        }
    }
    public void Pop()
    {
        int i;
        if(stackTop<0)
        {
            System.out.println("Stack is empty. Can't pop");
        }
        else
        {
            System.out.println("Popped element is:"+ stack[stackTop]);
            stackTop--;
        }
    }
}
