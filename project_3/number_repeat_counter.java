package number_counter;

public class number_repeat_counter
{
  private int number_repeat_count = 0;
  private int number_repeat_count_max = 0;

  private int number_repeat_value;
  private int number_repeat_value_max ;

  private int number_value_current;
  private int number_value_previous;

  private int max_count_start_index;
  private int max_count_end_index;

  /*
  task 1
    within a for loop my algorythm finds the max count values
    with the current index and compares it to the preious index
    since I didn't want to get a index out of bounds excemption

  task 2
  space complexity
    The # of registers used is 8 + the size of the given array.
  time complexity
    The time of computaion is O (n)

  Since there are alot of if statments I think the

    worst case: is if the list has a incrementing sequnce of values.
    22 333 4444 for instance. then the full algorythm would have to run.

    best case: is if the largest sequence of numbers came first.
    333 22 1 for instance. The some of the if statments will not have to run.

    average case: hard to predict
  */

  public void number_repeat_count(int[] input_array)
  {

    // task 5c Big O notation is n Since there is a single for loop without any boundry modifications
    for(int count = 0 ; count < input_array.length ; count++ )
    {
      this.number_value_current = input_array[count];
      if(this.number_value_current == this.number_value_previous)
      {
          this.number_repeat_count++;
          this.number_repeat_value = input_array[count];
      }
      //task 5b this if statement finds the starting value of the largest count of repeated inputs
      if(this.number_repeat_count == this.number_repeat_count_max )
      {
        this.max_count_start_index = count ;
      }

      if(this.number_value_current != this.number_value_previous && this.number_repeat_count > this.number_repeat_count_max)
      {
        this.number_repeat_count_max = this.number_repeat_count;
        this.number_repeat_count = 0;
      }
      /* task 5a
        this if statement pushes the max count number value to be stored in this number_repeat_value_max
        otherwise number_repeat_value would store 4 the next repeated sequence
       also it stores the index of the max index of the repeated value
      */
      if(this.number_repeat_count >= this.number_repeat_count_max)
      {
        this.number_repeat_value_max = this.number_repeat_value;
        this.max_count_end_index = count;
      }

      this.number_value_previous = input_array[count];
    }
  }// end for
  public int get_max_count_start_index()
  {
    return (this.max_count_start_index);
  }
  public int get_max_count_end_index()
  {
    return(this.max_count_end_index);
  }
  public int get_repeat_count_max()
  {
    return(this.number_repeat_count_max);
  }
  public int get_repeat_value_max()
  {
    return(this.number_repeat_value_max);
  }
  public void set_count_zero()
  {
    this.number_repeat_count = 0;
  }
}
