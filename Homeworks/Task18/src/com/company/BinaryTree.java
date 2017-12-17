package com.company;

public class BinaryTree  {
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

    public void add(int element) {
      if (root == null) {
          Node first = new Node(element);
          root = first;

      } else {
      }
    }

     public void addHelper(int element) {          currentNode = root;
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


    public void preOrderTravel(Node root) {
       if (root != null) {
           System.out.println(root.value);
           preOrderTravel(root.leftDescendent);
           preOrderTravel(root.rightDescendent);
       } else {
           return;
       }
    }


    public void prefix() {

    }


    public void infix() {

    }
}
