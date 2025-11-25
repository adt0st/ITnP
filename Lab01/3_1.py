def describe_person(name, age=30):
    match age%10:
        case 1:
            print(f'{name.title()}, {age} год')
        case 2 | 3 | 4:
            print(f'{name.title()}, {age} года')
        case _:
            print(f'{name.title()}, {age} лет')
describe_person('Иван')
describe_person('иван', 21)
describe_person('Иван', 24)
describe_person('иван', 47)
