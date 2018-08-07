public static Node insert(Node root,int data) {
        if(root==null)
        {
            return new Node(data);
        }

        if(root.data<data)
        {
            root.right=insert(root.right,data);
        }
        else if(root.data>data)
        root.left=insert(root.left,data);
        return root;
    	
    }