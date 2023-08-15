#!/usr/bin/env python
import dis

doubleIt = lambda x: x*2

print(doubleIt(5))

def doubleItFunc(x):
    return x*2

#print(doubleItFunc(5))

#print(doubleItFunc)
#print(dis.dis(doubleItFunc))

#print(doubleIt)
#print(dis.dis(doubleIt))

my_list = [1, 5, 4, 6, 8, 11, 3, 12]

newList = filter( lambda x: (x%2 == 0), my_list)
newList = list(newList)
print(newList)
