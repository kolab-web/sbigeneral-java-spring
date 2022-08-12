package com.example;

public class UserDemo {

	public static void main(String[] args) {
		// creating user object: type variable = new type();
		User user1 = new User("Rajesh", 35);// user1  [name = Rajesh, age = 35]
		user1.userDetails();
		
		User user2 = new User("Vijay", 44); // user2 [name = Vijay, age = 44]
		user2.userDetails();
		
		User user3 = new User(); 
		user3.userDetails();
		
		User.printUserCounter();
	}

}
