def add_text(text=''):
    with open('user_input.txt', 'a+', encoding='utf8') as file:
        file.write(text)
add_text(input('Введите текст для записи в файл:\n'))3
