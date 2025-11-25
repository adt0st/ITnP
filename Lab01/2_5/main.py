def is_prime(number):
    if number <= 1:
        state = False
    else:
        state = True
        for i in range(2, int(number**0.5) + 1):
            if number % i == 0:
                state = False
                break
        print(number, state)
is_prime(2)
is_prime(3)
is_prime(4)
is_prime(5)
is_prime(6)
is_prime(7)
is_prime(8)
is_prime(9)
is_prime(10)
is_prime(11)
