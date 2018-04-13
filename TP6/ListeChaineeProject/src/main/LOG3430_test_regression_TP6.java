package main;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import main.MyListImpl.Elem;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LOG3430_test_regression_TP6 {

	@Test
	public void test_niveau_1() {
		//SetCalculatorImpl(SetCalculator), methode intersection.
		ArrayList<Object> setA = new ArrayList<Object>();
		setA.add(5);
		setA.add(3);
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
		MyList ls = lci.build(2, setA, setB, true);
		assertEquals(1, ls.getAt(2).size());
		assertEquals(3, ls.getAt(2).get(0));
	}
}
