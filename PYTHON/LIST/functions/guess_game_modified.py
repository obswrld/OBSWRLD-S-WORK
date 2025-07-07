import random

def guess_game_modified():

        computer_choice = random.randint(1, 1000)
        user_choice = 0
        count = 0

        while user_choice != -1:
            user_choice = int(input("Enter number between 1 and 1000: "))
            count += 1

            if user_choice == -1:
                print("\nExiting...")
                break
            elif user_choice == computer_choice:
                print("\nYou guessed correctly!")
                print("\nYou have access to the secret i guess")
                break
            elif user_choice < computer_choice:
                print("\nToo Low")
            else:
                print("\nToo High")
        if count >= 10:
            print("\nYou should be able to do better. Why should it take more up to or more than 10 guesses?")

guess_game_modified()
