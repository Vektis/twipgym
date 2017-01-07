package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("why");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: 1 if regular, 2 if member, 3 if employee.: ");
        String stat = input.next();
        int pool = 0;
        boolean memb;
        int cls = 0;
        int hrs=  0;
        if(stat.equals("1")){
            //literally nothing XDDDDDDDD
        }
        else if(stat.equals("2") || stat.equals("3")){
            System.out.println("How many times do you plan on going to the pool this month?: ");
            pool = input.nextInt();
        }
        else{
            System.out.println("ＩＮＶＡＬＩＤ");
            return;
        }

        //thing
        System.out.println("Would you like a membership?(y/n): ");
        if(input.next().toLowerCase().equals("y")){
            memb = true;
        }
        else if(input.next().toLowerCase().equals("n")){
            memb = false;
        }
        else{
            System.out.println("ＩＮＶＡＬＩＤ");
            return;
        }
        System.out.println("How many classes are you taking this month?: ");
        cls = input.nextInt();
        System.out.println("How many personal trainer hours do you need this month?: ");
        hrs = input.nextInt();

        if(stat.equals("1")){
            regular temp = new regular(pool,memb,cls,hrs);
            System.out.println("Your monthly bill is: $" + temp.getBill());
        }
        else if(stat.equals("2")){
            member temp = new member(pool,memb,cls,hrs);
            System.out.println("Your montly bill is: $" + temp.getBill());
        }
        else if( stat.equals("3")){
            employee temp = new regular(pool,memb,cls,hrs);
            System.out.println("Your monthly bill is: $" + temp.getBill());
        }



    }
}
