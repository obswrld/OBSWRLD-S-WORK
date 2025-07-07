import random

def guess_game():
    computer_choice = random.randint(1, 1000)
    user_choice = 0

    while user_choice != -1:
        user_choice = int(input("\nGuess a number between 1 and 1000: "))

        if user_choice == -1:
            print("\nExiting...")
            break
        elif user_choice > computer_choice:
            print("\n Too High")
        elif user_choice < computer_choice:
            print("\n Too Low")
        else:
            print("\n Correct")
            break
guess_game()