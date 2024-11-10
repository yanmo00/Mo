import re


# 身份证检验
def is_valid(ptn, num):
    if re.match(ptn, num):
        return "Valid"
    return "Invalid"


pattern = r"^[1-9]\d{5}(19|20)\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])\d{3}[\dXx]"
number_list = ["34177720050101745X", "04177720050101745X", "341777200501017459", "3417772005010", "34177720050101745x"]
for number in number_list:
    print(f'{number}: {is_valid(pattern, number)}')
