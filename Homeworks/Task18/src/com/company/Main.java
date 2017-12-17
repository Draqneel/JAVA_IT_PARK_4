package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.add(20);
        tree.add(45);
        tree.add(55);
        tree.add(5);
        tree.add(10);
        tree.preOrderTravel(tree.root);
    }
}
