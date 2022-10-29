
import java.text.DecimalFormat;

public class Activity3 {


        public  void Act3() {
            double seconds = 1000000000;

            double EarthSeconds = 31557600;
            double MercurySeconds = 0.2408467;
            double VenusSeconds = 0.61519726;
            double MarsSeconds = 1.8808158;
            double JupiterSeconds = 11.862615;
            double SaturnSeconds = 29.447498;
            double UranusSeconds = 84.016846;
            double NeptuneSeconds = 164.79132;
            DecimalFormat x =new DecimalFormat("#.##");

            System.out.println("Age on Mercury: " + x.format(seconds / EarthSeconds / MercurySeconds));
            System.out.println("Age on Venus: " + x.format(seconds / EarthSeconds / VenusSeconds));
            System.out.println("Age on Earth: " + x.format(seconds / EarthSeconds));
            System.out.println("Age on Mars: " + x.format(seconds / EarthSeconds / MarsSeconds));
            System.out.println("Age on Jupiter: " +x.format( seconds / EarthSeconds / JupiterSeconds));
            System.out.println("Age on Saturn: " +x.format( seconds / EarthSeconds / SaturnSeconds));
            System.out.println("Age on Uranus: " +x.format( seconds / EarthSeconds / UranusSeconds));
            System.out.println("Age on Neptune: " +x.format( seconds / EarthSeconds / NeptuneSeconds));
        }
    }


