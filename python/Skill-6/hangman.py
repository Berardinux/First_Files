#!/usr/bin/python

secretWord = "CBTNuggets"
lettersGuessed = ""

failureCount = 6

while failureCount > 0:

    # Get the guessed Letter from the player
    guess = input("Enter a letter: ")
    if guess in secretWord:
        # Player guessed a correct Letter!
        print(f"Corect! There is one or more {guess} in the secret word.")
    
    else:
        failureCount -= 1
        print(f"Incorrect. There are {guess} in the secret word. {failureCount} turn(s) left.")
    
    # Maintain a List of all Letters guessed
    lettersGuessed = lettersGuessed + guess
    wrongLetterCount = 0
    
    for letter in secretWord:
        if letter in lettersGuessed:
            print(f"{letter}", end="")
        else:
            print("_", end="")
            wrongLetterCount += 1
    
    # If there were no wrong Letters, then the player won!
    if wrongLetterCount == 0:
        print(f"Congratulations! The secret word was: {secretWord}. You won!")
        break
else:
    print("Sorry, you didn't win it this time. Try Again!")