package main;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TP1TestEC {

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

}
