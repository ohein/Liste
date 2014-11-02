package ADS;

public class Listenelement {
	
	    private Object data;
	    private Listenelement successor;
	    
	    public Listenelement(){
	    }
	    public Object getData() {
	        return data;
	    }
	    public void setData(Object obj) {
	        data=obj;
	    }    
	    public Listenelement getSuccessor() {
	        return successor;
	    }            
	    public void setSuccessor(Listenelement elt) {
	        successor=elt;
	    }           
}

