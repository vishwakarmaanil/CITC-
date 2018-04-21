package BST;

class Node
{
	int data;
	Node left;
	Node right;

	public Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BST
{
	public static Node insert(Node root, int data) {
    if(root == null){
        return new Node(data);
    }
    else {
        Node cur;
        if(data <= root.data){
            cur = insert(root.left, data);
            root.left = cur;
        }
        else{
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}

	public static void visit(Node root)
	{
		if (root != null)
			System.out.println(root.data);
	}

	static void inorder(Node root)
	{
		if (root != null)
		{
			inorder(root.left);
			visit(root);
			inorder(root.right);
		}

	}

	public static void main(String args[])
	{
		Node root = null;
		root = insert(root, 15);
		root = insert(root, 11);
		root = insert(root, 12);
		root = insert(root, 111);
		root = insert(root, 14);
		root = insert(root, 5);
		root = insert(root, 5);
		inorder(root);

	}
}