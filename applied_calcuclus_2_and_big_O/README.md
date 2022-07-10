I chose to apply my calculus 2 knowledge with big o notation

the function
void fractional_factorial_probalitity(int upper_factorial, int lower_factorial)
is the factorial result 1/(upper_factorial -lower_factorial)


the function
void fractional_factorial_probalitity_natral_log_version(double upper_factorial, double lower_factorial)
which is the applied calculus 2 version which should have produced the same results but there is a slight bug.
I don't know if this is a bug in math or floating point number representation. But this version required a upper_factorial offset of 1. 
