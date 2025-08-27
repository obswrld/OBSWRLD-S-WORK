tom_exp_list = [200, 450, 1200, 300]
cad_exp_list = [250, 400, 1500, 600]

total = 0
for item in tom_exp_list:
    total = item + total
print(total)

for item in cad_exp_list:
    total = item + total
print(total)