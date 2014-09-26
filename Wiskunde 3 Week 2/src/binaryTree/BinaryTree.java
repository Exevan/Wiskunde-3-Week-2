package binaryTree;

import java.util.ArrayList;
import java.util.List;

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
		List<Integer> data = inorder(root, new ArrayList<Integer>());
		for(int i = 1; i < data.size(); i++) {
			if(data.get(i) <= data.get(i-1)) return false;
		}
		return true;
	}
	
	private List<Integer> inorder(BinaryNode node, List<Integer> data) {
		if(node.getLeft() != null)
			inorder(node.getLeft(), data);	
		data.add((Integer) node.getData());
		if(node.getRight() != null)
			inorder(node.getRight(), data);	
		return data;
	}
	

		
}
