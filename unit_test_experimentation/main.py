from unit_test_experimentatition import environment_test
#from unit_test_experimentatition import SimpleTest
from unit_test_experimentatition import unit_test_experimentation
#from test import SimpleTest
import unittest


def main():
#    test_class = environment_test()
    unit_test  = unit_test_experimentation()
#    test_item = SimpleTest()
    unit_test.number_return()
#    test_class.hello_world()
#    unit_test.test_cases()
#    test_item()
    unittest.main()

if __name__ == "__main__":
    main()
