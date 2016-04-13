package com.Array;

import java.util.Arrays;

public class repeatedarray 
{
	public static void main(String[] args) {
	    repeatedarray ra=new repeatedarray();
	    ra.start();
	  }
       private void start() {
    	   
	    /* Example1: 1, 1, 2, 3, 4, 5 should display as: 1, 2, 3, 4, 5, 6 */
    	   
   System.out.println(Arrays.toString(correctSequence(new int[] {1, 1, 2, 3, 4, 5})));
	    
	    
	    /* Example2: 1, 2, 2, 3, 4, 5 should display as: 1, 2, 3, 4, 5, 6 */
   System.out.println(Arrays.toString(correctSequence(new int[] {1, 2, 2, 3, 4, 5})));
	    
	    /* Example3: 2, 3, 4, 5 should display as: 2, 3, 4, 5 */
	    
System.out.println(Arrays.toString(correctSequence(new int[] {2, 3, 4, 5})));
	  }

	  private int[] correctSequence(int[] sequence) {
	    int[] result = new int[sequence.length];
	    for (int i = 0; i < sequence.length; i++) {
	      result[i] = sequence[0] + i;
	    }
	    return result;
	  }

	}



