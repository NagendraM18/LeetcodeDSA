# LeetcodeDSA
(https:///NagendraM18/LeetcodeDSA)

This repository contains Java solutions for various Data Structures and Algorithms (DSA) problems commonly found on platforms like LeetCode.

## Solutions

This repository includes solutions for the following problems:

1.  [Two Sum](#two-sum)
2.  [Pascal's Triangle](#pascals-triangle)
3.  [Set Matrix Zeroes](#set-matrix-zeroes)
4.  [Next permutation](#next-permutation)
5.  [sort color](#sort-array-with-only-values-0,1,2)
6.  [Buy and sell stock at best price](#Buy-and-sell-stock-at-best-price)
---

### Two Sum

**File:** `TwoSum.java`

This program finds two indices in an array whose elements sum up to a specific target value.

**Approach:**
The solution uses a `HashMap` to store the numbers encountered and their indices. It iterates through the array once, and for each element, it calculates the required complement (`target - current_number`). It then checks if this complement exists in the map. This approach achieves a time complexity of O(n).

**How to Run:**
1.  Compile the Java file:
    ```sh
    javac TwoSum.java
    ```
2.  Run the compiled class:
    ```sh
    java TwoSum
    ```
3.  The program will wait for input from the console. Provide the following in order:
    *   The number of elements in the array.
    *   The elements of the array, separated by spaces or newlines.
    *   The target sum.

The program will output the indices of the two numbers that sum up to the target.

### Pascal's Triangle

**File:** `pascalTriangleDSA.java`

This program demonstrates how to generate Pascal's Triangle and find the value at a specific row and column.

**Approach:**
A function `value1(r, c)` calculates the value at a given row `r` and column `c` by computing the binomial coefficient (r choose c). The `main` method iterates to print the triangle up to a hardcoded number of rows and also prints the value at a specific hardcoded `(r, c)` coordinate.

**How to Run:**
1.  Compile the Java file:
    ```sh
    javac pascalTriangleDSA.java
    ```
2.  Run the compiled class:
    ```sh
    java pascalTriangleDSA
    ```
3.  The program will print the first 5 rows of Pascal's Triangle (from row 0 to 4) and the value at `r=4, c=2`, as these values are hardcoded in the `main` method.

### Set Matrix Zeroes

**File:** `setzeromatrix.java`

This solution modifies an `m x n` matrix in-place. If an element in the matrix is 0, its entire row and column are set to 0.

**Approach:**
To achieve an in-place solution with O(1) extra space, the first row and first column of the matrix are used as markers.
1.  The code iterates through the matrix to mark the corresponding first-row and first-column elements if a zero is found.
2.  A separate variable `firstcolumn` is used to track if the first column itself needs to be zeroed.
3.  It then re-iterates from the second row and column, setting elements to zero based on the markers in the first row/column.
4.  Finally, it updates the first row and first column based on the initial markers.

**How to Use:**
This file provides a `Solution` class with a `setZeroes` method, as is typical in a LeetCode environment. It does not contain a `main` method and cannot be executed directly. To use it, you would integrate it into a larger application like this:

**Next permutation**
 Here i have used java code to find the next permuatation  
 1)Finding the break point for swapping the value
 2)finding the  lagest value  and nearest value to the breakpoint index
 3)reverseing the remaing things in array 
 4)if index =-1 then their is no breakpoint  just reverse the array to next permuatation

 **Sort color [array value will be only 0,1,2**
  1) we will run a loop first and identify the count values 
  2) after we will run 3 for loop and  and assign the present value with array

**Buy-and-sell-stock-at-best-price**
1) where we are finding the  minimun price we bougth
2) after find the day we will - with day in which we are selling
3) we ill get the profit
4) we can change the mini value and profit value if the condition not match
