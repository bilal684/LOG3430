package main;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class TP3TestsACTS {	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testUnion3234_1() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2, false, 1, 1);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(4);
		expectedResult.add(3);
		expectedResult.add(2);

		assertEquals(expectedResult, result.getAt(2));
	}
	

	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testUnion3234_2() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2, true, 0, 0);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(0);
		
		//Error d'implementation
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testUnion3234_3() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2, false, 2, 3);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(12);
		expectedResult.add(9);
		expectedResult.add(6);
		expectedResult.add(4);

		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testUnion3234_4() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("union", val1, val2, true, 3, 2);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(6);
		expectedResult.add(8);
		expectedResult.add(9);
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234_5() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2, false, 1, 0);

		assertEquals(0, result.getAt(2).size());
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234_6() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2, true, 0, 3);

		assertEquals(0, result.getAt(2).size());
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234_7() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2, false, 2, 2);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(6);
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_2 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : intersection
	 * Expected result : {3}
	 * */
	@Test
	public void testIntersection3234_8() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("intersection", val1, val2, true, 3, 1);
		assertEquals(0, result.getAt(2).size());
	}
	
	/**
	 * Test AC_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : {2}
	 * */
	@Test
	public void testDifferences3234_9() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2, true, 1, 3);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(2);
		expectedResult.add(3);

		assertEquals(expectedResult, result.getAt(2));

	}
	
	/**
	 * Test AC_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : {2}
	 * */
	@Test
	public void testDifferences3234_10() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2, false, 0, 2);

		ArrayList<Object> expectedResult = new ArrayList<>();
		//Error implementation
		expectedResult.add(0);
		assertEquals(expectedResult, result.getAt(2));

	}
	
	/**
	 * Test AC_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : {2}
	 * */
	@Test
	public void testDifferences3234_11() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2, true, 2, 1);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(6);
		assertEquals(expectedResult, result.getAt(2));

	}
	
	/**
	 * Test AC_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : Difference
	 * Expected result : {2}
	 * */
	@Test
	public void testDifferences3234_12() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("difference", val1, val2, false, 3, 0);

		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(9);
		expectedResult.add(6);
		assertEquals(expectedResult, result.getAt(2));

	}
	
	/**
	 * Test EC_4 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234_13() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2, true, 1, 2);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(2);
		expectedResult.add(3);
		expectedResult.add(6);
		expectedResult.add(8);

		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_4 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234_14() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2, false, 0, 1);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(4);
		expectedResult.add(3);
		expectedResult.add(0);
		//Error implementation
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_4 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234_15() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2, false, 2, 0);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(6);
		expectedResult.add(4);
		expectedResult.add(0);
		//Error implementation
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test EC_4 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : symDifference
	 * Expected result : {2,4}
	 * */
	@Test
	public void testSymetricDifference3234_16() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("symDifference", val1, val2, true, 3, 3);
		ArrayList<Object> expectedResult = new ArrayList<>();
		expectedResult.add(6);
		expectedResult.add(12);
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test AC_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : false
	 * */
	@Test
	public void testIsSubset3234_17() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2, true, 1, 2);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test AC_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : false
	 * */
	@Test
	public void testIsSubset3234_18() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2, false, 0, 1);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test AC_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : false
	 * */
	@Test
	public void testIsSubset3234_19() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2, true, 2, 0);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test AC_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSubset
	 * Expected result : false
	 * */
	@Test
	public void testIsSubset3234_20() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSubset", val1, val2, false, 3, 3);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test EC_6 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234_21() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2, true, 1, 2);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test EC_6 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234_22() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2, false, 0, 1);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test EC_6 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234_23() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2, false, 2, 0);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
	
	/**
	 * Test EC_6 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * OPERATOR : isSuperset
	 * Expected result : false
	 * */
	@Test
	public void testIsSuperset3234_24() throws IOException {

		ArrayList<Object> val1 = new ArrayList<Object>();
		ArrayList<Object> val2 = new ArrayList<Object>();

		val1.add(3);
		val1.add(2);
		val2.add(3);
		val2.add(4);

		ListeChainee suiteChainee = new ListeChaineeImpl();

		MyList result = suiteChainee.build("isSuperset", val1, val2, true, 3, 3);
		assertEquals(false, Boolean.getBoolean(result.getAt(2).toString()));
	}
}
