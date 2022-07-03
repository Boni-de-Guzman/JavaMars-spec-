import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("The game is about to start....");

        for (int i = 0; i <=3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("...");
            }
            System.out.println();
        }
        System.out.println("Ready");

        Scanner respond= new Scanner(System.in);
        System.out.println("Hi there whats your name");
        String res1 = respond.next();

        System.out.println("Hi "+ res1  + "--- Welcome to The Mars Adventure Game.\n" +
                "Yesterday, you received a call from your good friend at NASA.\n" +
                "They need someone to go to Mars this weekend, and you've been chosen" );
        System.out.println("Are you excited> Y or N");

        String res2 = respond.next();
         if (res2.toLowerCase().equals("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!\nIt's time to pack for your trip to Mars.\nHow many suitcases do you plan to bring?");
                int res3 = respond.nextInt();
                if(res3 > 2 ) {
                    System.out.println("That's way too many. You'll have to pack more lightly.\n" +
                            "Please try to fit your stuff into 2 suitcases.");
                }else {
                    System.out.println("Awesome. You're allowed to bring one companion animal with you.\n" +
                            "What kind of companion animal would you like to bring?");
                   }
                String res4 = respond.next();
                System.out.println("Whats your companion name?");
                String res5 = respond.next();
                System.out.println("Cool, so your bringing " + res5 + " the " + res4);

             System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
                     "You have a couple of options for the interior decor of your ship.Your options are:\n" +
                     " A  Sleek, modern minimalism\n" +
                     " B  Retro/vintage space age\n" +
                     " C  SF Hippie chic\n" +
                     "Which decor would you like? Choose A, B, or C.");
             String res6 = respond.next();

             if(res6.equals("A"))
                 System.out.println(" NIce choice you want modern ship. " + res1 + " and " + res5 + " surfing the celestial abyss " );
             else if(res6.equals("B"))
                 System.out.println("Oh you want retro spaceship. Very neat! " + res1 + " and " + res5 + " surfing the celestial abyss " );
             else if(res6.equals("C"))
                 System.out.println("You chose SF Hippie Chic. Awesome! " + res1 + " and " + res5 + " surfing the celestial abyss ");
             else
                 System.out.println("Please pick for the interior decor of your ship");

             System.out.println(res1 + "-- the day is here!\n" +
                     "You crawl into the spaceship with Buster\n" +
                     "Brace for take off!");

             for (int i = 0; i <= 5; i++) {
                 System.out.println(i + "...");
             }
             System.out.println("Lift Off..");

         } else {
                System.out.println("Take your time");
            }

          }
    }


