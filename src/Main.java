import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean play = true;
        String ongeldig = "ongeldig invoer";

        Integer numeric[] = {1,2,3,4,5,6,7,8,9,0};
        String alphabetic[] = {"een","twee","dree","vier","five","zes","zeven","acht","negen","null"};

        Translator translator = new Translator(alphabetic,numeric);
        Scanner scanner = new Scanner(System.in);

        while(play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if(input.equals("x")){
                play = false;
            } else if (input.equals("v")) {
                System.out.println(" \"Type een cijfer in van 0 t/m 9\"");
                int number = scanner.nextInt();
                if(number >= 0 && number <= 9) {
                    String result = translator.translate(number, alphabetic[number -1]);
                    System.out.println("De vertaling van " + number+" is " + result);
                } else {
                    System.out.println("ongelding");
                }
            } else {
                System.out.println("ongeldigInput");
            }
        }
    }
}
