import matplotlib.pyplot as RC_plot
from math import e

# book example 12-17
class RC_circuit_square_wave_input():
    def __init__(self):
        self.initial_voltage = 0.0
        self.final_voltage = 2.5
        self.time_increment = - 0.1*10**-3
        self.resistance = 15.0*10**3
        self.capacitor = 0.0056*10**-6
        self.capacitor_charge_value_temporary = 0.0
        self.capacitor_voltage_charge_values = [0.0]
        self.time_increment_current = 0.0
        self.time_constant = 0.0
        self.exponent = 0.0
        self.time_increment_history = [0.0]

    def RC_compute(self):
        #positive voltage
        for count in range (1,6,1): #intial,pre end cap, increment
            self.time_increment_current = self.time_increment_current + self.time_increment
            self.time_constant = self.resistance * self.capacitor
            self.exponent = self.time_increment_current/self.time_constant
            self.capacitor_charge_value_temporary = self.final_voltage*(1-e**self.exponent)
            self.time_increment_history.append(self.time_increment_current*-1)
            self.capacitor_voltage_charge_values.append(self.capacitor_charge_value_temporary)
        #negative Voltage for this segment the positive and negative voltages are reversed
        self.time_increment_current = 0.0
        for count in range(1,6,1):
            self.time_increment_current = self.time_increment_current + self.time_increment
            print(self.time_increment_current)
            self.exponent = self.time_increment_current/self.time_constant
            self.capacitor_charge_value_temporary = self.final_voltage*(e**self.exponent)
            self.time_increment_history.append((self.time_increment_current*-1)+(0.5*10**-3))
            self.capacitor_voltage_charge_values.append(self.capacitor_charge_value_temporary)
    def discharge_graph(self):
        RC_plot.plot(self.time_increment_history,self.capacitor_voltage_charge_values)
        RC_plot.suptitle("RC circuit capacitor voltage charge levels")
        RC_plot.xlabel("Time in seconds")
        RC_plot.ylabel("Voltage of capacitor")
        RC_plot.show()
    def register_value_tests(self):
        print("The stored initial_voltage is : %.12f \n\n"
              "The stored final_voltage is : %.12f \n\n"
              "The stored time_increment is : %.12f \n\n"
              "The stored resistance value is : %.12f \n\n"
              "The stored capacitor value is : %.12f \n\n"
              "The stored capacitor_charge_value_temporary is : %.12f \n\n"
              "The time constant is  : %.12f \n\n"
              "The exponent value is : %12f \n\n"
               %(self.initial_voltage,self.final_voltage,
               self.time_increment,self.resistance,self.capacitor,
               self.capacitor_charge_value_temporary,
               self.time_constant,
               self.exponent
               )
              )
        print("The capacitor_voltage_charge_values are:")
        print(self.capacitor_voltage_charge_values)
        print("\n\n")
        print("The time_increment_history is:")
        print(self.time_increment_history)
        print("\n\n")
