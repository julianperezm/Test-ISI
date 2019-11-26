package findLast;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class findLastTest {
	
	   @Test public void firstPosition() 
	   {
	      int arr[] = {0, 7, 2};
	      int y = 7;
	      assertEquals("firstPosition", 1, findLast.findLast(arr, 7));
	   }
	   
	   @Test public void secondPosition() 
	   {
	      int arr[] = {0, 7, 2};
	      int y = 2;
	      assertEquals("secondPosition",2 , findLast.findLast(arr, 2));
	   }
	   
	   @Test public void lastPosition() 
	   {
	      int arr[] = {0, 7, 2, 7, 3, 2};
	      int y = 2;
	      assertEquals("lastPosition",5, findLast.findLast(arr, 2));
	   }
	   
	   @Test public void zeroPosition() 
	   {
	      int arr[] = {9, 7, 2, 4, 5, 6};
	      int y = 9;
	      assertEquals("zeroPosition", 0, findLast.findLast(arr, 9));
	   }
}
// el array no llega hasta la posicion 0 se queda en la 1 

