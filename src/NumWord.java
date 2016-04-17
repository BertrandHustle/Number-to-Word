import java.util.Scanner;

public class NumWord {

    /**
     * method that does the work
     */

    public void writeNumWord() {

        while (true) {

            //initializing

            String input = "";
            boolean million = false;
            boolean hundredThousand = false;
            boolean tenThousand = false;
            boolean thousand = false;
            boolean hundred = false;
            boolean ten = false;
            boolean one = false;

            //Scanner, takes input as String and converts it to int

            System.out.println("Enter a number");
            Scanner userInput = new Scanner(System.in);
            input = userInput.nextLine();

            //handling empty string

            if (input.length() > 7) {

                System.out.println("That number is too big! 7 digits is my max.");
                continue;

            }

            if (input.equals("")) {

                System.out.println("Type a number!");
                System.out.println("");
                continue;

            }

            //handling negative numbers

            if (input.contains("-")) {

                System.out.println("No negative numbers, please!");
                continue;

            }

            //exception if user types a single 0

            if (input.equals("0")) {

                System.out.println("zero");

            } else {

                //set boolean digit rules

                if (input.length() >= 7){

                    million = true;

                }

                if (input.length() >= 6){

                    hundredThousand = true;

                }

                if (input.length() >= 5){

                    tenThousand = true;

                }
                
                if (input.length() >= 4){
                    
                    thousand = true;
                    
                }

                if (input.length() >= 3){

                    hundred = true;

                }

                if (input.length() >= 2){

                    ten = true;

                }

                if (input.length() >= 1){

                    one = true;

                }

                if (million) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 7))) {

                        case 1:
                            System.out.print("one million, ");
                            break;
                        case 2:
                            System.out.print("two million, ");
                            break;
                        case 3:
                            System.out.print("three million, ");
                            break;
                        case 4:
                            System.out.print("four million, ");
                            break;
                        case 5:
                            System.out.print("five million, ");
                            break;
                        case 6:
                            System.out.print("six million, ");
                            break;
                        case 7:
                            System.out.print("seven million, ");
                            break;
                        case 8:
                            System.out.print("eight million, ");
                            break;
                        case 9:
                            System.out.print("nine million, ");
                            break;
                        default:
                            break;

                    }

                }

                if (hundredThousand) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 6))) {

                        case 1:
                            System.out.print("one hundred ");
                            break;
                        case 2:
                            System.out.print("two hundred ");
                            break;
                        case 3:
                            System.out.print("three hundred ");
                            break;
                        case 4:
                            System.out.print("four hundred ");
                            break;
                        case 5:
                            System.out.print("five hundred ");
                            break;
                        case 6:
                            System.out.print("six hundred ");
                            break;
                        case 7:
                            System.out.print("seven hundred ");
                            break;
                        case 8:
                            System.out.print("eight hundred ");
                            break;
                        case 9:
                            System.out.print("nine hundred ");
                            break;
                        default:
                            break;

                    }

                }

                //print ten thousands digit

                if (tenThousand) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 5))) {

                        case 1:
                            System.out.print("ten");
                            break;
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("forty");
                            break;
                        case 5:
                            System.out.print("fifty");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;
                        default:
                            break;

                    }

                }

                //handles potential hyphen for numbers e.g. 33,000

                if (tenThousand && thousand) {

                    System.out.print("-");

                }

                else if (tenThousand && !thousand){

                    System.out.print("thousand ");

                }

                //print thousands digit

                if (thousand) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 4))) {

                        case 1:
                            System.out.print("one thousand, ");
                            break;
                        case 2:
                            System.out.print("two thousand, ");
                            break;
                        case 3:
                            System.out.print("three thousand, ");
                            break;
                        case 4:
                            System.out.print("four thousand, ");
                            break;
                        case 5:
                            System.out.print("five thousand, ");
                            break;
                        case 6:
                            System.out.print("six thousand, ");
                            break;
                        case 7:
                            System.out.print("seven thousand, ");
                            break;
                        case 8:
                            System.out.print("eight thousand, ");
                            break;
                        case 9:
                            System.out.print("nine thousand, ");
                            break;
                        default:
                            break;

                    }

                }


                //print hundreds digit

                if (hundred) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 3))) {

                        case 1:
                            System.out.print("one hundred ");
                            break;
                        case 2:
                            System.out.print("two hundred ");
                            break;
                        case 3:
                            System.out.print("three hundred ");
                            break;
                        case 4:
                            System.out.print("four hundred ");
                            break;
                        case 5:
                            System.out.print("five hundred ");
                            break;
                        case 6:
                            System.out.print("six hundred ");
                            break;
                        case 7:
                            System.out.print("seven hundred ");
                            break;
                        case 8:
                            System.out.print("eight hundred ");
                            break;
                        case 9:
                            System.out.print("nine hundred ");
                            break;
                        default:
                            break;

                    }

                }

                //exception conditional for 'and'

                if ((((Character.getNumericValue(input.charAt(input.length() - 1)) != 0)) ||
                    ((Character.getNumericValue(input.charAt(input.length() - 2)) != 0))) &&
                    input.length() > 2) {

                    System.out.print("and ");

                }

                //print teens

                if (ten && Character.getNumericValue(input.charAt(input.length() - 1)) >= 1 &&
                        Character.getNumericValue(input.charAt(input.length() - 1)) <= 9 &&
                        Character.getNumericValue(input.charAt(input.length() - 2)) == 1){

                    switch (Character.getNumericValue(input.charAt(input.length() - 1))) {

                        case 1:
                            System.out.println("eleven");
                            one = false;
                            break;

                        case 2:
                            System.out.println("twelve");
                            one = false;
                            break;

                        case 3:
                            System.out.println("thirteen");
                            one = false;
                            break;

                        case 4:
                            System.out.println("fourteen");
                            one = false;
                            break;

                        case 5:
                            System.out.println("fifteen");
                            one = false;
                            break;

                        case 6:
                            System.out.println("sixteen");
                            one = false;
                            break;

                        case 7:
                            System.out.println("seventeen");
                            one = false;
                            break;

                        case 8:
                            System.out.println("eighteen");
                            one = false;
                            break;

                        case 9:
                            System.out.println("nineteen");
                            one = false;
                            break;

                    }

                    ten = false;
                }

                //print tens digit

                if (ten) {

                    switch (Character.getNumericValue(input.charAt(input.length() -2))) {

                        case 1:
                            System.out.println("ten");
                            one = false;
                            break;
                        case 2:
                            System.out.print("twenty");
                            break;
                        case 3:
                            System.out.print("thirty");
                            break;
                        case 4:
                            System.out.print("forty");
                            break;
                        case 5:
                            System.out.print("fifty");
                            break;
                        case 6:
                            System.out.print("sixty");
                            break;
                        case 7:
                            System.out.print("seventy");
                            break;
                        case 8:
                            System.out.print("eighty");
                            break;
                        case 9:
                            System.out.print("ninety");
                            break;
                        default:
                            break;

                    }
                }

                // hyphen exception two

                if (ten && ((Character.getNumericValue(input.charAt(input.length() - 1)) != 0))) {

                    System.out.print("-");

                }

                else if (input.length() != 1){

                    System.out.println(" ");

                }

                // ones place switch

                if (one) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 1))) {

                        case 1:
                            System.out.println("one");
                            break;

                        case 2:
                            System.out.println("two");
                            break;

                        case 3:
                            System.out.println("three");
                            break;

                        case 4:
                            System.out.println("four");
                            break;

                        case 5:
                            System.out.println("five");
                            break;

                        case 6:
                            System.out.println("six");
                            break;

                        case 7:
                            System.out.println("seven");
                            break;

                        case 8:
                            System.out.println("eight");
                            break;

                        case 9:
                            System.out.println("nine");
                            break;

                    }
                }

            }


        }

    }
}







