public class stack
{
    private int stack[]=new int[10];
    private int top=-1;
    public void push(int n)
    {
        if(top==9)
        {
            System.out.println("stack is full");
        }
        else
        {
            stack[++top]=n;
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("tack is empty");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]);
        }
    }
    public static void main(String args[])
    {
        stack obj=new stack();
        for(int i=0;i<10;i++)
        {
            obj.push(i);
        }
        obj.pop();
        obj.display();
    }   
}
