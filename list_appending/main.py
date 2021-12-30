from list_append import RC_circuit_square_wave_input

def main():
    rc = RC_circuit_square_wave_input()
    rc.RC_compute()
    rc.discharge_graph()
    rc.register_value_tests()


if __name__ == "__main__":
    main()
