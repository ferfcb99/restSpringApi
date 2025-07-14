package com.crudspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringApplication.class, args);

		int lengthArray = 5;
		int[] numbers = new int[lengthArray];

		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		for (int i = 0; i < lengthArray; i++) {
			System.out.println(numbers[i]);
		}

		List<String> names = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			names.add("John");
		}

		names.add("Jane");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		// wrapper classes
		/*
		* Primitive - Wrapper
		* Kind of data - Object
		* int - Integer
		* String - String
		* double - Doubles
		* boolean - Boolean
		* */

		double primitiveNumber = 2.6;




	}

}
