#!/usr/bin/python

changeAmt = input("What is the customer's change amount? >")
changeAmt = int(changeAmt)

numQtrs = changeAmt // 25
changeAmt = changeAmt - (numQtrs *25)

numDimes = changeAmt // 10
changeAmt -= (numDimes * 10)

numNickels = changeAmt // 5
changeAmt -= (numNickels * 5)

numPennies = changeAmt // 1
changeAmt -= (numPennies * 1)

print("Quarters: ", numQtrs)
print("Dimes: %s" %numDimes)
print("Nickels: {}" .format(numNickels))
print(f"Pennies: {numPennies}")
print(f"Final Chane Amount: {changeAmt}")

