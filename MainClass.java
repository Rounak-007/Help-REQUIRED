import java.util.*;
public class MainClass
{
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);
        char i;
        do
        {   
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter length of list:");
                    int n=sc.nextInt();
                    for(int x=0;x<n;x++)
                    {
                        System.out.println("Enter value:");
                        int a=sc.nextInt();
                        list.insert(a);
                    }
                    break;
                case 2:
                    list.insertAtStart(25);
                    System.out.println("linked list after entering a value at start:");
                    list.show();
                    break;
                case 3:
                    list.insertAt(2,55);
                    System.out.println("linked list after inserting 55 at 2nd position:");
                    list.show();
                    break;
                case 4:
                    list.deleteAt(2);
                    System.out.println("linked list after deleting value at 2nd position:");
                    list.show();
                    break;
                case 5:
                    System.out.println("The given linked list:");
                    list.show();
                    break;
                case 6:
                    System.out.println("Linked list size:");
                    list.getSizeofList();
                    break;
                case 7:
                    list.reverse();
                    System.out.println("The reversed list:");
                    list.show();
                    break;
                case 8:
                    System.out.println("The middle element:");
                    list.midNode();
                    break;
            }
            System.out.println("Continue?(y/n):");
            i=sc.next().charAt(0);
        }while(i=='y');
        
        //list.insert(18);
        //list.insert(45);
        //list.insert(12);

        /*list.sortList();
        System.out.println("the sorted list:");
        list.show();*/
    } 
}