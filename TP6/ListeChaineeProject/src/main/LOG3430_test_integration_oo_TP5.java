package main;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LOG3430_test_integration_oo_TP5 {

	/*@Test
	public void test_niveau_1() {
		//MyListImpl(MyList), methode add.
		ArrayList<Object> setA = new ArrayList<Object>();
		setA.add(5);
		setA.add(3);
		MyList myList = new MyListImpl();
		myList.add(setA);
		assertEquals(1, myList.getSize());
		assertEquals(setA, ((MyListImpl)myList).getStart().getContent());
		assertEquals(setA, ((MyListImpl)myList).getCurrent().getContent());
		
		//SetCalculatorImpl(SetCalculator), methode intersection.
		SetCalculator sc = new SetCalculatorImpl();
		ArrayList<Object> setB = new ArrayList<Object>();
		setB.add(3);
		setB.add(6);
		ArrayList<Object> result = sc.intersection(setA, setB);
		assertEquals(1, result.size());
		assertEquals(3, result.get(0));
	}
	
	@Test
	public void test_niveau_2() throws IOException {
		//ListeChaineeImpl(ListeChainee), methode build
		ArrayList<Object> setA = new ArrayList<Object>();
		setA.add(5);
		setA.add(3);
		ArrayList<Object> setB = new ArrayList<Object>();
		setB.add(3);
		setB.add(6);
		ListeChainee lci = new ListeChaineeImpl();
		MyList ls = lci.build(1, setA, setB, true);
		assertEquals(1, ls.getAt(2).size());
		assertEquals(3, ls.getAt(2).get(0));
		
		//Elem, methode getContent et setContent
		ArrayList<Object> list = new ArrayList<>();
		list.add(5);
		MyListImpl listeImpl = new MyListImpl();
		Elem element1 = listeImpl.new Elem(list, null);
		ArrayList<Object> myList = element1.getContent();
		assertEquals(list.get(0), myList.get(0));
		list.add(6);
		element1.setContent(list);
		myList = element1.getContent();
		assertEquals(list.get(1), myList.get(1));		
	}*/
	@Test
	public void test() throws IOException {
		//MyListImpl(MyList), methode add.
		ArrayList<Object> setA = new ArrayList<Object>();
		setA.add(1);
		setA.add(3);
		ArrayList<Object> setB = new ArrayList<>();
		setB.add(2);
		setB.add(3);
		ListeChaineeImpl lci = new ListeChaineeImpl();
		MyList result = lci.build(1, setA, setB, false);
		int i = 0;
		i++;
		/*assertEquals(1, myList.getSize());
		assertEquals(setA, ((MyListImpl)myList).getStart().getContent());
		assertEquals(setA, ((MyListImpl)myList).getCurrent().getContent());
		
		//SetCalculatorImpl(SetCalculator), methode intersection.
		SetCalculator sc = new SetCalculatorImpl();
		ArrayList<Object> setB = new ArrayList<Object>();
		setB.add(3);
		setB.add(6);
		ArrayList<Object> result = sc.intersection(setA, setB);
		assertEquals(1, result.size());
		assertEquals(3, result.get(0));*/
	}

}
