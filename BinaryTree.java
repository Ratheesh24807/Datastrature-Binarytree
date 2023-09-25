package com.BST;

xxxxx
public class BinaryTree<K extends Comparable <K>> {
	
	MyBinaryNode<K> root;
	
	public void add(K key) {
		
		this.root = this.addRecursive(root,key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {
		if(root == null) {
			return new MyBinaryNode<>(key);
		}else {
			int result = key.compareTo(root.key);
			if(result == 0) return root;
			if(result < 0) {
				root.left = addRecursive(root.left, key);
			}else {
				root.right = addRecursive(root.right, key);
			}
			return root;
		}
	}
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(MyBinaryNode<K> rootData) {
		return rootData == null ? 0 : 1 + this.getSizeRecursive(rootData.left)+this.getSizeRecursive(rootData.right);
	}
	public static void main(String args[]) {
	BinaryTree<Integer> binary = new BinaryTree<>();
	binary.add(56);
	binary.add(30);
	binary.add(70);
	
	int bstSize = binary.getSize();
	System.out.println("Size of binary tree is : "+bstSize);
	
	}

	public boolean searchKey(Object object, int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
