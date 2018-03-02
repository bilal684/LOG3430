package main;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class TP3TestsACTS {	
	/**
	 * Test ACTS_1 - Union3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 1
	 * Val2Factor : 1
	 * OPERATOR : Union
	 * Expected result : {4,3,2}
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
	 * Test ACTS_2 - Union3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 0
	 * Val2Factor : 0
	 * OPERATOR : Union
	 * Expected result : {0}
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
		
		assertEquals(expectedResult, result.getAt(2));
	}
	
	/**
	 * Test ACTS_3 - Union3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 2
	 * Val2Factor : 3
	 * OPERATOR : Union
	 * Expected result : {12, 9, 6, 4}
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
	 * Test ACTS_4 - Union3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 3
	 * Val2Factor : 2
	 * OPERATOR : Union
	 * Expected result : {6, 8, 9}
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
	 * Test ACTS_5 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 1
	 * Val2Factor : 0
	 * OPERATOR : Intersection
	 * Expected result : {}
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
	 * Test ACTS_6 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 0
	 * Val2Factor : 3
	 * OPERATOR : Intersection
	 * Expected result : {}
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
	 * Test ACTS_7 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 2
	 * Val2Factor : 2
	 * OPERATOR : Intersection
	 * Expected result : {6}
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
	 * Test ACTS_8 - Intersection3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 3
	 * Val2Factor : 1
	 * OPERATOR : Intersection
	 * Expected result : {}
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
	 * Test ACTS_9 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 1
	 * Val2Factor : 3
	 * OPERATOR : Difference
	 * Expected result : {2, 3}
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
	 * Test ACTS_10 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 0
	 * Val2Factor : 2
	 * OPERATOR : Difference
	 * Expected result : {0}
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
		
		expectedResult.add(0);
		assertEquals(expectedResult, result.getAt(2));

	}
	
	/**
	 * Test ACTS_11 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 2
	 * Val2Factor : 1
	 * OPERATOR : Difference
	 * Expected result : {6}
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
	 * Test ACTS_12 - Differences3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 3
	 * Val2Factor : 0
	 * OPERATOR : Difference
	 * Expected result : {9, 6}
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
	 * Test ACTS_13 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 1
	 * Val2Factor : 2
	 * OPERATOR : symDifference
	 * Expected result : {2, 3, 6, 8}
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
	 * Test ACTS_14 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 0
	 * Val2Factor : 1
	 * OPERATOR : symDifference
	 * Expected result : {4, 3, 0}
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
	 * Test ACTS_15 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 2
	 * Val2Factor : 0
	 * OPERATOR : symDifference
	 * Expected result : {6, 4, 0}
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
	 * Test ACTS_16 - SymetricDifference3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 3
	 * Val2Factor : 3
	 * OPERATOR : symDifference
	 * Expected result : {6, 12}
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
	 * Test ACTS_17 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 1
	 * Val2Factor : 2
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
	 * Test ACTS_18 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 0
	 * Val2Factor : 1
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
	 * Test ACTS_19 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 2
	 * Val2Factor : 0
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
	 * Test ACTS_20 - IsSubset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 3
	 * Val2Factor : 3
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
	 * Test ACTS_21 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 1
	 * Val2Factor : 2
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
	 * Test ACTS_22 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 0
	 * Val2Factor : 1
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
	 * Test ACTS_23 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : false
	 * Val1Factor : 2
	 * Val2Factor : 0
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
	 * Test ACTS_24 - IsSuperset3234
	 * VAL1 : {3,2}
	 * VAL2 : {3,4}
	 * Sort : true
	 * Val1Factor : 3
	 * Val2Factor : 3
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
