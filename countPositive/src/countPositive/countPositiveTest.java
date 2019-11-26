package countPositive;

import static org.junit.Assert.*;
import org.junit.*;

public class countPositiveTest
{

   @Test public void ThreePostives() 
   {
      int arr[] = {2, 7, 0};
      assertEquals("ThreePostives", 2, countPositive.countPositive(arr));
   }

   @Test public void NonPositives() 
   {
      int arr[] = {-1, -2, -3};
      assertEquals("NonPositives", 0, countPositive.countPositive(arr));
   }

   @Test public void twopositives() 
   {
      int arr[] = {2, 4, -2};
      assertEquals("twopositives", 2, countPositive.countPositive(arr));
   }
   
   @Test public void onepostive() 
   {
      int arr[] = {2, -2, -2};
      assertEquals("onepostive", 1, countPositive.countPositive(arr));
   }
}
// El error en este programa es que estamos considerando el 0 como numero positivo y no lo es por eso el
//primer test da error