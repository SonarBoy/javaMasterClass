package com.InterfacesExamples;

public abstract class ListItem {
    
     ListItem rightLink;
     ListItem leftLink;
     Object value;
    
    public ListItem(Object val){
        this.value = val;
    }
    
     abstract ListItem next();
     abstract ListItem setNext(ListItem link);
     abstract ListItem previous();
     abstract ListItem setPrevious(ListItem link);
     abstract int compareTo(ListItem link);
    
    public void setValue(Object val){
        this.value = val;
    }
    
    public Object getValue(){
        return this.value;
    }
}