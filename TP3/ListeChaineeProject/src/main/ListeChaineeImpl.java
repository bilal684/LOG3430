/**
 * @class			: ListeChaineeImpl
 * @interface		: ListeChainee
 * @author	 		: Ons mlouki
 * 					  Ons.mlouki@gmail.com
 */
package main;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collections;

public class ListeChaineeImpl implements ListeChainee {
	
	public MyList build(String op,ArrayList<Object> val1, ArrayList<Object> val2, boolean ascendingSort, int val1Factor, int val2Factor) throws IOException{
		
		if(val1Factor < 0 || val1Factor > 3 || val2Factor < 0 || val2Factor > 3)
		{
			throw new IllegalArgumentException("La valeur de val1Factor et val2Factor doit etre entre 0 et 3.");
		}
		
		
		StringBuilder chaineContent=new StringBuilder();
		
		for(int i = 0; i < val1.size(); i++)
		{
			val1.set(i, (Integer)val1.get(i) * val1Factor);
		}
		
		for(int i = 0; i < val2.size(); i++)
		{
			val2.set(i, (Integer)val2.get(i) * val2Factor);
		}
		
		MyList list = new MyListImpl();	
		
		list.add(val1);
		chaineContent.append(""+val1);
			 
		list.add(val2);
		chaineContent.append(" "+val2);
		
		SetCalculator myCalculator= new SetCalculatorImpl();
		 
		 int i=1;
					
		switch (op){
		   case "union":{
			   list.add(myCalculator.union(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i));
			   
			   };
		   break;
		   case "intersection":{
			   list.add(myCalculator.intersection(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i)); 
			   };
		   break;
		   case "difference":{
			   list.add(myCalculator.difference(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i)); 
			   };
		   break;
		   case "symDifference":{
			   list.add(myCalculator.symDifference(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i));
			   };
		   break;
		   case "isSubset":{
			   list.add(myCalculator.isSubset(list.getAt(i-1),list.getAt(i)));
			   i++;
			   chaineContent.append(" "+list.getAt(i)); 
			   };
		   break; 
		   case "isSuperset":{
			   list.add(myCalculator.isSuperset(list.getAt(i-1),list.getAt(i)));
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
