#!/usr/bin/python

fileObject = open("output.text", mode="w")

print("Hello Ben!", file=fileObject)

print("Hello", "Ben", "ThirdValue", sep = ":")

print("Hello" , end = "")
print("Goodbye")

print("Hello", "Ben", "ThirdValue", sep = "-", end="xx")