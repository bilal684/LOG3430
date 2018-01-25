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

	// a,b,3,4 union
	@Test
	public void testUnionAB34() throws IOException {
		super.testUnionAB34();
	}

	// a,b,c,d union
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

	// 3, 2, 3, 4 union
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

	// 3,2,c,d union
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

	// a,b,3,4 intersection
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

	// a,b,c,d intersection
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

	// 3,2,3,4 intersection
	@Test
	public void testIntersection3234() throws IOException {
		super.testIntersection3234();
	}

	// 3,2,c,d intersection
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

	// a,b,3,4 differences
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

	// a,b,c,d differences
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

	// 3,2,3,4 differences
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

	// 3,2,c,d differences
	@Test
	public void testDifferences32CD() throws IOException {
		super.testDifferences32CD();
	}

	// a,b,3,4 symmDiff
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

	// a,b,c,d symmDiff
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

	// 3,2,3,4 symmDiff
	@Test
	public void testSymetricDifference3234() throws IOException {
		super.testSymetricDifference3234();
	}

	// 3,2,c,d symmDiff
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

	// a,b,3,4 issubset
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

	// a,b,c,d issubset
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

	// 3,2,3,4 issubset
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

	// 3,2,c,d
	@Test
	public void testIsSubset32CD() throws IOException {
		super.testIsSubset32CD();
	}

	// a,b,3,4 isSuperset
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

	// a,b,c,d isSuperset
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

	// 3,2,3,4 isSuperset
	@Test
	public void testIsSuperset3234() throws IOException {
		super.testIsSuperset3234();
	}

	// 3,2,c,d isSuperset
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

	// a,b,3,4 allo
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

	// a,b,c,d allo
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

	// 3,2,3,4 allo
	@Test
	public void testOtherOperator3234() throws IOException {
		super.testOtherOperator3234();
	}

	// 3,2,c,d allo
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