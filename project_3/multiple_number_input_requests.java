package number_counter;
import java.util.Scanner;


public class multiple_number_input_requests
{
  private int array_length ;
  private int [] input_array;
  private int input_register = 1;

  private Scanner user_input = new Scanner(System.in);
  private int count = 0;


  public void load_array()
  {
      System.out.print("Input the length of the list of numbers:");
      array_length = user_input.nextInt();
      input_array = new int[array_length];
      while(input_register != 0 && count < array_length)
        {
          input_register = user_input.nextInt();
          input_array[count] = input_register;
          count++;
        }
 }

 public int[] get_array()
 {
   return(input_array);
 }

}
