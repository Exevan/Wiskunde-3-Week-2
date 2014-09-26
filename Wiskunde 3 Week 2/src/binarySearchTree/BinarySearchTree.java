package binarySearchTree;

public class BinarySearchTree{
	
	private class BinaryNode {
		public int data;
		public BinaryNode left, right;
			
		public BinaryNode(int data){
			this(data, null, null);
		}
		
		public BinaryNode(int data, BinaryNode leftChild, BinaryNode rightChild) {
			this.data = data;
			this.left = leftChild;
			this.right = rightChild;
		}	
	}
	
	
	private BinaryNode root;

	public BinarySearchTree(){
	}

	public BinaryNode getRoot() {
		return root;
	}
	
	public boolean lookup(int target){
		return lookup(root, target);
	}
	
	private boolean lookup(BinaryNode node, int target){
		if(node == null){
			return false;
		}		
		if(target == node.data){
			return true;
		} else if(target < node.data){
			return lookup(node.left, target);
		} else {	// target > node.getData()
			return lookup(node.right, target);
		}
	}
	
	public void insert(int data){
		// TODO implement
	}

}
