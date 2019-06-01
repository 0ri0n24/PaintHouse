package Guleri;

import java.util.Scanner;
import java.util.ArrayList;

class Rank {
    private Scanner in = new Scanner(System.in);
    int wage = 1000;

    void Customer() {
        char choose;
        double phNo;
        String Color, address, name;
        int budget, rooms;
        PaintObject get = new PaintObject();
        System.out.println("Hello  sir , \n " +
                "welcome to PaintHouse program ." +
                "\n Please enter the values related to the work :");
        String works = in.nextLine();

        // information of the customer

        System.out.println("enter your name :");
        name = in.next();
        System.out.println("enter your phone number");
        phNo = in.nextDouble();
        System.out.println("please enter your address");
        address = in.nextLine();
        System.out.println("please enter your budget");
        budget = in.nextInt();
        System.out.println(" their are the list of people who are under your budget :");
        if (budget == wage) {
            System.out.println("do you want to chat with the person");
            DefaultUser worker = new DefaultUser();
            worker.defaultCustomer();
        }
        System.out.println("thank you sir ");
    }

    void worker(String name, long phNo, int wage) {
        System.out.println("name " + name + " phone number " + phNo + " wage " + wage);

    }


    void store(String name, double phNo) {
        System.out.println("name " + name + " phone number " + phNo);

    }
}
