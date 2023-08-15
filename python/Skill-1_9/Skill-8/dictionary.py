#!/usr/bin/python

studentGrades = {"Ben": 92, "Diane": 97, "Sam": 81}

print(studentGrades["Diane"])

myCar = ({"Make": "Ford", "Model": "Model A", "Year": 2031, "colors":("Blue", "Grey")},
        {"Make": "Chevy", "Model": "Cavalier", "Year": 1997})

print(myCar[0]["colors"][1])

#for item in studentGrades:
#    print(studentGrades[item])

if 92 in studentGrades:
    print("It is!")

if 92 in studentGrades.values():
    print("92 is found in the values!")

values = studentGrades.values()
valuesList = list(values)
print(valuesList[1])

keys = studentGrades.keys()
keyList = list ( keys )
print(keyList)

for i in range(0,len(values)):
    print(studentGrades[keyList[i]])

items = studentGrades.items()
print(items)
itemsList = list( items )
print(itemsList[0][0])