package com.example;

import java.util.Arrays;

import com.example.logic.BubbleSort;
import com.example.logic.Sort;

public class Main {
	public static void main(String[] args) {
		// DIP: 추상화에 의존해야지,구체화에 의존하면 안된다.
		Sort<String> sort = new BubbleSort<>();

		System.out.println("result: " + sort.sort(Arrays.asList(args)));
	}
}