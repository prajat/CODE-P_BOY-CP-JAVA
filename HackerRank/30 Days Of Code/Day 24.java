public static Node removeDuplicates(Node head) {
      //Write your code here
        Node curr = head;
        
        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        
        return head;

    }