//Angela Lin
//APCS2 pd. 9
//HW41: But I Already Have a Quick Sort
//2014-05-19

/*
Big-O notation strikes again!

As the homework title hints, HeapSort is like QuickSort in that the average/amortized runtime for HeapSort is O(n log n): Adding and removing elements to the heap has a O(log n) runtime, but we must then go through the entire heap n times, the runtime is log n * n or )(log n). (Not entirely sure about this part but...) It seems like the best scenario and worst scenario runtimes would both have an O(n log n) runtime. No matter whether or not the array is already sorted or not, we will still add the value to its proper place in the heap and then remove each element from the heap. However, in the case of an already-sorted array, the add function in building the heap will not have to swap with its parents, saving a little memory and time. 

 */




import java.util.*;
import java.io.*;

public class HeapSort {

    /* Made not useful since hSort's return type is another array, not void
    //helper function that helps switch the element at pos1 with the element at pos2 in array arr
    public void swapper(Integer[] arr, Integer pos1, Integer pos2){
	Integer temp = arr[pos1];
	arr[pos1] = arr[pos2];
	arr[pos2] = temp;
    }
    */
    public Integer[] hSort(Integer[] input){
	ALHeap heap = new ALHeap();
	//add elements to the heap
	for (int i = 0; i<input.length; i++){
	    heap.add(input[i]);
	}

	Integer[] retArr = new Integer[input.length];
	int counter = 0;
	//remove min value from the heap and add it to a new array :)
	while (heap.isEmpty()!=true){
	    retArr[counter] = heap.removeMin();
	    counter++;
	}
	return retArr;
    }

 

    public static void main(String[] args){

	HeapSort test1 = new HeapSort();
	Integer[] testA = {34,1,5,0,23};
	System.out.println(Arrays.toString(testA));
	System.out.println(Arrays.toString(test1.hSort(testA)));


	Integer[] testB = {34,12,54,17,45,20,6,1,5,0,23};
	System.out.println(Arrays.toString(testB));
	System.out.println(Arrays.toString(test1.hSort(testB)));

	Integer[] testC = {34,1,5,10,33,11,21,0,23};
	System.out.println(Arrays.toString(testC));
	System.out.println(Arrays.toString(test1.hSort(testC)));



    }








}