package TreeConversion.services;

public class Driver {
	public Node node;

	public static void main(String[] args) {
			
				
			Driver tree= new Driver();
			tree.node=new Node(50);
			tree.node.left=new Node(30);
			tree.node.right=new Node(60);
			tree.node.left.left=new Node(10);
			tree.node.right.left=new Node(55);
			
				
			
			TreeConversion treeConversion=new TreeConversion();
			treeConversion.bstToSkewedConversion(tree.node,0);
			treeConversion.printSkewedTree();
}
}
