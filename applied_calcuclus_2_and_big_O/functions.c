#include "functions.h"
#include <stdio.h>
#include <math.h>
void fractional_factorial_probalitity(int upper_factorial, int lower_factorial)
{
  int range = 0;
  range = upper_factorial - lower_factorial;

  double factorial_current_buffer = 0.0,
         factorial_current_result = 0.0,
         denominator = 0.0;
  double chance = 0.0;
  for (int count = 1 ; count <= range ;count++)
  {
    denominator = (lower_factorial+(double)count);
    factorial_current_buffer = 1/denominator;
    factorial_current_result = factorial_current_buffer + factorial_current_result;
    printf("the expected fractional factorial probalitity is %f \n\n"
          "the denominator is %f\n\n"
          "count is %i \n\n"
         ,factorial_current_result, denominator,count );

  }
  printf("the expected fractional factorial probalitity is %f \n\n"
          ,factorial_current_result );
}

void fractional_factorial_probalitity_natral_log_version(double upper_factorial, double lower_factorial)
{
  double result = 0.0;
  result = log(upper_factorial) - log(lower_factorial);
  printf("The probalitity is %f \n\n",result );

}
