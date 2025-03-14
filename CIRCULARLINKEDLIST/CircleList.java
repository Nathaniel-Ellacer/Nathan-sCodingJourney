package CIRCULARLINKEDLIST;

class CircleList { 
    protected CNode cursor; 
    protected int size; 
    
    public CircleList() { 
        cursor = null; 
        size = 0; 
    } 
        
    public CNode getCursor() { 
        return cursor; 
    } 
        
    public void advance() { 
        cursor = cursor.getNext(); 
    } 
    public void add(CNode newNode) { 
        if (cursor == null) { 
            newNode.setNext(newNode); 
            cursor = newNode; 
        } 
        else { 
            newNode.setNext(cursor.getNext()); 
            cursor.setNext(newNode); 
        } 
        size++; 
    } 
        
    public CNode remove() { 
        if (size == 0) { 
            return null; 
    
        } 
        CNode oldCNode = cursor.getNext(); 
        if (oldCNode == cursor) { 
            cursor = null; 
        } 
        else { 
            cursor.setNext(oldCNode.getNext()); 
            oldCNode.setNext(null); 
        } 
        size--; 
        return oldCNode; 
    } 
        
    public String toString() { 
        if (cursor == null) { 
            return " [ ] "; 
        } 
        String s = "[..." + cursor.getElement(); 
        CNode oldCursor = cursor; 
         
        for (advance(); oldCursor != cursor; advance()) { 
            s += ", " + cursor.getElement(); 
        } 
        return s + "...]"; 
    } 
   }