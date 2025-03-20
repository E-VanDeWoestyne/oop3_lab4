package exercise1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * MyAList.java
 * 
 * @author Mace Howald
 * @version 1.1
 * 
 * Class Definition: 
 */

public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	
	/**
	 * Constructor method to create a new MyAList object.
	 * 
	 */
	public MyAList() {
		list = new ArrayList<>();
	}
	
	
	/**
	 * Void method to add a new item to the list
	 * 
	 * @param E item
	 * @return nothing
	 */
	public void add(E item) {
		list.add(item);
	}
	
	/**
	 * Void method to add all listed items to the list
	 * 
	 * @param MyAList<E> items
	 * @return nothing
	 */
	public void addAll(MyAList<E> items) {
		list.addAll(items.list);
	}
	
	/**
	 * E method to get an object at a specified index
	 * 
	 * @param int index
	 * @return the object at the provided index in the list
	 */
	public E get(int index) {
		return list.get(index);
	}
	
	/**
	 * Void method to remove an object at a specified index
	 * 
	 * @param int index
	 * @return nothing
	 */
	public void remove(int index) {
		list.remove(index);
	}
	
	/**
	 * Void method to set a specified object at a specified index
	 * 
	 * @param int index
	 * @param E item
	 * @return nothing
	 */
	public void set(int index, E item) {
		list.set(index,item);
	}
	
	/**
	 * Int method to get the size of the list
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Boolean method to check if the list is empty
	 * 
	 * @return true if empty, false if not
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	/**
	 * Object[] method to convert the arrayList to an array
	 * 
	 * @return array generated from the arrayList
	 */
	public Object[] toArray() {
        return list.toArray();
    }
	
	/**
	 * Void method to clear all items in the list
	 * 
	 * @return nothing
	 */
	public void clear() {
		list.clear();
	}
	

	@Override
	public Iterator<E> iterator()
	{
		return list.iterator();
	}

}
