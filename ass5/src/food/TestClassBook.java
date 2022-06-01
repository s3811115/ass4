package food;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClassBook {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test//invalid correct data
	 void testAddFood_testCase1() { 
	     
	  //Test Case 1_Test Data 1 
		Food foodtestCase1Data1 = new Food ("120","1abcd", "First Food AB AC AD AE", 10, 5, "Kid Food"); 
	  //assertEquals ("The food information has been added", foodtestCase1Data1.AddBook()); 
	  //Test Case 1_Test Data 2 
		Food foodtestCase1Data2 = new Food ("121","2abcd", "First Food AB BC AD AE", 10, 39, "Kid Food"); 
	  //assertEquals ("The food information has been added", foodtestCase1Data2.AddBook()); 
	   
		Food foodtestCase1Data3 = new Food ("122","3abcd", "First Food AB CC AD AE", 10, 249, "western Food"); 
	  //assertEquals ("The food information has been added", foodtestCase1Data3.AddBook()); 
	   
	  assertAll ("", ()->assertEquals("The book information can be added", 
			  foodtestCase1Data1.AddFood()), 
	    ()->assertEquals ("The book information can be added", 
	    		foodtestCase1Data2.AddFood()), 
	      ()->assertEquals ("The book information can be added", 
	    		  foodtestCase1Data3.AddFood())); 
	      
	 } 
	@Test//Check the function with valid id
	 void testAddFood_testCase2() { 
	     
	  //Test Case 2_Test Data 1 
		Food foodtestCase2Data1 = new Food ("120","1abcd", "First Food AB AC AD AE", 10, 5, "Kid Food"); 
	  //assertEquals ("The food information has been added", foodtestCase2Data1.AddFood()); 
	  //Test Case 2_Test Data 2 
		Food foodtestCase2Data2 = new Food ("a121","2abcd", "First Food AB AC AD AE", 10, 5, "Kid Food"); 
	  //assertEquals ("The food information has been added", foodtestCase2Data2.AddFood()); 
	   
		Food foodtestCase2Data3 = new Food ("aaa122","3abcd", "First Food AB AC AD AE", 10, 5, "Kid Food"); 
	  //assertEquals ("The food information has been added", foodtestCase2Data3.AddFood()); 
	   
	  assertAll ("", ()->assertEquals("The book information can be added", 
			  foodtestCase2Data1.AddFood()), 
	    ()->assertEquals ("The book information can be added", 
	    		foodtestCase2Data2.AddFood()), 
	      ()->assertEquals ("The book information can be added", 
	    		  foodtestCase2Data3.AddFood())); 
	   
	 } 
	@Test//Check the function with valid name
	 void testAddFood_testCase3() { 
	     
	  //Test Case 3_Test Data 1 
		Food foodtestCase3Data1 = new Food ("123","MC", "chicken", 10, 15, "fry Food"); 
	  //assertEquals ("The food information has been added", foodtestCase2Data1.AddFood()); 
	  //Test Case 3_Test Data 2 
		Food foodtestCase3Data2 = new Food ("123","KFC", "chicken", 10, 15, "fry Food"); 
	  //assertEquals ("The food information has been added", foodtestCase2Data2.AddFood()); 
	   

	   
	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase3Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase3Data2.AddFood()));
 
	     
	   
	 } 
	 @Test //Check the function with valid description
	 void testAddBook_testCase4() { 
		 Food foodtestCase4Data1 = new Food ("123","MC", "a", 10, 15, "fry Food");
		 Food foodtestCase4Data2 = new Food ("123","MC", "a", 10, 15, "fry Food"); 
	 
		  assertAll ("", ()->assertEquals("The book information can not be added", 
				  foodtestCase4Data1.AddFood()), 
		    ()->assertEquals ("The book information can not be added", 
		    		foodtestCase4Data2.AddFood()));
	} 


@Test //Check the function with valid price
void testAddBook_testCase5() { 
	 Food foodtestCase5Data1 = new Food ("123","McDonald's", " chicken ", 2, 15, "fry Food");
	 Food foodtestCase5Data2 = new Food ("123","McDonald's", " chicken ", 300, 15, "fry Food"); 

	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase5Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase5Data2.AddFood()));
} 

@Test //Check the function with valid calorie
void testAddBook_testCase6() { 
	 Food foodtestCase6Data1 = new Food ("123","McDonald's", " chicken ", 10, 3000, "fry Food");
	 Food foodtestCase6Data2 = new Food ("123","McDonald's", " chicken ", 10, 5000, "fry Food"); 

	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase6Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase6Data2.AddFood()));
} 

@Test //Check the function with valid calorie
void testAddBook_testCase7() { 
	 Food foodtestCase7Data1 = new Food ("123","FKC", "a", 10, 15, "fry Food");
	 Food foodtestCase7Data2 = new Food ("123","MC", "a b", 10, 15, "fry Food"); 

	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase7Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase7Data2.AddFood()));
} 
@Test //Check the function with valid calorie
void testAddBook_testCase8() { 
	 Food foodtestCase8Data1 = new Food ("123"," McDonald's ", "chicken", 10, 1500, "Kid Food");
	 Food foodtestCase8Data2 = new Food ("123"," McDonald's ", "chicken", 10, 1500, "Kid Food"); 

	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase8Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase8Data2.AddFood()));
} 
@Test //Check the function with valid calorie
void testAddBook_testCase9() { 
	 Food foodtestCase9Data1 = new Food ("123","McDonald's", " chicken ", 120, 1500, "fry Food");
	 Food foodtestCase9Data2 = new Food ("123","McDonald's", " chicken ", 150, 3000, "fry Food"); 

	  assertAll ("", ()->assertEquals("The book information can not be added", 
			  foodtestCase9Data1.AddFood()), 
	    ()->assertEquals ("The book information can not be added", 
	    		foodtestCase9Data2.AddFood()));
} 

}
