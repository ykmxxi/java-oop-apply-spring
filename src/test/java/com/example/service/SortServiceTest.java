package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.logic.JavaSort;

class SortServiceTest {
	private SortService service = new SortService(new JavaSort<>());

	@Test
	void test() {
		// given

		// when
		List<String> actual = service.doSort(List.of("1", "3", "2"));

		// then
		assertEquals(List.of("1", "2", "3"), actual);
	}

}