package binaryTree;


public class BinaryTree {

	private BinaryNode root;

	public BinaryTree(BinaryNode root) {
		this.root = root;
	}


	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public boolean isBST(){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}


	private boolean	isBST(BinaryNode node, int min, int max) {
		if(node == null) return true;
		if(node.getData() > min && node.getData() < max 
				&& isBST(node.getLeft(), min, Math.min(node.getData(), max))
				&& isBST(node.getRight(), Math.max(node.getData(), min), max))
			return true;
		else
			return false;
	}

}
