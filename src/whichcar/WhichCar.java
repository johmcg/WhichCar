package whichcar;

/**
 * *************************************
 * WhichCar.java
 *
 * This program will ask a couple how many miles they are driving for each day
 * that week. Then it will determine who is driving more miles. It will then
 * produce a weekly calendar assigning the one who drove more miles to the less
 * costly vehicle. The one who drove less miles will be assigned to the more
 * costly vehicle on the calendar output. The reasoning for assigning vehicle 1
 * to the person who drove the most is due to vehicle 1 getting better MPG.
 *
 ***************************************
 */
import java.util.Scanner;
import java.util.ArrayList;

public class WhichCar {

    public static void main(String[] args) {

        ArrayList<Integer> p1_md = new ArrayList<Integer>();
        ArrayList<Integer> p2_md = new ArrayList<Integer>();
        ArrayList<String> vehicle1 = new ArrayList<String>();
        ArrayList<String> vehicle2 = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the following for Person 1 and Person 2.");

        System.out.println("How many miles did Person 1 drive on Monday?");
        p1_md.add(scan.nextInt());
        System.out.println("How many miles did Person 1 drive on Tuesday?");
        p1_md.add(scan.nextInt());
        System.out.println("How many miles did Person 1 drive on Wednesday?");
        p1_md.add(scan.nextInt());
        System.out.println("How many miles did Person 1 drive on Thursday?");
        p1_md.add(scan.nextInt());
        System.out.println("How many miles did Person 1 drive on Friday?");
        p1_md.add(scan.nextInt());

        System.out.println("How many miles did Person 2 drive on Monday?");
        p2_md.add(scan.nextInt());
        System.out.println("How many miles did Person 2 drive on Tuesday?");
        p2_md.add(scan.nextInt());
        System.out.println("How many miles did Person 2 drive on Wednesday?");
        p2_md.add(scan.nextInt());
        System.out.println("How many miles did Person 2 drive on Thursday?");
        p2_md.add(scan.nextInt());
        System.out.println("How many miles did Person 2 drive on Friday?");
        p2_md.add(scan.nextInt());
        scan.close();

        for (int i = 0; i < 5; i++) {
            if (p1_md.get(i) > p2_md.get(i)) {
                vehicle1.add("Vehicle 1");
                vehicle2.add("Vehicle 2");
            } else if (p1_md.get(i) == p2_md.get(i)) {  //Person 2 prefers the Vehicle 1 when the milage is the same.
                vehicle1.add("Vehicle 2");
                vehicle2.add("Vehicle 1");
            } else {
                vehicle1.add("Vehicle 2");
                vehicle2.add("Vehicle 1");
            }
        }

        /*Weekly Calendar of who should drive each vehicile to capitalze on the better gas milage*/
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("\t\tMonday\t\tTuesday\t\tWednesday\tThursday\tFriday\n");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("|Person 1                                                                                             |");
        System.out.println("|_________________________________________________________________________________________________|");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t\t%s", vehicle1.get(i).toUpperCase());
        }
        System.out.println("\n");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("|Person 2                                                                                              |");
        System.out.println("|_________________________________________________________________________________________________|");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t\t%s", vehicle2.get(i).toUpperCase());
        }
        System.out.println("\n");

    }

}
