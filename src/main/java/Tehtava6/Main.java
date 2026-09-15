package Tehtava6;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Test 1: Basic Printer ---");
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");
        // Output: Hello World!

        System.out.println("\n--- Test 2: Encrypted XML Printer ---");
        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");

    }
}

