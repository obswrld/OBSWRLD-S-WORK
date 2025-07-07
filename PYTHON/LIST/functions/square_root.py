import random

def get_square_root(num):
    return num ** (1/2)

def get_larget_number(num1, num2, num3):
    max_num = num1
    if num2 > max_num:
        max_num = num2
    if num3 > max_num:
        max_num = num3
    return max_num

for roll in range(10):
    print(random.randint(1, 6),  end= ' ')
print()


frequency1 = 0
frequency2 = 0
frequency3 = 0
frequency4 = 0
frequency5 = 0
frequency6 = 0

for roll in range(6_000_000):
    face = random.randrange(1, 6)

    if face == 1:
        frequency1 += 1
    elif face == 2:
        frequency2 += 1
    elif face == 3:
        frequency3 += 1
    elif face == 4:
        frequency4 += 1
    elif face == 5:
        frequency5 += 1
    else:
        frequency6 += 1

print(f'face {"Frequency":>13}')
print(f'{1:>4}{frequency1:>13}')
print(f'{2:>4}{frequency2:>13}')
print(f'{3:>4}{frequency3:>13}')
print(f'{4:>4}{frequency4:>13}')
print(f'{5:>4}{frequency5:>13}')
print(f'{6:>4}{frequency6:>13}')


def roll_dice():
    die1 = random.randrange(1, 6)
    die2 = random.randrange(1, 6)
    return (die1, die2)

def display_dice(dice):
    die1, die2 = dice
    print(f'player rolled {die1} + {die2} = {sum(dice)}')

die_values = roll_dice()
display_dice(die_values)

sum_of_dice = sum(die_values)

if sum_of_dice in (7, 11):
    game_status = 'Won'
elif sum_of_dice in (2, 3, 12):
    game_status = 'Lost'
else:
    game_status = 'Continue'
    my_point = sum_of_dice
    print("Point is ", my_point)

while game_status == 'Continue':
    die_values = roll_dice()
    display_dice(die_values)
    sum_of_dice = sum(die_values)

    if sum_of_dice == my_point:
        game_status = 'Won'
    elif sum_of_dice == 7:
        game_status = 'Lost'
if game_status == 'Won':
    print("Player won")
else:
    print("Player lost")





