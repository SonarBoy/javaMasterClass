package com.InterfacesExamples;

public class Node<T> extends ListItem {

	public Node(Object val) {
		
		super(val);
		
	}

	@Override
	protected ListItem next() {
		
		return this.rightLink;
		
	} 

	@Override
	protected ListItem setNext(ListItem link) {
		
		
		this.rightLink = link;
		return this.rightLink;
		
	}

	@Override
	protected ListItem previous() {
	
		return this.leftLink;
	}
	
	@Override
	protected ListItem setPrevious(ListItem link) {
		
		
		this.leftLink = link;
		return this.leftLink;
		
	}

	@Override
	protected int compareTo(ListItem link) {
		
		if(link != null) {
			
			int x = Integer.parseInt(super.getValue()+"");
			int y = Integer.parseInt(link.getValue()+"");
			
			if(x < y) {
				return -1;
			}else if(x > y) {
				return 1;
			}else {
				return 0;
			}
			
			//return ((String) super.getValue()).compareTo((String) link.getValue());
		}else {
			return -1;
		}
	}


	

}
