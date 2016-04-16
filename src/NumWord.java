import java.util.Scanner;

public class NumWord {

    /**
     * method that does the work
     */

    public void writeNumWord() {

        while (true) {

            //initializing

            String input = "";
            boolean hundred = false;
            boolean ten = false;
            boolean one = false;
            int place = 0;

            //Scanner, takes input as String and converts it to int

            System.out.println("Enter a number");
            Scanner userInput = new Scanner(System.in);
            input = userInput.next();

            //handling empty string

            if (input.equals("")) {

                System.out.println("Type a number!");
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

                if (input.length() >= 3){

                    hundred = true;

                }

                if (input.length() >= 2){

                    ten = true;

                }

                if (input.length() >= 1){

                    one = true;

                }


                //print hundreds digit

                if (hundred) {

                    switch (Character.getNumericValue(input.charAt(input.length() - 3))) {

                        case 1:
                            System.out.print("one hundred and ");
                            break;
                        case 2:
                            System.out.print("two hundred and ");
                            break;
                        case 3:
                            System.out.print("three hundred and ");
                            break;
                        case 4:
                            System.out.print("four hundred and ");
                            break;
                        case 5:
                            System.out.print("five hundred and ");
                            break;
                        case 6:
                            System.out.print("six hundred and ");
                            break;
                        case 7:
                            System.out.print("seven hundred and ");
                            break;
                        case 8:
                            System.out.print("eight hundred and ");
                            break;
                        case 9:
                            System.out.print("nine hundred and ");
                            break;
                        default:
                            break;

                    }

                }

                //print tens digit

                if (ten) {

                    switch (Character.getNumericValue(input.charAt(input.length() -2))) {

                        case 2:
                            System.out.print("twenty-");
                            break;
                        case 3:
                            System.out.print("thirty-");
                            break;
                        case 4:
                            System.out.print("forty-");
                            break;
                        case 5:
                            System.out.print("fifty-");
                            break;
                        case 6:
                            System.out.print("sixty-");
                            break;
                        case 7:
                            System.out.print("seventy-");
                            break;
                        case 8:
                            System.out.print("eighty-");
                            break;
                        case 9:
                            System.out.print("ninety-");
                            break;
                        default:
                            break;

                    }
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







