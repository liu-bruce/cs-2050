/* You may use the following template to complete your program.*/ 
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collection;

//test code
public class <type projct name> {
  public static void main(String[] args) {
    new <type projct name>();
  }
  
  public <type projct name>() {
    TwoWayLinkedList<Double> list = new TwoWayLinkedList<>();
    System.out.print("Enter five numbers: ");
    Scanner input = new Scanner(System.in);
    double[] v = new double[5];
    for (int i = 0; i < 5; i++) 
      v[i] = input.nextDouble();

    list.add(v[1]);
    list.add(v[2]);
    list.add(v[3]);
    list.add(v[4]);
    list.add(0, v[0]);
    list.add(2, 10.55);
    list.remove(3);

    java.util.ListIterator<Double> iterator1 = list.listIterator();
    while (iterator1.hasNext())
      System.out.print(iterator1.next() + " ");

    java.util.ListIterator<Double> iterator2 = list.listIterator(list.size() - 1);
    System.out.println();
    while (iterator2.hasPrevious())
      System.out.print(iterator2.previous() + " ");
  }
}

interface MyList<E> extends java.util.Collection<E> {
  /** Add a new element at the specified index in this list */
  public void add(int index, E e);

  /** Return the element from this list at the specified index */
  public E get(int index);

  /** Return the index of the first matching element in this list.
   *  Return -1 if no match. */
  public int indexOf(Object e);

  /** Return the index of the last matching element in this list
   *  Return -1 if no match. */
  public int lastIndexOf(E e);

  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);

  /** Replace the element at the specified position in this list
   *  with the specified element and returns the new set. */
  public E set(int index, E e);
  
  @Override /** Add a new element at the end of this list */
  public default boolean add(E e) {
    add(size(), e);
    return true;
  }

  @Override /** Return true if this list contains no elements */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override /** Remove the first occurrence of the element e 
   *  from this list. Shift any subsequent elements to the left.
   *  Return true if the element is removed. */
  public default boolean remove(Object e) {
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }

  //Extra points if completed the following parts:
  @Override
  public default boolean containsAll(Collection<?> c) {
    // 1. Complete this part
    return true;
  }

  @Override
  public default boolean addAll(Collection<? extends E> c) {
    // 2. Complete this part
    return true;
  }

  @Override
  public default boolean removeAll(Collection<?> c) {
    // 3. Complete this part
    return true;
  }

  @Override
  public default boolean retainAll(Collection<?> c) {
    // 4. Complete this part
    return true;
  }

  @Override
  public default Object[] toArray() {
    // 5. Complete this part
    return null;
  }

  @Override
  public default <T> T[] toArray(T[] array) {
    // 6. Complete this part
    return null;
  }
}

//From this point you should complete the TwoWayLinkedList class
class TwoWayLinkedList </*complete tis part*/> {
  // Enter required fields:

  /** Create a default list */
  public </*complete this part*/>() {
  }

  /** Create a list from an array of objects */
  public </*complete tis part*/> {
    </*complete this part*/>
  }

  /** Return the head element in the list */
  public E getFirst() {
    </*complete this part*/>
  }

  /** Return the last element in the list */
  public E getLast() {
    </*complete tis part*/>
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    /*complete tis part*/
        result.append("]"); // Insert the closing ] in the string
      }
    }

    return result.toString();
  }

  /** Clear the list */
  public void clear() {
    /*complete this part*/
  }

  /** Return true if this list contains the element o */
  public boolean contains(Object e) {
    /*complete this part - Extra points*/
    return true;
  }

  /** Return the element from this list at the specified index */
  public E get(int index) {
    /*complete this part - Extra points*/
    return null;
  }

  /**
   * Return the index of the head matching element in this list. Return -1 if
   * no match.
   */
  public int indexOf(Object e) {
    /*complete this part - Extra points*/
    return 0;
  }

  /**
   * Return the index of the last matching element in this list Return -1 if
   * no match.
   */
  public int lastIndexOf(Object e) {
    /*complete this part - Extra points*/
    return 0;
  }

  /**
   * Replace the element at the specified position in this list with the
   * specified element.
   */
  public E set(int index, E e) {
    /*complete this part - Extra points*/
    return null;
  }

  private class LinkedListIterator implements java.util.ListIterator<E> {
    private Node<E> current = head; // Current index

    public LinkedListIterator() {
    }
    
    public LinkedListIterator(int index) {
      if (index < 0 || index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
          + size);
      for (int nextIndex = 0; nextIndex < index; nextIndex++)
        current = current.next;
    }
    
    public void setLast() {
  	current = tail;
    }
    
    @Override
    public boolean hasNext() {
      return (current != null);
    }

    @Override
    public E next() {
      E e = current.element;
      current = current.next;
      return e;
    }

    @Override
    public void remove() {
      /*complete this part - Extra points*/
    }

    @Override
    public void add(E e) {
      /*complete this part - Extra points*/
    }

    @Override
    public boolean hasPrevious() {
      return current != null;
    }

    @Override
    public int nextIndex() {
      /*complete this part - Extra points*/
      return 0;
    }

    @Override
    public E previous() {
      /*complete this part*/
      return e;
    }

    @Override
    public int previousIndex() {
      /*complete this part*/
      return 0;
    }

    @Override
    public void set(E e) {
      current.element = e; // TODO Auto-generated method stub
    }
  }

  private class Node<E> {
    </*complete this part*/>
  }

  @Override
  public int size() {
    return size;
  }

  public ListIterator<E> listIterator() {
    return new LinkedListIterator(); 
  }
  
  public ListIterator<E> listIterator(int index) {
    return new LinkedListIterator(index); 
  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    return null;
  }