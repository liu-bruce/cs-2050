import unittest

class unit_test_experimentation():
    def __init__(self):
        self.number = 56
    def number_return(self):
        print(self.number)

    def test_cases(self):
        self.assertEqual(self.number ,self.number)
"""
class SimpleTest():

    def test1(self):
        self.assertEqual(self.item_1,self.item_2)
    def test2(self):
        self.assertNotEqual(5 * 2,10)
    def test3(self):
        self.assertTrue(4 + 5 == 9,"The result is False")
    def test4(self):
        self.assertTrue(4 + 5 == 10,"assertion fails")
    def test5(self):
        self.assertIn(3,[1,2,3])
    def test6(self):
        self.assertNotIn(3, range(5))
"""
class environment_test:
    def __init__ (self):
        self.string_storage = "hello world"

    def hello_world(self):
        print(self.string_storage)
