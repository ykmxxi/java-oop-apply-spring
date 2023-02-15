package com.example.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JavaSortTest {
	@DisplayName("Java Sort: 리스트를 넣으면 정렬된 결과를 return")
	@Test
	void given_List_WhenExecuting_ThenReturnSortedList() {
		// given
		JavaSort<Integer> javaSort = new JavaSort<>();

		// when
		List<Integer> actual = javaSort.sort(List.of(3, 5, 2, 1, 4));

		// then
		assertEquals(List.of(1, 2, 3, 4, 5), actual);
	}
}