# Academy
Sourcery Academy code

## Bonus task:
Run command: 
``java Main ``*inputString*
Example: 
``java Main aaabb``  
would provide the input string "aaabb".

### Thought process
It was pretty straigt-forward, task requires to loop through the input string and while doing so count consecutive letters by comparing them. When they are not the same, the letter and it's number of repetitions gets added to the output. Once the loop is finished, the last letter's output is added.

As for the decompresion part, it is guaranteed that the string will have a letter followed by a number, therefore, an iteration goes through 2 symbols. These two values are used alongside the *repeat* function to get the desired output.
