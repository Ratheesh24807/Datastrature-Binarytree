package com.BST;

public class MyBinaryNode1<K extends Comparable <K>> {
K key;
MyBinaryNode<K> left;
MyBinaryNode<K> right;

public MyBinaryNode1(K key) {
	this.key = key;
	this.left = null;
	this.right = null;
}
}