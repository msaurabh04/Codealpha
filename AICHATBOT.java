import java.util.Scanner;

public class AICHATBOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I assist you today?");

        while (true) {
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("hello")) {
                System.out.println("Chatbot: Hi there!");
            } else if (userInput.equals("how are you?")) {
                System.out.println("Chatbot: I'm good, thank you. How about you?");
            } else if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            } else {
                System.out.println("Chatbot: Sorry, I didn't understand that.");
            }
        }

        scanner.close();
    }
}

