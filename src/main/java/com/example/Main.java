package com.example;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.Config;
import com.example.service.SortService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		SortService sortService = context.getBean(SortService.class);

		System.out.println("result: " + sortService.doSort(Arrays.asList(args)));
	}
}