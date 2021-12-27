class electronic_equations:
    def __init__(self):
# object call    unknown_1 = electronic_equations()
        self.Volts = 5
        self.Amperes = 4
        self.Watts = unknown_1.Volts * unknown_1.Amperes
        self.string_output = str(unknown_1.Watts) + " Watts"
    # in order to concatenate in python one need to convert to a string first print(self.string_output)


class loop_experimentation:

    #object call
    #   item_name = loop_experimentation()
    #object function call
    #   item_name.function_name()
    def __init__(self):

        self.list_of_numbers = [0,1,2,3,4,85,6,87,5265]
        self.counter = 0
        self.loop_limit = 5
        self.count_increment = 1



    def for_loop(self):
        for count in range(self.loop_limit):
            print(count)

    def for_loop_list_of_numbers(self):
        """
        Outputs a list of list_of_numbers
        """
        for count in self.list_of_numbers:
            print(count)

    def c_style_for_loop(self):
        for count in range (self.counter, self.loop_limit, self.count_increment):
            print(count)

    def while_loop(self):
        while self.counter < loop_limit:
            self.counter = self.counter + count_increment

    def recursion_loop(self):
