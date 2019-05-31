package Guleri;

import java.util.Scanner;
import java.util.ArrayList;

class Rank {
    private Scanner in = new Scanner(System.in);

    void Customer() {
        char choose;
        long phNo;
        String Color, address, name;
        int budget;
        PaintObject get = new PaintObject();
        System.out.println("Hello  sir , \n " +
                "welcome to PaintHouse program ." +
                "\n Please enter the values related to the work :" +
                "\n choose the things to paint :" +
                "\n 1. Window \n 2. Wall \n 3. Door \n 4. Roof ");

        ArrayList<Integer> Things = new ArrayList<>();
        do {
            Things.add(in.nextInt());
            System.out.println("enter \033[1;33m n \033[0m to stop add things from the list :");
            choose = in.next().charAt(0);
        } while (choose != 'n');
        for (int i : Things) {
            switch (i) {
                case 1:
                    System.out.println("enter color for window");
                    Color = in.next();
                    get.windowColor(Color);
                    break;
                case 2:
                    System.out.println("enter color for wall");
                    Color = in.next();
                    get.wallColor(Color);
                    break;
                case 3:
                    System.out.println("enter color for roof");
                    Color = in.next();
                    get.roofColor(Color);
                    break;
                case 4:
                    System.out.println("enter color for door ");
                    Color = in.next();
                    get.doorColor(Color);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
        System.out.println(" shall we come with the required stuff  : y or n");
        choose = in.next().charAt(0);
        if (choose == 'n') {
            AssembleMaterials goStore = new AssembleMaterials();
            System.out.println("enter the rooms :");
            int rooms = in.nextInt();
            goStore.Store(rooms);
        } else {
            System.out.println(" we must come with the required stuff");
        }
        System.out.println("enter your name :");
        name = in.next();
        System.out.println("enter your phone number");
        phNo = in.nextLong();
        System.out.println("please enter your address");
        address = in.next();
        System.out.println("please enter your budget");
        budget = in.nextInt();
        System.out.println("thank you sir ");

    }

    void worker(String name, String phNo) {
        PaintObject get = new PaintObject();

        name = "Abhishek ";
        phNo = "8938943793";
        System.out.println(" thanks for joining us , we search any work to you !");

    }

    void store(String name, String phNo) {
        PaintObject get = new PaintObject();
        name = "guleri";
        phNo = "9280485749";
        System.out.println(" thanks for joining us , we search any work to you !");

    }
}
