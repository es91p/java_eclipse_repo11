package com.java8.features;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Java8FeaturesStreams17 {
	public static void main(String[] args) throws IOException {
// 1. Integer Stream 		
		System.out.println("******START***\n");
		System.out.println("******11***");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
	
		System.out.println("******12***");
		IntStream.range(1, 10).skip (5)
		. forEach (x -> System. out.print(x) ) ;
		System.out.println();
		
		System.out.println("******13***");
		IntStream.range(1, 10).skip (5).sum();
		System.out.println();
		
		System.out.println("******14***");
		System.out.println(IntStream.range(1, 10).skip (5).sum());
		System.out.println();
		
		// 4. Stream. of, sorted and findFirst
		System.out.println("******15***");
		Stream.of ("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println) ;
		// 4. Stream. of, sorted and findFirst
		System.out.println("******16***");
		Stream.of ("Ava", "Aneri", "Alberto")
		.sorted()
		.findAny()
		.ifPresent(System.out::println) ;
		
		// 5. Stream from Array, sort, filter and print
		System.out.println("******17***");
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda ", "Hans", "Shivika"};
		Arrays.stream (names)		// same as Stream. of (names)		
		.filter (x -> x.startsWith ("S") )
		.sorted()
		.forEach (System.out::println) ;
		
		// 5. Stream from Array, sort, filter and print
		System.out.println("******18***");
		String[] names11 = {"Al", "Ankit","Sankar", "Kushal", "Brent", "Sarika", "amanda ", "Hans", "Shivika"};
		Arrays.stream (names11)		// same as Stream. of (names)		
		.filter (x -> x.startsWith ("S") )
		.sorted()
		.forEach (System.out::println) ;
				
		//6. average of squares of an int array
		System.out.println("******19***");
		Arrays. stream (new int [] {2, 4, 6, 8, 10})
		.map (x -> x * x)
		.average ()
		.ifPresent (System.out::println) ;
		System.out.println("\n******END***");
	}
}