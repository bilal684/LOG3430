package main;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.MyListImpl.Elem;

public class LOG3430_TP4_Test_MaDUM {

	//C -> setContent
	@Test
	public void testMaDUM_ClassEnum_Content() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(5);
		MyListImpl ls = new MyListImpl();
		Elem element1 = ls.new Elem(list, null);
		ArrayList<Object> myList = element1.getContent();
		assertEquals(list.get(0), myList.get(0));
		
		list.add(6);
		element1.setContent(list);
		myList = element1.getContent();
		assertEquals(list.get(1), myList.get(1));
	}
	
	//C -> setNext
	@Test
	public void testMaDUM_ClassEnum_Next() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(5);
		MyListImpl ls = new MyListImpl();
		
		Elem element1 = ls.new Elem(list, null);
		assertEquals(element1.getNext(), null);
		Elem element2 = ls.new Elem(null, null);
		element1.setNext(element2);
		assertEquals(element1.getNext(), element2);
	}
	
	//C -> add -> removeAt -> removeItem -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_1()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//removeAt
		myListImpl.removeAt(0);
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> removeAt -> reset -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_2()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//RemoveAt
		myListImpl.removeAt(0);
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> reset -> removeAt -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_3()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> reset -> removeItem -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_4()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> add -> removeItem -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_5()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> add -> reset -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_6()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> reset -> add -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_7()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> reset -> removeItem -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_8()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> add -> removeAt -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_9()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> add -> reset -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_10()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> reset -> add -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_11()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> reset -> removeAt -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_12()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> add -> removeAt -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_13()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> add -> removeItem -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_14()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> removeItem -> add -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_15()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> removeItem -> removeAt -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_start_16()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getStart());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getStart());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(null, myListImpl.getStart());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getStart().getContent());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> removeAt -> removeItem -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_1()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//removeAt
		myListImpl.removeAt(0);
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> removeAt -> reset -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_2()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//RemoveAt
		myListImpl.removeAt(0);
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> reset -> removeAt -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_3()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> reset -> removeItem -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_4()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> add -> removeItem -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_5()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> add -> reset -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_6()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> reset -> add -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_7()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeAt -> reset -> removeItem -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_8()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> add -> removeAt -> reset -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_9()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> add -> reset -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_10()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> reset -> add -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_11()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> removeItem -> reset -> removeAt -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_12()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> add -> removeAt -> removeItem -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_13()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> add -> removeItem -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_14()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> removeItem -> add -> removeAt -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_15()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> reset -> removeItem -> removeAt -> add -> setAt -> getAt
	@Test
	public void testMaDUM_ClassMyListIMPL_size_16()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(0, myListImpl.getSize());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(0, myListImpl.getSize());
		//removeItem
		try {
			myListImpl.removeItem(arrayOfObjects);
		} catch(NullPointerException ex)
		{
			assertEquals(NullPointerException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//RemoveAt
		try
		{
			myListImpl.removeAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		assertEquals(0, myListImpl.getSize());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(1, myListImpl.getSize());
		//setAt
		try
		{
			myListImpl.setAt(new ArrayList<Object>(){{add(1);}}, 0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
		//getAt
		try
		{
			myListImpl.getAt(0);
		}catch(Exception ex)
		{
			assertEquals(ArrayIndexOutOfBoundsException.class, ex.getClass());
		}
	}
	
	//C -> add -> reset
	@Test
	public void testMaDUM_ClassMyListIMPL_current_1()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getCurrent());
		ArrayList<Object> arrayOfObjects = null;
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getCurrent().getContent());
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getCurrent());
		
	}
	
	//C -> reset -> add
	@Test
	public void testMaDUM_ClassMyListIMPL_current_2()
	{
		MyListImpl myListImpl = new MyListImpl();
		assertEquals(null, myListImpl.getCurrent());
		ArrayList<Object> arrayOfObjects = null;
		//reset
		myListImpl.reset();
		assertEquals(null, myListImpl.getCurrent());
		//Add
		myListImpl.add(arrayOfObjects = new ArrayList<Object>() {{add(1); add(2); add(3);}});
		assertEquals(arrayOfObjects, myListImpl.getCurrent().getContent());
		
	}
	
	/************************TEST POUR COUVERTURE 100% COMMENCE ICI*****************************/
	
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
