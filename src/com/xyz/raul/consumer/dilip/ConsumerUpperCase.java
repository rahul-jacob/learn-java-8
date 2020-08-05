package com.xyz.raul.consumer.dilip;

import java.util.function.Consumer;

public class ConsumerUpperCase {

	public static void main(String[] args) {
		Consumer<String> convertCase = (s) -> System.out.println(s.toUpperCase());
		convertCase.accept("java program");
		convertCase.accept("mark is a gr8 boy.");
	}

}
