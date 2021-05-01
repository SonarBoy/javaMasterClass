package com.InterfacesExamples;

public class TreeTesting {

	public static void main(String[] args) {
//		   MyLinkedList list = new MyLinkedList(null);
//	        list.traverse(list.getRoot());
//	        // Create a string data array to avoid typing loads of addItem instructions:
//	        String stringData = "5 7 3 9 8 2 1 0 4 6";
//
//	        String[] data = stringData.split(" ");
//	        for (String s : data) {
//	            list.addItem(new Node(s));
//	        }
//	        
//	        list.traverse(list.root);
//	        
//	        
//	        list.removeItem(new Node("8"));
//	        
//	        
//	        list.traverse(list.root);
	        
	        
	        
	        SearchTree tree = new SearchTree(null);
	        tree.traverse(tree.getRoot());
	        // Create a string data array to avoid typing loads of addItem instructions:
	        String stringData2 = "5 7 3 9 8 2 1 0 4 6";
//	        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


	        String[] data2 = stringData2.split(" ");
	        for (String s : data2) {
	            tree.addItem(new Node(s));
	        }
	        
	        tree.traverse(tree.getRoot());
	        
	        tree.removeItem(new Node("0"));
	        tree.removeItem(new Node("3"));
	        tree.removeItem(new Node("5"));
	        
	        tree.traverse(tree.getRoot());
	        
	        
	}

}
