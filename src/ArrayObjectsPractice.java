//1. Write a Java program to create a class called "Person" with a name and age attribute. 
     //Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person{
	String name;
	int age;
}

public class ArrayObjectsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.name="Raj";
		p1.age=30;
		
		Person p2= new Person();
		p2.name="Saj";
		p2.age=22;
		
		Person[] person=new Person[2];
		person[0]=p1;
		person[1]=p2;
		
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i].name+" : "+ person[i].age);
		}

	}

}
