/**
 * @class			: ListeChaineeImpl
 * @interface		: ListeChainee
 * @author	 		: Ons mlouki
 * 					  Ons.mlouki@gmail.com
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListeChaineeImpl implements ListeChainee {
	
	public MyList build(int op, ArrayList<Object> val1, ArrayList<Object> val2, boolean ascendingSort) throws IOException{
		
		
		StringBuilder chaineContent=new StringBuilder();
		
		MyList list = new MyListImpl();	
		
		list.add(val1);
		chaineContent.append(""+val1);
			 
		list.add(val2);
		chaineContent.append(" "+val2);
		
		SetCalculator myCalculator= new SetCalculatorImpl();
		 
		 int i=1;
					
		switch (op){
		   case 1:{
			   list.add(myCalculator.union(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i));
			   
			   };
		   break;
		   case 2:{
			   list.add(myCalculator.intersection(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i)); 
			   };
		   break;
		   case 3:{
			   list.add(myCalculator.difference(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i)); 
			   };
		   break;
		   case 4:{
			   list.add(myCalculator.symDifference(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i));
			   };
		   break;
		   default:System.out.println("operateur "+op+" non identifié");
			   break;
		}
		list = sortList(list, ascendingSort);
		return list;
	}
	
	/**
	 * Cette méthode permet d'effectuer le tri d'une liste en ordre croissant ou en ordre décroissant.
	 * @param list
	 * @param ascendingSort
	 * @return 
	 */
	private MyList sortList(MyList list, boolean ascendingSort)
	{
		ArrayList<Object> myList = list.getAt(2);
		if(ascendingSort)
		{
			Collections.sort(myList, (o1, o2) -> ((Integer)o1).compareTo(((Integer)o2)));
		}
		else
		{
			Collections.sort(myList, (o1, o2) -> ((Integer)o2).compareTo(((Integer)o1)));
		}
		list.setAt(myList, 2);
		return list;
	}
	
}
