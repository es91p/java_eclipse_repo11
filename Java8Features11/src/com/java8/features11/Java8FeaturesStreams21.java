package com.java8.features11;

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
public class Java8FeaturesStreams21 {
	
		public static void main (String [] args) throws IOException {
		// 14. Reduction - summarystatistics
		IntSummaryStatistics summąry = IntStream.of (7, 2, 19, 88, 73, 4, 10)
		.summaryStatistics ();
		System. out.println (summąry);
		}
	
}