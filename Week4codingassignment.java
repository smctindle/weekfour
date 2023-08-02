//
 // Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

public class Week4codingassignment {

	public static void main(String[] args) {

		
//1	ages 	
int[] ages ={ 3,9,23,64,2,8,28,93}; 

//1a. I subtracted the first element from the last value.
int sum = ages[ages.length-1] - ages[0]; 
System.out.println(sum);

//1b. I added another element and ran it to make sure it works. 
int[] ages2 ={ 3,9,23,64,2,8,28,93,8}; 
System.out.println(ages2[ages2.length-1]- ages2 [0]);

//1c. I used a loop to calcuate the average of ages. 
double ageSum=0; 
for (int i=0; i<ages.length; i++) {
	ageSum += ages[i]; 
}
System.out.println(ageSum / ages.length);

//2
String[] names = {"Sam","Tommy","Tim", "Sally", "Buck","Bob"};

//2a. I used a loop to calculate the averae number of letters per name. 
double nameSum = 0; 
for (String name : names) {
	nameSum += name.length(); 
}
System.out.println(nameSum / names.length);

//2b. I printed out all the names. 
for (String str : names) {
	System.out.println(str);
	
}
//3 I showed how to access the last element. 
System.out.println(names[5]);
//4 I showed how to access the first element.
System.out.println(names[0]);

//5 I used a loop to print each name with there lenght of letters. 
for(String str : names) {
	System.out.println(str + " " + str.length() );
}

//6 I used a loop to calculate the sum of all the elements. 
int namesLengthsum = 0;
for (String name : names) {
namesLengthsum += name.length();	
}

System.out.println(namesLengthsum + names.length);
//7answer
System.out.println(questionSeven ("Word" , 3));
//8answer
String firstName = "Zoel"; 
String lastName = "Tindle"; 
String fullName = createFullName(firstName,lastName); 
System.out.println(fullName);

//9answer
int [] numberArray = {70, 4, 90}; 
System.out.println(isSumGreater(numberArray));

//10answer
double [] doubleArray = {15, 12, 10}; 
System.out.println(findAverage(doubleArray));

//12answer 
boolean isHotOutside = true; 
double moneyInPocket = 11.00; 
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));

}
//8	A method that takes two strings. 
	public static String createFullName(String firstName, String lastName) {
		return  firstName + " " + lastName ;
}
		
//7 A method that takes string and int. 
public static String questionSeven(String str, int num) {
	String result= ""; 
	for(int i= 0; i<num; i++) {
		result += str; 
	}
	return result; 
}



//9 A method that takes an array of int and return true or false. 
public static boolean isSumGreater(int [] numbers) {
	int sum=0; 
	for(int number : numbers) {
		sum += number; 
		if(sum >100) {
			return true; 
		}else {
}
	}

	return false;
	
}
//10 A method that taked an array of double. 
public static double findAverage(double [] numbers) {
		double sum=0.0; 
		for (double number : numbers) {
			sum+=number; 
		}
		return sum / numbers.length; 	
}

	//12. 
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50)
		return true; 
	else 
		return false; 
		
	}
	
	
}





	
	
	
	
