package com.example.demo;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameAndIdShowingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameAndIdShowingApplication.class, args);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		while(true) {
			System.out.println("Enter Id: ");
			employee.setId(sc.nextLine()); 
			System.out.println("Enter First name: ");
			employee.setFirstName(sc.nextLine());
			System.out.println("Enter Last name: ");
			employee.setLastName(sc.nextLine());
			System.out.println(employee.getId());
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
		}
		//System.out.println("I LOVE YOU BABE... KISS KISS KISS");
	}

}
