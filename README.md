# AWS Interview Code
This project is the solution to an Amazon interview problem given to me when I interviewed for a Software Engineer position.

The problem:

In any language write a function that receives a string and returns the longest substring of repeating characters.

The solution:

Using java the function iterates over each character in the input examining trailing characters to identify groups of repeating characters.
A group of like characters ends when either a disimilar character is encountered or a space is encountered or an end of line is encountered.
The longest group of repeating characters is saved to a variable that is global in scope to the function.  Prior to returning the longest group of characters the length of the group of longest characters is compared to the length of the input string.  If the length is less than the length of the original input string then the entire group of charaters is returned as a string.  If the length is equal to the length of the input string then the group of like characters less one character is returned as a string.
