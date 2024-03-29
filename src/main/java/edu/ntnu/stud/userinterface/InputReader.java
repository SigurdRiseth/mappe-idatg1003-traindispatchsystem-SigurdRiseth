package edu.ntnu.stud.userinterface;

import java.util.Scanner;

/**
 * The InputReader class is used to read user inputs in the terminal.
 *
 * <p>
 * The class utilizes the Scanner class to read user inputs.
 * Methods in this class are used to read both Strings and ints.
 * </p>
 *
 * @author Sigurd Riseth
 * @version 1.0.0
 * @see Scanner
 */
public class InputReader {

  private final Scanner scanner;

  /**
   * Constructor that creates a new Scanner object.
   */
  InputReader() {
    scanner = new Scanner(System.in);
  }

  /**
   * Returns the user input as a String.
   *
   * @return The user input as a String
   */
  String getStringInput() {
    return scanner.nextLine();
  }


  /**
   * Returns the user input as a String with the first letter capitalized. The rest of the letters
   * will be lowercase.
   *
   * @return The user input as a String with the first letter capitalized
   */
  String getStringInputCapitalized() {
    String result = scanner.nextLine();
    result = result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
    return result;
  }

  /**
   * Returns the user input as an int. If the input is not an int, returns -1.
   *
   * @return The user input as an int
   */
  int getInt() {
    int result;
    try {
      result = scanner.nextInt();
      scanner.nextLine();
    } catch (Exception e) {
      scanner.nextLine();
      result = -1;
    }
    return result;
  }
}


