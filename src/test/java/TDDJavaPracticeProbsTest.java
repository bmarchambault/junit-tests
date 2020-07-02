import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TDDJavaPracticeProbsTest {

   @Test
   public void testHelloWorld(){
       assertEquals("Hello World", TDDJavaPracticeProblems.helloWorld());
   }


}
//JUnit Practice Problems
//
//Create a class, JavaProblems, and a test class, JavaProblemsTest. Use a TDD approach to create tests and solutions for the following public static methods:
//
//1. Create a method, returnHelloWorld, that returns the string "Hello World"
//
//2. Create a method, addInts, that takes in two integers and returns their sum
//
//3. Create a method, intToLong, that takes in an integer and returns the same number as a long data type
//
//4. Create a method numericStringToDouble that takes in a numeric string and
//returns the number value as a double.
//
//5. Create a method, doubleToFloat, that takes in a double and returns the number as a float. Assume that the input values will fit within a double data type.
//
//6. Create a method, firstChar, that takes in a string and returns the first character of the string.
//
//7. Create a method, lastChar, that takes in a string and returns the last character of the string.
//
//8. Create a method, capFirst, that takes in a string and returns the string with the first letter capitalized and all other letters in lowercase.
//
//9. Create a method, sameFirstAndLast, that takes in a string and returns true if the first and last character match (not case sensitive).
//
//10. Create a method, sameCase, that takes in two strings. Assume both strings are the same length and only contain letters. The method should return true if both strings share the same sequence letter case.
//
//11. Create a method, combineChars, that takes in two char inputs and returns a string combining them in numeric/alphabetical order. If a combination of a letter and number, the number will come first.
//
//12. Create a method, containsSumOfFour, that takes in a string containing any sequence of letters and numbers. If all numbers in the string add up to four, return true, otherwise, return false.
//
//13. Create a method, isPrime, that takes in a positive integer and returns if the integer is a prime number.
//
//14. Create a method, nextPrime, that takes in a positive integer and returns the next highest prime number.
//
//15. Create a method, lowerPrime, that takes in a positive integer and returns the closest prime number less than the input. If passed one, the method should return 1.
//
//16. Create a method, letterToNumber, that takes in a char letter and returns byte which represents the order in which the letter appears in the alphabet. Upper and lower case versions of the same letter should return the same number.
//
//17. Create a method, lettersToNumber, that takes in a series of letters and numbers and returns a long that combines the number ordering of letters with any existing numbers into a larger long number.
//
//18. Create a method, isPalindrome, and returns true if the passed string input is identical forwards and backwards. This method should be case sensitive.
//
//19. Using overloading, create several methods called combine, that will return the sum of two integers, the product of two bytes, the concatenation of two chars, the longer string of two strings, and the result of two booleans combined with an AND logical operator.
//
//20. Create a method, returnLongerArray, that takes in two arrays of integers and returns the longest array.
//
//21. Create a method, oneMore, that takes in two inputs, an array of integers and a single integer. The method will return another array of integers with the same values of the first array and an additional integer element of the second input.
//
//22. Create a method, javaPop, that takes in an array of any primative type and returns the same array of that datatype with the last element removed. Method overloading will be needed. If only one element is present, return an empty array.
//
//23. Create a method, javaShift, that takes in an array of any primative data type and returns the the array with the first element removed. Method overloading will be needed. If only one element is present, return an empty array.
//
//24. Create a method, stringToCharArray, that takes in a string and returns the characters of the string as an array.
//
//25. Create a method, sumInts, that takes in an array of integers and returns the sum of all integers.
//
//26. Create a method, remove7s, that takes in a list of integers and removes any number sevens and returns the list.
//
//27. Create a method, intArrayToArrayList, that takes in an array of integers and returns an array list of integers.
//
//28. Create a method, listsToMap, that takes in to arraylists of the same length and creates a hashmap with keys matching the first arraylist, set to values matching the second arraylist.
//
//29. Create a method, sameMapValues, that takes in a hashmap and returns true if any keys have matching values, and false if all keys have unique values. Assume the hash map has string keys and integer values.
//
//30. Create a method, concatTwoMapValues, that takes in three inputs total: a hashmap with string keys and string inputs, and two string inputs. The method will return the concatenation of the values of hash map at the keys that match with the string inputs. If no key is found on the hash map matching with one or both of the passed in string inputs, an empty string will be concatentated.
//
//31. Create a method, getStringInfo, that takes in a string and returns a hashmap with the following keys:
//  "length" - containing the length of the passed in string
//  "noOfCs" - containing the number of c's in the pass in string (case insensitive)
//  "indexOfFirstVowel" - containing the index number within the string of the first vowel
//
//32. Create a method, reverseValues, that takes in an arraylist of string values and returns the arraylist with each string in reverse-order
//
//33. Create a method, progressUpMusicKeys, that takes in a letter char and an integer number of how many keys up or down from a given a "key"/"note" the output letter char will be. The musical alphabet is made of the letters A-G. One letter below A will be G. One letter above G will be A.
//
//34. Create a method, hashKeysToList, that takes in a hash map and returns the keys of the map as an array list in alphabetical order.
//
//35. Create a method, intToByte, that takes in an integer and returns the value as a byte. If the byte value is not the same as the integer due to overflow, throw a custom exception called ValueMismatchException. The exception should extend from exception and should not be handled by a try catch in the method.
//
//36. Create a method, generateFibonacciSequence, that takes in an integer and returns the the Fibonacci sequence up to the passed in input.
//
//37. Create a method, returnHalveTheInput, that takes in an integer and returns halve the value as a double.
//
//38. Create a method, returnUniqueValues, that takes in two arraylists of integers and returns only integers that do not appear anywhere in both lists.
//
//39. Create a method, weaveList, that takes in two arraylists of Character letters and returns an arraylist of Character letters of that alternate between the indexes of the first and second arraylist. If one arraylist is longer that another, the remaining letters of the longer list will continue to add to the end of the output arraylist.
