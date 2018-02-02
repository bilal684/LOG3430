package main;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TP1TestAC extends TP1TestEC {
	@Before
	public void setUpStreams() {
		super.setUpStreams();
	}

	@After
	public void restoreStreams() {
		super.restoreStreams();
	}

	/**
	 * Test AC_1 - UnionAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : Union
	 * Expected result : null
	 * */
	@Test
	public void testUnionAB34() throws IOException {
		super.testUnionAB34();
	}

	/**
	 * Test AC_2 - UnionABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : Union
	 * Expected result : null
	 * */
	@Test
	public void testUnionABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_3 - Union3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Union
	 * Expected result : {3,2,3,4}
	 * */
	@Test
	public void testUnion3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(3);
		expectedResult.add(2);
		expectedResult.add(4);

		assertEquals(expectedResult, result.getAt(2));
	}

	/**
	 * Test AC_4 - Union32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : Union
	 * Expected result : null
	 * */
	@Test
	public void testUnion32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_5 - IntersectionAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : Intersection
	 * Expected result : null
	 * */
	@Test
	public void testIntersectionAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_6 - IntersectionABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : Intersection
	 * Expected result : null
	 * */
	@Test
	public void testIntersectionABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2);

		assertEquals(null, result.getAt(2));

	}

	/**
	 * Test AC_7 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234() throws IOException {
		super.testIntersection3234();
	}

	/**
	 * Test AC_8 - Intersection32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : Intersection
	 * Expected result : null
	 * */
	@Test
	public void testIntersection32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2);

		assertEquals(null, result.getAt(2));

	}

	/**
	 * Test AC_9 - DifferencesAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : null
	 * */
	@Test
	public void testDifferencesAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_10 - DifferencesABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : Difference
	 * Expected result : null
	 * */
	@Test
	public void testDifferencesABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : {2}
	 * */
	@Test
	public void testDifferences3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(2);

		assertEquals(expectedResult, result.getAt(2));

	}

	/**
	 * Test AC_12 - Differences32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : Difference
	 * Expected result : null
	 * */
	@Test
	public void testDifferences32CD() throws IOException {
		super.testDifferences32CD();
	}

	/**
	 * Test AC_13 - SymetricDifferenceAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : null
	 * */
	@Test
	public void testSymetricDifferenceAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_14 - SymetricDifferenceABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : symDifference
	 * Expected result : null
	 * */
	@Test
	public void testSymetricDifferenceABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2);

		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_15 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234() throws IOException {
		super.testSymetricDifference3234();
	}

	/**
	 * Test AC_16 - SymetricDifference32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : symDifference
	 * Expected result : null
	 * */
	@Test
	public void testSymetricDifference32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_17 - IsSubsetAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : null
	 * */
	@Test
	public void testIsSubsetAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_18 - IsSubsetABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : isSubset
	 * Expected result : null
	 * */
	@Test
	public void testIsSubsetABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : false
	 * */
	@Test
	public void testIsSubset3234() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}

	/**
	 * Test AC_20 - IsSubset32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : isSubset
	 * Expected result : null
	 * */
	@Test
	public void testIsSubset32CD() throws IOException {
		super.testIsSubset32CD();
	}

	/**
	 * Test AC_21 - IsSupersetAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : null
	 * */
	@Test
	public void testIsSupersetAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_22 - IsSupersetABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : isSuperset
	 * Expected result : null
	 * */
	@Test
	public void testIsSupersetABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_23 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234() throws IOException {
		super.testIsSuperset3234();
	}

	/**
	 * Test AC_24 - IsSuperset32CD
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2);
		assertEquals(null, result.getAt(2));
	}

	/**
	 * Test AC_25 - OtherOperatorAB34
	 * VAL1 : {a,b}
	 * VAL2 : {3,4}
	 * OPERATOR : allo
	 * Expected result : true
	 * */
	@Test
	public void testOtherOperatorAB34() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("allo", val1, val2);
		assertEquals(true, outContent.toString().contains("operateur allo non identif"));
	}

	/**
	 * Test AC_26 - OtherOperatorABCD
	 * VAL1 : {a,b}
	 * VAL2 : {c,d}
	 * OPERATOR : allo
	 * Expected result : true
	 * */
	@Test
	public void testOtherOperatorABCD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add('a');
		val1.add('b');
		val1.add('c');
		val1.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("allo", val1, val2);
		assertEquals(true, outContent.toString().contains("operateur allo non identif"));
	}

	/**
	 * Test AC_27 - OtherOperator3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : allo
	 * Expected result : true
	 * */
	@Test
	public void testOtherOperator3234() throws IOException {
		super.testOtherOperator3234();
	}

	/**
	 * Test AC_28 - OtherOperator32CD
	 * VAL1 : {3,2}
	 * VAL2 : {c,d}
	 * OPERATOR : allo
	 * Expected result : true
	 * */
	@Test
	public void testOtherOperator32CD() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add('c');
		val2.add('d');

		ListeChainee suiteChainee = new ListeChaineeImpl();

		@SuppressWarnings("unused")
		MyList result = suiteChainee.build("allo", val1, val2);
		assertEquals(true, outContent.toString().contains("operateur allo non identif"));
	}

}