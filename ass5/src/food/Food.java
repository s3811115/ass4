package food;

import java.util.StringTokenizer; 
public class Food { 
 private String foodID;
 private String foodName; 
 private String foodDescription; 
 private double foodprice; 
 private int foodCalorie; 
 private String foodType; 
  
 public Food (String ID, String Name, String Description, double price, int Calorie, String Type) 
 { 
  foodID = ID;
  foodName=Name; 
  foodDescription=Description; 
  foodprice=price; 
  foodCalorie=Calorie; 
  foodType=Type; 
 } 
 public String AddFood () 
  { 
   
  if (foodName.length()<5 || foodName.length()>30)  
  { 
   return "The book information cannot be added1"; 
  } 
  if (foodprice <5 || foodprice > 150)
  { 
	   return "The book information cannot be added4"; 
	  } 
  int countWord= countWordsBookDescription (foodDescription); 
  if (countWord <5 || countWord >50) 
  { 
   return "The book information cannot be added2"; 
  } 
  if ((foodType != "Kid Food" && (foodCalorie >=1500 )) || (foodType 
== "Kid Food" && (foodCalorie >=800 ))) 
   return "The book information cannot be added3"; 
   
   
  return "The book information can be added"; 
  } 
 public int countWordsBookDescription (String book_Description) 
    { 
  StringTokenizer stringTokenizer1 = new StringTokenizer(book_Description); 
  return  stringTokenizer1.countTokens(); 
    } 
} 
 