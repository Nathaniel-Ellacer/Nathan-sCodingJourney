package CIRCULARLINKEDLIST;

public class CNode  { 
    private String element; 
    private CNode next; 
    
    public CNode(String s, CNode n){ 
        element = s; 
        next = n; 
    } 
    
    public String getElement() { 
        return element; 
    } 
    
    
    public CNode getNext() { 
        return next; 
    } 
        
    public void setNext(CNode n) { 
        next = n; 
    } 
   } 