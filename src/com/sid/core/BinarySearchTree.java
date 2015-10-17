package com.sid.core;

public class BinarySearchTree {

	Node root;
	
	public void addNode(int key,String name){
		
		Node newNode = new Node(key,name);
		
		if(root==null){
			root=newNode;
		}else{
			Node focusNode = root;
			Node parent;
			
			while(true){
				parent=focusNode;
				
				if(key<focusNode.key){
					if(focusNode.leftChild==null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					focusNode = focusNode.rightChid;
					if(focusNode==null){
						parent.rightChid  = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node findNode(int key){
		
		Node focusNode = root;
		while(focusNode.key!=key){

			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}else if(key>focusNode.key){
				focusNode=focusNode.rightChid;
			}
			
			if(focusNode==null)
				return null;
		}
		return focusNode;
	}
	
	public void inOrderTraversal(Node focusNode){
		if(focusNode!=null){
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChid);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree theTree = new BinarySearchTree();
			 
			        theTree.addNode(50, "Boss");
			 
			        theTree.addNode(25, "Vice President");
			 
			        theTree.addNode(15, "Office Manager");
			 
			        theTree.addNode(30, "Secretary");
			 
			        theTree.addNode(75, "Sales Manager");
			 
			        theTree.addNode(85, "Salesman 1");
		
			        theTree.inOrderTraversal(theTree.root);
			        
//			        System.out.println(theTree.findNode(75));
	}

public class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChid;
	
	public Node(int key, String name){
		this.key=key;
		this.name=name;
	}
	
	public String toString(){
		return name+" has key "+key;
	}
}
	
}
