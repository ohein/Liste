package ADS;
import java.util.Iterator;

public class VListeIterator implements Iterator {
	
	private VListe dieListe;
    private Listenelement current;
    private Listenelement lastCurrent;    
    
    public VListeIterator(VListe dieListe) {
		this.dieListe=dieListe;
		current=dieListe.getStart();
    }
    
    public boolean hasNext() {
        return (current!=null);
    }
    
    public Object next() {
    	lastCurrent=current;
        current=current.getSuccessor();
        return lastCurrent;
    }
    
    public void remove() {
        dieListe.delete(lastCurrent);
    }
}
