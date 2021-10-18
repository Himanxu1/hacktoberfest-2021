package oops;

// This file Contains Classes and Objects in JAVA
class Cat{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("My cat has " + legs  + " legs and " + eyes + " eyes" );
	}
	
	
}

//    another class dog
class Dog{
	String breed, name;
	
//	Creating another method
	
	public void jump() {
		System.out.println("my dog name " + name + " jumped" );
	}
	public void description() {
		System.out.println("my dog name is " + name + "  and it's breed is " + breed);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
//		 creating method 
//		
//		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		
//		calling a method
//		
//		cat1.walk();
//		cat2.eat();
//		
//		cat1.description();
//		cat2.description();
//		
//		defining
//        cat1.legs = 3;
//        cat1.eyes = 2;
//        
//        cat2.legs = 1;
//        cat2.eyes = 14;
//        
//        cat1.description();
//        cat2.description();
		Dog husky = new Dog();
		Dog poodle= new Dog();
		
		husky.breed ="Husky";
		husky.name ="ronnie";
		
		poodle.breed ="poodle";
		poodle.name ="rocky";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
		
		
	}

}
