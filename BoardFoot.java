import java.util.Scanner;

/**
 * This program calculates the board foot
 *from the given width and height*.
 * @author  Yoma Ozoh
 * @version 1.0
 * @since   2026-10-06
 */
public final class BoardFoot {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private BoardFoot() {
    }

    /**
     * Calculates the required length for 1 board foot.
     *
     * @param width  the width in inches
     * @param height the height in inches
     * @return the required length in inches
     */
    public static double calculateBoardFoot(final double width,
            final double height) {
        final double boardFootVolume = 144.0;
        return boardFootVolume / (width * height);
    }

    /**
     * Main entry point for user interaction and output.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) { //
        final Scanner scanner = new Scanner(System.in);
        // try catch for input errors
        try {
            // ask user for width and height
            System.out.print("Please enter the Width: ");
            final double width = Double.parseDouble(scanner.nextLine());

            System.out.print("Please enter the Height: ");
            final double height = Double.parseDouble(scanner.nextLine());
            // check if user inout is valid
            if (width > 0 && height > 0) {
                final double length = calculateBoardFoot(width, height);
                System.out.printf(
                    "The length should be %.2f"
                    + "inches to make 1 board foot.%n", length + length);
            } else {
                System.out.println("Invalid input."
                + "Please enter a positive integer");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. "
                    + "Please enter valid numerical values.");
        } finally {
            scanner.close();
        }
    }
}
