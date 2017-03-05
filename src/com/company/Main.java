package com.company;

public class Main {

    public static void main(String[] args) {

//        int value =3;
//        if(value ==1){
//            System.out.println("value = 1");
//        }else if(value ==2){
//            System.out.println("value = 2");
//
//        }else{
//            System.out.println("value is neither 1 or 2");
//        }

//        int switchValue = 131;
//        switch(switchValue){
//            case 1:
//                System.out.println("Value =1");
//                break;
//            case 2:
//                System.out.println("Value =2");
//                break;
//            case 3:
//                System.out.println("Value =3");
//                break;
//            case 4:case 5:case 6:
//                System.out.println("value is not 1, 2 or 3");
//                break;
//
//            default:
//                System.out.println("value not 1,2,3,4,5 or 6");
//                break;
//
//
//        }

        // for(init,termination, increment/dcrement)
//        for( int i =1; i <=5; i++){
//            System.out.println("Hello World");
//        }
//
//        System.out.println("100,000 at 2% interest =" + calculateInterest(100000, 2.0)) ;
//        System.out.println("100,000 at 3% interest =" + calculateInterest(100000, 3.0)) ;
//        System.out.println("100,000 at 4% interest =" + calculateInterest(100000, 4.0)) ;
//        System.out.println("100,000 at 5% interest =" + calculateInterest(100000, 5.0)) ;
//
//        // using the for statement, call the calculateInterest method with
//        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
//        // and print the results to the console window.
//
//        for(int i =2; i<9; i++){
//            System.out.println("100,000 at"+  i + " % interest =" + String.format("%.2f", calculateInterest(100000, i))) ;
//        }
//
//        // How would you modify the for loop above to do the same thing as
//        // shown but to start from 8% and work back to 2%
//    }
//
//    private static double calculateInterest(double amount, double interestrate) {
//        return (amount * (interestrate)/100);

//        int count = 2;
//        while (count != 6) {
//            System.out.println("Count value is" + count);
//            count++;
//        }

//        int count = 2;
//        for(int i=2; i!=6; i++){
//            System.out.println("Count value is" + i);
//
//        }

        int count = 2;
//        do{
//            System.out.println("Count value is" + count);
//            count++;
//
//        }while(count !=8);

        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvennumber(number)) {
                number++;
                continue;
            }
            System.out.println("even number" + number);
            number++;
        }
    }

    private static boolean isEvennumber(int number) {
        if(number%2 == 0){
            return true;
        }
        return false;
    }

    // Modify the while code above
    // Make it also record the total number of even numbers it has found
    // and break once 5 are found
    // and at the end, display the total number of even numbers found

}
