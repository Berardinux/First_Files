#!/usr/bin/env python

myName = 'Ben'

def myFunc(color):
    global myName 
    myName = "Diane"
    print(color)
    print(myName)
    def nestedFunc():
        print(color)
    nestedFunc()

myFunc("red")
print(myName)