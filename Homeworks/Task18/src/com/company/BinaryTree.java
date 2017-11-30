package com.company;

public class BinaryTree implements Branchy {
    public Node root ;
    public Node currentNode;
    public Node temp;

    public BinaryTree() {
        this.root = null;
        this.currentNode = null;
    }

    private class Node {
        private int value;
        private Node lastDescendent;
        private Node leftDescendent;
        private Node rightDescendent;
        Node (int value){
            this.value = value;
            this.leftDescendent = null;
            this.rightDescendent = null;
            this.lastDescendent = null;
        }
        public Object getLeftDescendent(){
            return  leftDescendent;
        }

        public Object getRightDescendent(){
            return  rightDescendent;
        }

        public Object getLastDescendent(){
            return  lastDescendent;
        }

        public int getValue (){
            return value;
        }
    }
    @Override
    public void add(int element) {
      if (root == null) {
          Node first = new Node(element);
          root = first;

      } else {
          currentNode = root;
//          if (currentNode.value < element && currentNode.leftDescendent == null) {
//              Node newNode = new Node(element);
//              newNode.lastDescendent = currentNode;
//              return;
//          }
//          if (currentNode.value >= element && currentNode.rightDescendent == null) {
//              Node newNode = new Node(element);
//              currentNode.rightDescendent
//              newNode.lastDescendent = currentNode;
//              return;
//          }
          addHelper(element);
      }
    }

     public void addHelper(int element) {
        if (currentNode.value < element) {
            if(currentNode.leftDescendent != null) {
                temp = currentNode;
                currentNode = currentNode.leftDescendent;
                currentNode.lastDescendent = temp;
                addHelper(element);

            } else {
                Node newNode = new Node(element);
                currentNode.leftDescendent = newNode;
                newNode.lastDescendent = currentNode;
                return;
            }
        }

        if (currentNode.value >= element) {
            if (currentNode.rightDescendent != null) {
                temp = currentNode;
                currentNode = currentNode.rightDescendent;
                currentNode.lastDescendent = temp;
                addHelper(element);
            } else {
                Node newNode = new Node(element);
                currentNode.rightDescendent = newNode;
                newNode.lastDescendent = currentNode;
                return;
            }

        }
    }

    @Override
    public void postfix() {
       if (currentNode == null) {
           return;
       }
    }

    @Override
    public void prefix() {

    }

    @Override
    public void infix() {

    }
}
