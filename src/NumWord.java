import java.util.Scanner;

public class NumWord {

    //method that returns words

    //represent commas with 'and's

    /**
     * method that does the work
     */

    public void writeNumWord() {

        //initializing strings

        String input = "";

        //Scanner, takes input as String and converts it to int

        System.out.println("Enter a number");
        Scanner userInput = new Scanner(System.in);
        input = userInput.next();

        //loops over number (as string)

        for (int i = 1; i <= input.length(); i++) {

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
                continue;

            }

            //print tens digit

            switch(Character.getNumericValue(input.charAt(i - 1))) {

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

            // ones place switch

                switch (Character.getNumericValue(input.charAt(i))) {

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






