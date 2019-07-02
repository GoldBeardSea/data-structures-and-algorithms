
Lecture Notes: Insert Sort

Compares and inserts values down a line, as if a user looking at one position then accounting for the value to the left and to the right. 

The complexity takes O(n*2) and O(1) in space as it utilzes the array in place.

    
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

[The Link to the image here](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/insertionsort.png)

Algorithm

For the length of an array while starting at position 1, compare the value at arr[i] at any given time and insert it into the built out sequence in the proper order. 

Pseudocode

InsertionSort(int[] arr)
      
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp

Readings and References

Watch

    https://www.youtube.com/watch?v=OGzPmgsI-pQ 


Read

    https://www.geeksforgeeks.org/insertion-sort/
    https://en.wikipedia.org/wiki/Insertion_sort

Bookmark

    https://www.geeksforgeeks.org/insertion-sort/

