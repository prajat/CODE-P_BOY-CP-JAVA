public static  Node insert(Node head,int data) {
        //Complete this method
        Node node=new Node(data);
        if(head==null)
        {
            
            head=node;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        return head;
        
        
    }