package com.stream;

import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	private static String generateResponse(String input) {
		if (input.contains("hello") || input.contains("hi")) {
			return "Hello! How can I assist you today?";
		} else if (input.contains("how are you")) {
			return "I'm just a program, but I'm here to help you!";
		} else if (input.contains("your name")) {
			return "I'm a simple chatbot written in Java.";
		} else if (input.contains("Today time")) {
			return  "I don't have a clock, but you can check the time on your device.";
		} else {
			return "I'm sorry, I didn't understand that. Can you rephrase?";
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! I'm your chatbot. Type 'exit' to end the conversation.");

		while (true) {
			System.out.print("You: ");
			String userInput = scanner.nextLine().toLowerCase();

			// Exit condition
			if (userInput.equals("exit")) {
				System.out.println("Chatbot: Goodbye! Have a great day!");
				break;
			}

			// Generate a response
			String response = generateResponse(userInput);
			System.out.println("Chatbot: " + response);
		}

		scanner.close();

	}
}