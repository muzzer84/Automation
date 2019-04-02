
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Using Slash SLash means you can add comments which won't be picked up by Java
		
		System.out.println("I started JAVA learning"); //How to produce text to the output (console)
		
		//how to add 2 numbers (2 + 3 = 5)
		
		int a=2; //declaring the variable 'A' as an interger with the value of 2
		int b=3; //declaring the variable 'B' as an interger with the value of 3
		int Sum=a+b; //Declaring the variable 'Sum' as an interger with the value of 'A + b'
		
		System.out.println(Sum); //If you want to output a variable then enter in the brackets without the '""'
		
		//How to produce the text 'Sum is 5'
		
		System.out.println("Sum is "+Sum); //Enter text in the "" then add '+' then the Variable
		
		//Calling other classes in Java
		System.out.println("I navigated to home page");
		
		//Create a new class (Methods) and enter the code to execute there.
	Methods m=new Methods(); //Creating an Object (Methods) is equal to 'M'. Ie which class to call code from
	
	System.out.println(m.ValidateHeader()); //'m' is the Object, 'ValidateHeader' is the object called from the 'Methods' Class
	

		
	}

}
