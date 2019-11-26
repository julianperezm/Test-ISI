package oddOrPos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class oddOrPosTest {
	   @Test public void twoElements() 
	   {
	      int arr[] = {0, 7, 2};
	      assertEquals("twoElements", 2, oddOrPos.oddOrPos(arr));
	   }
	   
	   @Test public void oneElement() 
	   {
	      int arr[] = {0, 0, 2};
	      assertEquals("oneElement", 1, oddOrPos.oddOrPos(arr));
	   }
	   
	   @Test public void threeElements() 
	   {
	      int arr[] = {0, -2, 2, -4};
	      assertEquals("threeElements", 3, oddOrPos.oddOrPos(arr));
	   }
      @Test public void fourElements() 
	   {
	      int arr[] = {0, 7, 2, 4, 5};
	      assertEquals("fourElements", 4, oddOrPos.oddOrPos(arr));
	   }
	   
	    
	}

	// El error es que no tenemos en cuenta los numeros negativos pares 
