package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	
	public static List<Person> people = new ArrayList<Person>();
	
	private String name;
	private int age;
	private String job;
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
		people.add(this);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nJob: " + job + "\n";
	}
	
	public static void toStringAll() {
		for (Person person : people) {
			System.out.println("Name: " + person.name + "\nAge: " + person.age + "\nJob: " + person.job + "\n");			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public static Person searchByName(String name) {
		for (Person person : people) {
			if (person.getName().equals(name)) {
				System.out.println(person);
				return person;
			}
		}
		return null;
	}
	
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("1) Create a person\n2) Show all\n3) Search for 1 by name");
		choice = scan.nextInt();
//		scan.next();
		
		switch (choice) {
		case 1:
			System.out.println("Name?");
			scan = new Scanner(System.in);
			String name = scan.nextLine();
			System.out.println("Age?");
			scan = new Scanner(System.in);
			int age = scan.nextInt();
			System.out.println("Job?");
			scan = new Scanner(System.in);
			String job = scan.nextLine();
			new Person(name, age, job);
			Person.toStringAll();
			break;
		case 2:
			Person.toStringAll();
			break;
		case 3:
			System.out.println("Name to search?");
			scan = new Scanner(System.in);
			String nameSearch = scan.nextLine();
			Person.searchByName(nameSearch);
			break;
		default:
			System.out.println("Gimme something!");
		}
		
	}
	
}
