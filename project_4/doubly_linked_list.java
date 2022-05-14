public class doubly_linked_list<e>
{
  protected  E data_field; // data
  protected  Node <E> next;
  protected  Node <E> previous;
  protected  int  list_size ;
  public doubly_linked_list()
  {}
  public doubly_linked_list(E[] data_inputs)
  {

  }
 public void read_nodes ()
 {
  Node<E> current_node = next;
   while (current_node != null)
   {
     System.out.println(current_node.element);
     current_node = current_node.next;
   }
 }

// list adding functions
public void add_to_front(E data_field)
{
  Node <E> New_front_Node = new Node<>(data_field);
  New_front_Node.next = next;
  next = New_front_Node;
  list_size++;
  if(previous == null)
  {
    previous = next;
  }


}

public void add_to_end(E data_field)
{
  if (previous == null)
  {
    next = previous = new Node<>(data_field);
  }
  else
  {
    previous.next = new node <>(data_field);
    previous = previous.next;
  }
  list_size++;
}

public void add_at_index(int index , E data_field)
{
  if(index = 0)
  {
    add_to_front(data_field);
  }
  else if (index >= list_size)
  {
    add_to_end(data_field);
  }
  else
  {
    Node <E> current_node = head;
    for (int count = 1; count < list_size ; count++)
    {
      current_node = current_node.next;
      Node<E> temp = current_node.next;
      current_node.next = new Node<>(data_field);
      (current_node.next).next = temp;
      list_size ++;
    }
  }
}

// list removing functions
public E remove_front()
{
  if(size == 0)
  {
    return null;
  }
  else
  {
    Node<E> temp = next;
    next = next.next;
    list_size--;
    if(next == null)
    {
      previous = null;
      return temp.element;

    }
  }

  public E remove_from_end()
  {
    if(size == 0 )
    {
      return null;
    }
    else if (size == 1)
    {
      Node <E> temp = next;
      next = tail = null;
      list_size = 0;
      return temp.element;
    }
    else
    {
      Node<E> current_node = next;
      for(int count = 0; count < list_size-2 ; count++)
      {
        current_node = current_node.next;
        Node temp = tail;
        tail = current_node;
        tail.next = null;
        list_size--;
      }
      return temp.element;
    }
  }


}
