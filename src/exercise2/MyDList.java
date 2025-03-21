package exercise2;

/**
 * MyDList.java
 * 
 * @author Ethan Van De Woestyne
 * @version 1.0
 *  
 */

public class MyDList<E>
{
    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;
    
    /**
     * Constructor creates an empty list
     */
    public MyDList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Returns the head node of the list
     * @return the head node
     */
    public MyNode<E> getHead() {
        return head;
    }
    
    /**
     * Adds an element to the beginning of the list
     * @param item the element to add
     */
    public void addFirst(E item) {
        MyNode<E> newNode = new MyNode<>(item, null, head);
        
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPrev(newNode);
        }
        
        head = newNode;
        size++;
    }
    
    /**
     * Adds an element to the end of the list
     * @param item the element to add
     */
    public void addLast(E item) {
        MyNode<E> newNode = new MyNode<>(item, tail, null);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        
        tail = newNode;
        size++;
    }
    
    /**
     * Removes and returns the element at the beginning of the list
     * @return the removed element
     * @throws IllegalStateException if the list is empty
     */
    public E removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty list");
        }
        
        E removedElement = head.getElement();
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
        
        size--;
        return removedElement;
    }
    
    /**
     * Removes and returns the element at the end of the list
     * @return the removed element
     * @throws IllegalStateException if the list is empty
     */
    public E removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty list");
        }
        
        E removedElement = tail.getElement();
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        
        size--;
        return removedElement;
    }
    
    /**
     * Returns the number of elements in the list
     * @return the size of the list
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }
}