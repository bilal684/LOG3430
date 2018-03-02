package main;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LOG3430_TP4 {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
	}

	/**
	 * Test EC_1 - UnionAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : union
	 * Expected result : null
	 * */
	@Test
	public void testUnionAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList resultat = suiteChainee.build("union", val1, val2);

		assertEquals(null, resultat.getAt(2));
	}

	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList resultat = suiteChainee.build("intersection", val1, val2);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(3);

		assertEquals(expectedResult, resultat.getAt(2));
	}

	/**
	 * Test EC_3 - Differences32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : difference
	 * Expected result : null
	 * */
	@Test
	public void testDifferences32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList resultat = suiteChainee.build("difference", val1, val2);

		assertEquals(null, resultat.getAt(2));
	}

	/**
	 * Test EC_4 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(2);
		expectedResult.add(4);

		assertEquals(expectedResult, result.getAt(2));
	}

	/**
	 * Test EC_5 - IsSubset32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : isSubset
	 * Expected result : null
	 * */
	@Test
	public void testIsSubset32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test EC_6 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}

	/**
	 * Test EC_7 - OtherOperator3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : allo
	 * Expected result : true
	 * */
	@Test
	public void testOtherOperator3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("allo", val1, val2);
		assertEquals(true, outContent.toString().contains("operateur allo non identif"));
	}
	
	/**
	 * Test TP2 - testRemoveAt0
	 * Permet de s’assurer que le retrait d’un objet à l’index 0 de ListeChainee se fait adéquatement
	 * */
	
	@Test
	public void testRemoveAt0() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		Integer sizeBeforeRemove = result.getSize();
		result.removeAt(0);
		assertEquals(sizeBeforeRemove - 1, result.getSize());
	}
	
	/**
	 * Test TP2 - testRemoveAt3
	 * Permet de s’assurer qu’une exception de type ArrayIndexOutOfBoundsException est lancé lorsque l’on essaie 
	 * de retirer un objet alors que l’index indiqué dépasse la taille de ListeChainee.
	 * */
	@Test()
	public void testRemoveAt3() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		Integer sizeBeforeRemove = result.getSize();
		try
		{
		   result.removeAt(3);
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, exception.getClass());
		}
		
		
	}
	
	/**
	 * Test TP2 - testRemoveAt2
	 * Permet de s’assurer que le retrait d’un objet à un index différents de 0 et inférieur à la taille 
	 * de ListeChainee se fait adéquatement.
	 * */
	@Test
	public void testRemoveAt2() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		Integer sizeBeforeRemove = result.getSize();
		result.removeAt(2);
		assertEquals(sizeBeforeRemove - 1, result.getSize());
	}

	/**
	 * Test TP2 - testReset
	 * Permet de s’assurer que la méthode reset permet de bien ré-initialiser un objet de la classe 
	 * ListeChainee.
	 * */
	@Test
	public void testReset() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		result.reset();
		assertEquals(0, result.getSize());
	}
	
	/**
	 * Test TP2 - testSetAt
	 * Permet de s’assurer que la méthode setAt assigne adéquatement une valeur fourni en paramètre 
	 * à un index valide.
	 * */
	@Test
	public void testSetAt() throws IOException {

		
		
		ArrayList<Object> val1 = new ArrayList<Object>();
		
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);
		
		ArrayList<Object> val3 = new ArrayList<Object>();
		val3.add(5);
		val3.add(6);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		result.setAt(val3, 1);
		assertEquals(val3, result.getAt(1));
	}
	
	/**
	 * Test TP2 - testSetAtException
	 * Permet de s’assurer que la méthode setAt jette bien une exception lorsqu’elle est appelée 
	 * à assigner une valeur à un index plus grand que la taille de l’objet de type ListeChainee.
	 * */
	@Test
	public void testSetAtException() throws IOException {

		
		
		ArrayList<Object> val1 = new ArrayList<Object>();
		
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);
		
		ArrayList<Object> val3 = new ArrayList<Object>();
		val3.add(5);
		val3.add(6);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		try
		{
			result.setAt(val3, result.getSize());
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, exception.getClass());
		}
		
	}
	
	/**
	 * Test TP2 - testRemoveExistingItem
	 * Permet de s’assurer que la méthode removeItem retire adéquatement un objet de la ListeChainee.
	 * */
	@Test
	public void testRemoveExistingItem() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		Integer sizeBeforeRemove = result.getSize();
		result.removeItem(val1);
		
		assertEquals(sizeBeforeRemove - 1, result.getSize());
	}
	
	/**
	 * Test TP2 - testRemoveAbsentItem
	 * Permet de s’assurer que la méthode removeItem retire adéquatement un objet de la ListeChainee
	 * à l’aide de plusieurs itérations.
	 * */
	@Test
	public void testRemoveAbsentItem() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();
		ArrayList<Object> val3 = new ArrayList<Object>();
		
		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);
		val3.add(5);
		val3.add(6);
		
		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		Integer sizeBeforeRemove = result.getSize();
		
		result.removeItem(val2);
		
		assertEquals(sizeBeforeRemove - 1, result.getSize());
	}
	
	/**
	 * Test TP2 - testGetAtException
	 * Permet de s’assurer que la méthode getAt lance une exception lorsque l’index 
	 * fourni à la méthode est plus grand que la taille de l’objet ListeChainee.
	 * */
	@Test
	public void testGetAtException() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();
		
		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);
		
		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("union", val1, val2);
		
		try
		{
			result.getAt(3);
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, exception.getClass());
		}
	}
}
