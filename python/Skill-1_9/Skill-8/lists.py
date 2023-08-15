#!/usr/bin/python

studentNames = ["Ben", "Diane", "Sam", "Pat"]

print(studentNames)

print(studentNames[2])

for name in studentNames:
    print(name)

print("#########################################")

studentNames.append("Joe")

for name in studentNames:
    print(name)

print("#########################################")

studentNames.remove("Diane")

for name in studentNames:
    print(name)

print("#########################################")

studentTuple = ("Lori", "Kate", "David")

print(studentTuple[1])

print("#########################################")

studentSet = {"Alan", "Steven", "Bridget"}

for name in studentSet:
    print(studentSet)