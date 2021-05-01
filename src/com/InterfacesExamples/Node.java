package com.InterfacesExamples;

public class Node extends ListItem {

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
			return ((String) super.getValue()).compareTo((String) link.getValue());
		}else {
			return -1;
		}
	}


	

}
