package lastZero;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class lastZeroTest {

	 @Test public void secondPosition()
	   {
	      int arr[] = {2, 7, 0};
	      assertEquals("secondPosition", 2, lastZero.lastZero(arr));
	   }

	   @Test public void zeroPosition()
	   {
	      int arr[] = {0, 2, 2};
	      assertEquals("zeroPosition", 0, lastZero.lastZero(arr));
	   }

	   @Test public void firstPosition()
	   {
	      int arr[] = {2, 0, 2};
	      assertEquals("firstPosition", 1, lastZero.lastZero(arr));
	   }

	   @Test public void notZero()
	   {
	      int arr[] = {3, 2, 2};
	      assertEquals("notZero", -1, lastZero.lastZero(arr));
	   }

	   @Test public void twoZerosSecond()
	   {
	      int arr[] = {0, 0, 2};
	      assertEquals("twoZeros", 1, lastZero.lastZero(arr));
	   }

	   @Test public void twoZerosFirst()
	   {
	      int arr[] = {0, 0, 2};
	      assertEquals("twoZeros", 0, lastZero.lastZero(arr));
	   }

	}

//Te devuelve la posicion del primer cero, no del ultimo.
