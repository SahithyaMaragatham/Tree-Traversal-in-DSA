
class Node {
	int val;
	Node left, right;
	Node(int val)
	{
		this.val = val;
		left = right = null;
	}
}
public class TreeTraver {

	public static void Inorder(Node root)
	{
		if (root == null)
			return;
		Inorder(root.left);
		System.out.print(root.val + " ");
		Inorder(root.right);
	}
    public static void Preorder(Node root)
	{
		if (root == null)
			return;
		
		System.out.print(root.val + " ");
        Preorder(root.left);
		Preorder(root.right);
	}
    public static void Postorder(Node root)
	{
		if (root == null)
			return;
		Postorder(root.left);
        Postorder(root.right);
		System.out.print(root.val + " ");
		
	}
	public static void main(String[] args)
	{
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.right.right = new Node(6);
        root.left.left.right = new Node(9);
        root.left.left.right.left = new Node(1);
        root.right.left = new Node(7);
        root.right.right.left = new Node(8);
        TreeTraver tree=new TreeTraver();
		System.out.println("Inorder traversal  is: ");
		tree.Inorder(root);
        System.out.println();
        System.out.println("Preorder traversal is: ");
		tree.Preorder(root);
        System.out.println();
        System.out.println("Postorder traversal is: ");
		tree.Postorder(root);
	}
}