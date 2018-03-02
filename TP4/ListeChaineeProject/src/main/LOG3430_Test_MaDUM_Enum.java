package main;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.MyListImpl.Elem;

public class LOG3430_Test_MaDUM_Enum {

	@Test
	public void testMaDUM_Content() {
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
	
	@Test
	public void testMaDUM_Next() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(5);
		MyListImpl ls = new MyListImpl();
		
		Elem element1 = ls.new Elem(list, null);
		assertEquals(element1.getNext(), null);
		Elem element2 = ls.new Elem(null, null);
		element1.setNext(element2);
		assertEquals(element1.getNext(), element2);
	}

}
