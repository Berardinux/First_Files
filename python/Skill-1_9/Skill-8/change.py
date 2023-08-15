#!/usr/bin/python

changeAmt = input("What is the cutomer's change amount? >")
changeAmt = int(changeAmt)

coins = [25,10,5,1]
coinCounts = [0,0,0,0]
coinNames = ["Quarters","Dimes","Nickels","Pennies"]


for i in range(0, len(coins)):
    coinCounts[i] = changeAmt // coins[i]
    changeAmt = changeAmt - (coinCounts[i] * coins[i])
    print(f"{coinNames[i]}: {coinCounts[i]}")
