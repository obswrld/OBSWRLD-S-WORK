import random

from scipy.constants import value


def  get_multiplication_question():
    num1 = random.randint(1, 9)
    num2 = random.randint(1, 9)
    question = f"What is {num1} * {num2}?\n"
    answer = num1 * num2
    return question, answer

def get_multiplication_question_quiz():
    question, correct_answer = get_multiplication_question()
    while True:
        user_answer = int(input(question))
        if user_answer == correct_answer:
            print("\nYou got it!")
            break
        else:
            print("\nWrong answer!")

get_multiplication_question_quiz()