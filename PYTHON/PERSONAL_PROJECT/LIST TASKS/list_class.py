def main():
    scores = [[75, 55, 45, 80], [78, 35, 27, 90], [66, 89, 90]]
    for index,score in enumerate(scores):
        for inner_index, inner_value in enumerate(score):
            print(f"inner value: {inner_value} {inner_index}")
            print(f"inner index: {inner_index} {inner_index}")
            print(f"inner list: {score} {inner_index}")
            print(f" inner list index: {index}")
            print(f"inner score: {score[index]} {inner_index}")

    days_per_month = {'January': 31, 'February': 28, 'March': 30, 'April': 31}
    for month_name in days_per_month.keys():
        print(month_name, end=' ')
        
    for number_of_days in days_per_month.keys():
        print(days_per_month[month_name])

    number_dic = {1:"One", 2: "Money", 3: "Orange", 4: "four", 5: "Rice"}
    result = number_dic[4]
    print(result)

 #collect the number and return it in words
def convert_numbers_to_words(numbers):
    convert_numbers_to_words = {
        1: 'one',
        2: 'two',
        3: 'three',
        4: 'four',
        5: 'five',
        6: 'six',
        7: 'seven',
        8: 'eight',
        9: 'nine',
        10: 'ten'
    }
    return convert_numbers_to_words.get(numbers, "Invalid number")


if __name__ == "__main__":
    number = int(input("Enter a number: "))
    number_words = convert_numbers_to_words(number)
    print(f"The number is {number} {number_words}")
    #main()