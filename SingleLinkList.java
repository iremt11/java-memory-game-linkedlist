import java.io.FileWriter;
import java.io.IOException;

public class SingleLinkList
{
    public Node head;

    public void add(Object data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head= newNode;
        }
        else {
            Node temp= head;
            while (temp.getLink()!=null)
            {
                temp=temp.getLink();
            }
            temp.setLink(newNode);
        }
    }

    public Node getHead() {
        return head;
    }

    public int size()
    {
        if(head==null)
        {
            return 0;
        }
        else {
            int count=0;
            Node temp= head;
            while(temp!= null)
            {
                temp=temp.getLink();
                count++;
            }
            return count;
        }
    }
    public void display()
    {
        if(head==null)
        {
            //System.out.println("List is empty.");
        }
        else {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.getData()+" ");
                temp=temp.getLink();
            }
        }
    }
    public void display2 (SingleLinkList SLL3, SingleLinkList SLL4)throws IOException {
        Node head = SLL4.getHead();
        Node head2 = SLL3.getHead();
        int cnt= 0;
        if (!(head == null)) {
            Node temp2 = head2;
            Node temp = head;
            FileWriter myWriter = new FileWriter("D:\\\\highscoretable.txt", false);
            while (temp != null && cnt < 12) {
                myWriter.write(String.format("%-12s %-6s\n", temp2.getData(), temp.getData()));
                System.out.print(String.format("%-12s %-6s\n", temp2.getData(), temp.getData()));
                temp2 = temp2.getLink();
                temp = temp.getLink();
                cnt++;
            }
            myWriter.close();
        } else {
            System.out.println("List is empty.");
        }
    }



    public Object delete(Object dataToDelete)
    {
        if(head==null)
        {
            //System.out.println("Linked list is empty.");
        }
        else {
            if(head.getData()==dataToDelete)
            {
                head=head.getLink();
            }
            Node temp=head;
            Node pervious= null;
            while(temp!= null)
            {
                if(temp.getData()==dataToDelete)
                {
                    pervious.setLink(temp.getLink());
                    temp=pervious;
                }
                pervious=temp;
                temp=temp.getLink();
            }
        }
        return dataToDelete;
    }
    public Object find(int nu)
    {
        Node temp=head;
        for(int i=0;i<nu;i++)
        {
            temp=temp.getLink();
        }
        Object retData=temp.getData();
        return retData;
    }

}
