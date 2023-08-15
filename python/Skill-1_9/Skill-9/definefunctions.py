#!/usr/bin/env python

import time

def GreetUser(name):
    if time.localtime().tm_hour < 12:
        print(f"Good Morning {name}!")
    else:
        print(f"Good Afternoon {name}!")

GreetUser("Ben")

def isVowel(value,pos=1):
    if len(value)< pos:
        return "String too short"
    elif value[pos-1] in ["a","A","e","E","i","I","o","O","u","U"]:
        return f"The value in position {pos} Is a vowel."
    else:
        return f"The value in position{pos} is NOT a vowel."

print(isVowel("Ben",2))
result = isVowel(pos=3, value="Sammy")

print(result)