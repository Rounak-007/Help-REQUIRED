public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void insertAt(int index,int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(index==0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void deleteAt(int index)
    {
        if(index==0)//delete 1st node
        {
            head=head.next;
        }
        else //delete any given position node
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("Deleted node "+n1.data);
            n1=null;
        }
    }
   public void getSizeofList()
    {
        Node node=head;
        int c=0;
        while(node.next!=null)
        {
            node=node.next;
            c++;
        }
        System.out.println("Count: "+(c+1));
    }
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data+" , ");
            node=node.next;
        }
        System.out.println(node.data);
    }
   public void reverse()
    {
        Node currnode=head;
        Node nxtnode=head;
        Node prevnode=null;
        while(nxtnode!=null)
        {
           nxtnode=nxtnode.next;
           currnode.next=prevnode;
           prevnode=currnode;
           currnode=nxtnode;
        }
        head=prevnode;
    }
    public void midNode()   //time-complexity=O(n)   space-complexity=O(1)
    {
        int l=0;
        Node middle=head;
        while(head!=null)
        {
            l=l+1;
            head=head.next;
        }
        int c=0;
        while(c<l/2)
        {
            middle=middle.next;
            c=c+1;
        }
        System.out.println(middle.data);
    }
    public void sortList()
    {
        // Node current will point to head
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return;
        }
        else 
        {
            while (current != null) 
            {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null)
                {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data)
                    {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}