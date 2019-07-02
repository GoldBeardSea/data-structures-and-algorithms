
Lecture Notes: Merge Sort

Compares and inserts values down a line, as if a user looking at one position then accounting for the value to the left and to the right. 

The complexity takes O(n*m) and O(n) in space as it the array in place.

    
      InsertionSort(int[] arr)
      
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp




Lecture Flow

    Sorts
       You need to sort stuff
    Sometimes you sort things incrementally
        Iterating down one at a time and sorting off a chain

Diagram

[Merge Sort](https://www.baeldung.com/wp-content/uploads/2018/09/mergesort1.png)

Algorithm

For the length of an array while starting at position 1, compare the value at arr[i] at any given time and insert it into the built out sequence in the proper order. 

Pseudocode

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a


Readings and References

Watch

    https://www.youtube.com/watch?v=iMT7gTPpaqw


Read

    https://www.geeksforgeeks.org/merge-sort/
    https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/

Bookmark

    https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/

