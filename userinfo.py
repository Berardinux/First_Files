#!/usr/bin/python

userName = input("What is you name? >>> ")
userAge = input ("How old are you? >>> ")
userAgeInt= int(userAge)

print("Hello there " + userName)

userAgeTenTIme = userAgeInt * 10
print("Your age times ten is " + str(userAgeTenTIme))

if (userAgeInt >= 18):
    print( "You are old enough to vote!" )
else:
    print ("You are not old enough to vode")