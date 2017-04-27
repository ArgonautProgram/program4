
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1, circle2, circle3; //Added circle2 and circle3
   private Circle2 circle2_1, circle2_2, circle2_3; //Added line for Circle2

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   circle2 = new Circle1(2,3,2);
   circle3 = new Circle1(4,4,1);
   circle2_1 = new Circle2(1,2,3);
   circle2_2 = new Circle2(2,3,4);
   circle2_3 = new Circle2(4,4,1);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(2,3);
   Assert.assertTrue(p.x == 3 && p.y == 5);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-4);
   Assert.assertTrue(p.x == 0 && p.y == -2);
}

// 
// Tests Circle.scale()
//
// doubleRadius runs Circle.scale() with static values and checks 
// the predicted result.
//
@Test
public void doubleRadiusTest()
{
   System.out.println("Running test doubleRadiusTest.");
   circle1.radius = circle1.scale(2.0);
   Assert.assertTrue(circle1.radius == 6);
}

// 
// Test Circle1.intersects()
//
// intersectTest runs Circle1.intersects() with an intersecting 
// circle, and checks the predicted result.
//
@Test
public void intersectTest()
{
   System.out.println("Running test intersectTest.");
   Assert.assertTrue(circle2.intersects(circle1) == true);
}

// 
// Test Circle1.intersects()
//
// falseIntersectTest runs Circle1.intersects() with a non-intersecting 
// circle, and checks the predicted result.
//
@Test
public void falseIntersectTest()
{
   System.out.println("Running test falseIntersectTest.");
   Assert.assertTrue(circle3.intersects(circle1) == false);
}

//
// Test a simple positive move with Circle2
//
@Test
public void simpleMove2()
{
   Point p;
   System.out.println("Running test simpleMove2.");
   p = circle2_1.moveBy(2,3);
   Assert.assertTrue(p.x == 3 && p.y == 5);
}

// 
// Test a simple negative move with Circle2
//
@Test
public void simpleMoveNeg2()
{
   Point p;
   System.out.println("Running test simpleMoveNeg2.");
   p = circle2_1.moveBy(-1,-4);
   Assert.assertTrue(p.x == 0 && p.y == -2);
}

// 
// Test Circle2.intersects()
//
// intersectTest2, runs Circle2.intersects() with an intersecting 
// circle, and checks the predicted result.
//
@Test
public void intersectTest2()
{
   System.out.println("Running test intersectTest2.");
   Assert.assertTrue(circle2_1.intersects(circle2_2) == true);
}

// 
// Test Circle2.intersects()
//
// falseIntersectTest2, runs Circle2.intersects() with a non-intersecting 
// circle, and checks the predicted result.
//
@Test
public void falseIntersectTest2()
{
   System.out.println("Running test falseIntersectTest2.");
   Assert.assertTrue(circle2_1.intersects(circle2_3) == false);
}


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

