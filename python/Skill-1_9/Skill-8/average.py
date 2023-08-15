#!/usr/bin/python

import fileinput

studentGrades = {}
total = 0

for line in fileinput.input():
    values = line.strip()
    values = values.split(",")

    studentGrades.update({ values[0] : int(values[1]) })

print(studentGrades)

for student in studentGrades:
    total = total + studentGrades[student]

average = total /len(studentGrades)

print(f"The average grade is: {average}")