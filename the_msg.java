
import java.time.LocalDate;

public class the_msg {
    public static void main(String[] args) {
        
        you you = new you();
        int age;
        String mood;
        String status;
        String hope;

        age = 29;
        // TODO: input your status down here:
        mood = "sad"; // sad || happy || meh
        status = "exhausted"; // tired || exhausted || energetic
        hope = "low"; // high || low || okay

        LocalDate bd = LocalDate.of(2025, 4, 30);
        LocalDate currenDate = LocalDate.now();

        double infinity = Double.POSITIVE_INFINITY;

        if ((boolean) you.isAlive()) {
            if (currenDate.equals(bd)) {
                for (int i = 0; i<=infinity; i++) {
                    System.out.println("( sqrt((HB)^2) + sqrt((D^2) ) + to/u u^2 ");
                }   
            }
    
            if (mood.equalsIgnoreCase("sad") || status.equalsIgnoreCase("exhausted") || hope.equalsIgnoreCase("low")) {
                you.makeHappy();
                you.getEnergetic();
                you.highHopes();
                age ++;
    
                mood = you.mood;
                status = you.status;
                hope = you.hope;

                System.out.println("you are " +mood);
                System.out.println("and also " +status);
                System.out.println("you have " +hope+ " hopes");
                System.out.println("and you have just reached level... *drums* " +age+ " !!");
            }   

        }

        
    }
}