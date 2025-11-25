def read_file(read_type=0):
    try: 
        with open('example1.txt', 'r', encoding='utf8') as file:
            if not read_type:
                print('Весь файл:\n' + file.read())
            else:
                print('Строки:')
                for line in file:
                    print(line)
    except FileNotFoundError:
        print('Указанный файл не найден!')
read_file(int(input("Выберите тип чтения:\n0 (пустое значение) - весь файл\n1 - построчно\n") or 0))
