package Guleri;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int status;

        // choose your rank

        System.out.println("welcome to PaintHouse program :\n" +
                "choose the status and enter the number :" +
                "\n 1. Customer" +
                "\n 2. Worker " +
                "\n 3. Store ");
        status = in.nextInt();
        switch (status) {

// Rank = Customer

            case 1: {
                Rank Customer = new Rank();
                Customer.Customer();
            }
            break;
            // Rank  =  worker ;
            case 2: {
                Rank Worker = new Rank();
                System.out.println("Hello  sir , \n " +
                        "welcome to PaintHouse program ." +
                        "\n Please enter the values related :");
                System.out.println("enter your name :");
                String name = in.nextLine();

                System.out.println("enter your phone number");
                String phNo = in.next();
                Worker.worker(name, phNo);
            }
            break;

// Rank = store
            case 3: {
                Rank store = new Rank();
                System.out.println("Hello  sir , \n " +
                        "welcome to PaintHouse program ." +
                        "\n Please enter the values related :");
                System.out.println("enter your name :");
                String name = in.next();
                System.out.println("enter your phone number");
                String phNo = in.next();
                store.store(name, phNo);
            }
            break;

            default:
                System.out.println("invalid value ");
                break;
        }
    }
}