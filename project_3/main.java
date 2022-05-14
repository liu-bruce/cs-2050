import number_counter.number_repeat_counter;
import number_counter.multiple_number_input_requests;
/*
 task 4
 testing tactics
  1) I either commented out areas of problematic code to isolate it
  2) I incerted print statements
   to read the values in the register
   as they changed.
   In this program
   I had issues when the if statements
   activated when I wanted them or not.
   and compiled.
*/

public class main
{
  private static int [] input_array = {2,4,4,8,8,8,8,2,4,4,0};

  public static void main(String [] args)
  {
    number_repeat_counter number_count = new number_repeat_counter();

    multiple_number_input_requests array_loading = new multiple_number_input_requests();
    array_loading.load_array();
    input_array = array_loading.get_array();

    number_count.number_repeat_count(input_array);

    System.out.print(
    "\nThe longest sequence of repeated value is:" + number_count.get_repeat_value_max() +
     "\n\n With a count of: "+ number_count.get_repeat_count_max() +"\n"+
     "\n with a starting index of: "+ number_count.get_max_count_start_index() + "\n"+
     "\n and a end index of: " + number_count.get_max_count_end_index() + "\n\n");


  }
}
