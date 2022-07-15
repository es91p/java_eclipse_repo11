package com.java8.features;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

/**
 * @author Eswdell
 *
 */
public class Java8FeaturesStreams20 {
	
			public static void main (String [] args) throws IOException {
			//13. Reduction - sum
			double total = Stream.of (7.3, 1.5, 4.8)
			.reduce (0.0, (Double a, Double b) -> a + b) ;
			System. out .println ("Total =" + total);
	}
	
}