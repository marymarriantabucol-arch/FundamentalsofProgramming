// Ini-import ang Arrays utility class mula sa java.util package para magamit ang mga built-in array methods tulad ng deepToString()
import java.util.Arrays;

//  CinemaSeating ang pangalan ng main class ko
public class CinemaSeating {

    //  main method kung saan nagsisimula ang pagtakbo ng buong Java program
    public static void main(String[] args) {

        // Nagdeklara ako at nag-initialize ng 2D String array na pinangalanang 'seats' na may 2 rows at 3 columns
        String[][] seats = {
                {"Alice", "Bob", "Charlie"}, // Unang row (index 0): may 3 columns (index 0, 1, 2)
                {"David", "Emma", "Frank"}   // Pangalawang row (index 1): may 3 columns (index 0, 1, 2)
        };

        // dito ipini-print ang pangalan sa pangalawang row (index 1) at pangatlong column (index 2), na si "Frank"
        System.out.println("Person in 2nd row, 3rd column: " + seats[1][2]);

        // Pinapalitan ang value sa unang row (index 0) at pangalawang column (index 1) mula "Bob" patungong "Vacant"
        seats[0][1] = "Vacant";

        // Ginagamit ang Arrays.deepToString() para i-convert at i-print ang buong 2D array sa iisang linya
        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));
    } // Dito nagtatapos ang main method
} // Dito nagtatapos ang CinemaSeating class
