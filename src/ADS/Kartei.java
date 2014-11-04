package ADS;

import java.util.*;

public class Kartei {
	
	public static void main(String[] args) {
		
		VListe kartei = new VListe();
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("item1");
		linkedlist.remove("item1");
		
		Listenelement abc1 = new Listenelement();
		Listenelement abc2 = new Listenelement();
		
		// Aktueller Typparameter Integer tritt an die Stelle von T
		Punkt<Integer> intPunkt = new Punkt<Integer>(1,2);
		
		// Aktueller Typparameter Double tritt an die Stelle von T
		Punkt<Double> doublePunkt = new Punkt<Double>(1.5,2.3);
		
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
