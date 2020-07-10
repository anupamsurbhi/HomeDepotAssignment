### HomeDepotAssignment
Assignment for Data Munging Code kata

## Problem statement
http://codekata.com/kata/kata04-data-munging/ [codekata.com]

#Kata Questions
#To what extent did the design decisions you made when writing the original programs make it easier or harder to factor out common code?

 While developing the second program i realized that there are many similar functions which could make program easy if we keep them in common class (like utility).
 However in one instance it was harder because the football file few input data points are different from weather file.

# Was the way you wrote the second program influenced by writing the first?

Yes, Since the functionality is same, i just copy pasted the weather code into football program and changed the data points. 

#Is factoring out as much common code as possible always a good thing? Did the readability of the programs suffer because of this requirement? How about the maintainability?

 There is pros and cons for both the approach. In most of the cases it is always good to keep the common reusable code in one place. However it may sometime increase the maintainability as any change in common code has to be tested with all the impacted modules
