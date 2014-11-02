package ADS;

public class VListe {
	
	private Listenelement start;
		    
	public void setStart(Listenelement elt) {
		start=elt;
	}
		   
	public Listenelement getStart() {
		return start;
	} 
		   
	public String toString() {
		String str=" ";
		Listenelement elt=start;
		while (elt!=null) {
			str=str+" "+elt.toString();
			elt=elt.getSuccessor();
		} 
		return str;
	}
	
	public Listenelement find(Listenelement find) {
		Listenelement elt=start;
		while (elt!=null) {
			if (elt==find) return elt;
			elt=elt.getSuccessor();
		}
		return null;
	}
	
	public void append(Listenelement neuelt) {
		if (start==null) {
			setStart(neuelt);
		 } 
		else {
			Listenelement elt=start;
			while (elt.getSuccessor()!=null)		 		
				elt=elt.getSuccessor();
			elt.setSuccessor(neuelt);
		}
	}
	
	public void insertAfter(Listenelement wo, Listenelement elt) {
		elt.setSuccessor(wo.getSuccessor());
		wo.setSuccessor(elt);
	}
	
	public void insertBefore(Listenelement wo, Listenelement elt) { 
		if (start==null) return;
		if (this.start==wo) {
			elt.setSuccessor(start);
			setStart(elt);
		} 
		else { 
			Listenelement x=start;
			Listenelement pred_wo;
			do { 
				pred_wo=x;
				x=x.getSuccessor();         		 
			} while ((x!=null)&&(x!=wo));
			if (x!=null)
				insertAfter(pred_wo,elt);
		}
	}
	
	public void delete(Listenelement elt) {
		if (start==null) return;
		if (this.start==elt) start=elt.getSuccessor();
		else { 
			Listenelement x=start;
			Listenelement pred_elt;
			do { 
				pred_elt=x;
				x=x.getSuccessor();         		 
			} while ((x!=null)&&(x!=elt));
			if (x!=null)
				pred_elt.setSuccessor(elt.getSuccessor());
		 	}
	}
}

