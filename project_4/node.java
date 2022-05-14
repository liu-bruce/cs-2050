//1)

package project_4_lib;

public class node<E>
{
  protected E data_field;

  
  protected <E> next_node;
  protected <E> previous_node;


  public node (E data)
  {
    data_field = data;
  }

  public void read_all_notes()
  {
      protected <E> current_node = next_node;
      while (current_node != null)
      {
        System.out.println(current_node);
        current_node = current_node.next;
      }
  }
  public void add_to_front(E new_data)
  {
    node <E> new_front_node = new node<>(new_data);
    new_front_node.next = next_node;
    next_node = new_front_node;


  }
}
