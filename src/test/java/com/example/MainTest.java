package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	@Test
	void main() {
		// given
		String[] args = {"3", "5", "1", "4", "2"};

		// when & then
		Main.main(args);
	}

}