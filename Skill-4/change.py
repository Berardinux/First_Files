#!/usr/bin/python

changeAmt = 84

numQtrs = changeAmt // 25
changeAmt = changeAmt - (numQtrs * 25)

numDimes = changeAmt // 10
changeAmt -= (numDimes * 10)

numNickels = changeAmt // 5
changeAmt -= (numNickels *5)

numPennies = changeAmt // 1
changeAmt -= (numPennies * 1)

print ("Quarters: " + str(numQtrs))
print ("Dimes: " + str(numDimes))
print ("Nickels: " + str(numNickels))
print ("Pennies: " + str (numPennies))