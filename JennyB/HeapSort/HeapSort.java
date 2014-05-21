// JENNY BARAN
// APCS2 pd 9
// HW41
// 2014-05-19

/**********
 best case: sorted already, O(nlogn)
 worst case: reverse order, O(nlogn)
 unclear on memory consumption, google-fu led to more confusion
 (how can it be O(1) if every element in data needs a slot in the heap??)
 (/additional/ mem consumption?? what is)
 *********/

import java.util.ArrayList;

public class HeapSort {

    //returns a sorted version of data, data unchanged
    public static Integer[] sort( Integer[] data ) {
	heapify( data );
    } //O(nlogn)

    private void heapify( Integer[] data ) {
	for ( int i = 1; i < data.length; i++ ) {
	    int pos = i;
	    int parentPos;
	    while ( pos > 0 ) {
		parentPos = ( pos - 1 ) / 2;
		if ( data[pos] < data[parentPos] ) {
		    swap( data, pos, parentPos );
		    pos = parentPos;
		}
		else {
		    break;
		}
	    } 
	}
    }

    private void swap( Integer[] data, int pos1, int pos2 ) {
	int temp = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = temp;
    }

    public static void main( String[] args ) {

	Integer[] yo = { 1, 7, 8, 3, 4, 9, 10, 13, 6 };
	System.out.println( "orig: " + java.util.Arrays.toString(yo) );
	System.out.println( "sorted: " + java.util.Arrays.toString(sort( yo )) );
	System.out.println( "orig: " + java.util.Arrays.toString(yo) );

    }//end main

}//end class HeapSort