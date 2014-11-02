package ADS;

public class Kartei {
	
	public static void main(String[] args) {
		
		VListe kartei = new VListe();
				
		Listenelement abc1 = new Listenelement();
		Listenelement abc2 = new Listenelement();
		
		Object ele = new Object();
		ele = "123";
		Object t = new Object();
		
		abc1.setData(ele);
		abc2.setData(ele);
		kartei.append(abc1);
		kartei.append(abc2);
		
		VListeIterator VIt = new VListeIterator(kartei);
		
		while (VIt.hasNext()) {
			t=VIt.next();		
			System.out.println(t.toString());
		}			
		System.out.println(kartei.toString());
	}
}
