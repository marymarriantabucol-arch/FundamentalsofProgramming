// Idineklara ang main class na pinangalanang TemperatureTracker
public class TemperatureTracker {

    // main method kung saan nagsisimula ang pagtakbo ng Java program
    public static void main(String[] args) {

        // nag deklara ako at in-instantiate ang 1D double array na 'temperatures' na may kakayahang humawak ng eksaktong 5 elements
        double[] temperatures = new double[5];
        // Itinakda ko ang value ng temperatura para sa unang araw sa pamamagitan ng index 0
        temperatures[0] = 32.5;
        // Itinakda ko ang value ng temperatura para sa pangalawang araw sa pamamagitan ng index 1
        temperatures[1] = 34.0;
        // Itinakda ko ang value ng temperatura para sa pangatlong araw sa pamamagitan ng index 2
        temperatures[2] = 31.8;
        // Itinakda ko ang value ng temperatura para sa pang-apat na araw sa pamamagitan ng index 3
        temperatures[3] = 33.2;
        // Itinakda ko ang value ng temperatura para sa ikalimang araw sa pamamagitan ng index 4
        temperatures[4] = 35.1;
        // Gumamit ako ng standard for loop at .length property upang isa-isang libutin at i-print ang mga temperatura
        for (int i = 0; i < temperatures.length; i++) {
            // Ipini-print ang kaukulang araw (index + 1) at ang temperatura nito mula sa array
            System.out.println("Day " + (i + 1) + " temperature: " + temperatures[i]);
        } // Dito nagtatapos ang for loop block

        // Dito binago o in-update ang temperatura para sa pangatlong araw (index 2) mula 31.8 patungong 32.0
        temperatures[2] = 32.0;
        // Dito ipini-print ang bagong updated na temperatura para sa pangatlong araw sa console
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    } // Dito nagtatapos ang main method
} // Dito nagtatapos ang TemperatureTracker class
