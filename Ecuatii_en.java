package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int loop1=10;
        while (loop1!=0) {
        System.out.println("Equations and inequalities ver 1.0");
        System.out.println("0 - Exit");
        System.out.println("1 - Equations");
        System.out.println("2 - Inequalities");
        System.out.print("Choose an option:");
        Scanner scan = new Scanner(System.in);
        int optiune1 = scan.nextInt();
            if (optiune1 == 1) {
                int loop2=10;
                while (loop2 != 0) {
                System.out.println("0 - Exit");
                System.out.println("1 - First degree equation");
                System.out.println("2 - Second degree equation");
                System.out.print("Alege o optiune:");
                int optiune2 = scan.nextInt();
                    if (optiune2 == 1) {
                        System.out.println("You choose the first degree equation, with the model aX + b = c");
                        double a=0;
                        int z = 1;
                        while (z != 0){
                            System.out.print("Input a: ");
                            a = scan.nextDouble();
                        if (a == 0) {
                            System.out.println("The value of 'a' must be different from zero!");
                        }
                        else{
                             z = 0;
                            }
                        }
                        System.out.print("Input b: ");
                        double b = scan.nextDouble();
                        System.out.print("Input c: ");
                        double c = scan.nextDouble();
                        double x = (c - b) / a;
                        System.out.println("The result is x=:" + x);
                        loop2 = 0;
                    } else if (optiune2 == 2) {
                        System.out.println("You choose the second degree equation, with the model: aX" + Character.toString((char) 178) + " + bX + c = d");
                        double a=0;
                        int z = 1;
                        while (z != 0){
                            System.out.print("Input a: ");
                            a = scan.nextDouble();
                        if (a == 0) {
                            System.out.println("The value of 'a' must be different from zero!");
                        }
                        else{
                             z = 0;
                            }
                        }
                        System.out.print("Input b:");
                        double b = scan.nextDouble();
                        System.out.print("Input c:");
                        double c = scan.nextDouble();
                        System.out.print("Input d:");
                        double d = scan.nextDouble();
                        double x1, x2;
                        double delta = (b * b) - (4 * a * c);
                        if (delta >= 0) {
                            x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                            x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                            System.out.println("X1 = " + x1);
                            System.out.println("X2 = " + x2);
                        } else {
                            System.out.println("The equation has no solutions in the set of real numbers R!");
                        }
                    } else if (optiune2==0) {
                        loop2 = 0;
                    }
                }
            }

            
            if (optiune1 == 2) {
                int loop3=10;
                while (loop3!=0) {
                System.out.println("0 - Exit");
                System.out.println("1 - First degree inequality");
                System.out.println("2 - Second degree inequality");
                System.out.print("Alege o optiune:");
                int optiune3 = scan.nextInt();
                    if (optiune3 == 1) {
                        int loop4 =10;
                        while (loop4!=0){
                        System.out.println("0 - Iesire");
                        System.out.println("1 - Model aX + b < c");
                        System.out.println("2 - Model aX + b <= c");
                        System.out.println("3 - Model aX + b >=c");
                        System.out.println("4 - Model aX + b > c");
                        System.out.print("Alege o optiune:");
                        int optiune4 = scan.nextInt();
                            if (optiune4==1){
                                System.out.println("You choose the first degree inequality, with the model aX + b < c");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b: ");
                                double b = scan.nextDouble();
                                System.out.print("Input c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x belongs to the range ( - inf , +" + x + " )");
                            }
                            if (optiune4==2){
                                System.out.println("You choose the first degree inequality, with the model aX + b <= c");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b: ");
                                double b = scan.nextDouble();
                                System.out.print("Input c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x belongs to the range ( - inf , +" + x + " ]");
                            }
                            if (optiune4==3){
                                System.out.println("You choose the first degree inequality, with the model aX + b >= c");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b: ");
                                double b = scan.nextDouble();
                                System.out.print("Input c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x belongs to the range [ "+ x + " , inf )");
                            }
                            if (optiune4==4){
                                System.out.println("You choose the first degree inequality, with the model aX + b > c");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b: ");
                                double b = scan.nextDouble();
                                System.out.print("Input c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x belongs to the range ( "+ x + " , inf )");
                            }
                            if (optiune4==0){
                                loop4=0;
                            }
                        }
                    }

                    if (optiune3==2){
                        int loop5=10;
                        while (loop5!=0){
                        System.out.println("0 - Iesire");
                        System.out.println("1 - Model aX" + Character.toString((char) 178) + " + bX + c < d");
                        System.out.println("2 - Model aX" + Character.toString((char) 178) + " + bX + c <= d");
                        System.out.println("3 - Model aX" + Character.toString((char) 178) + " + bX + c >= d");
                        System.out.println("4 - Model aX" + Character.toString((char) 178) + " + bX + c > d");
                        System.out.print("Alege o optiune:");
                        int optiune5 = scan.nextInt();
                            if (optiune5==1){
                                System.out.println("You choose the second degree inequality, with the model: aX" + Character.toString((char) 178) + " + bX + c < d");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b:");
                                double b = scan.nextDouble();
                                System.out.print("Input c:");
                                double c = scan.nextDouble();
                                System.out.print("Input d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    System.out.println("x belongs to the range ( " + x1 + " , " + x2 + " )");
                                } else {
                                    System.out.println("The inequality has no solutions in the set of real numbers R!");
                                }
                            }
                            if (optiune5==2){
                                System.out.println("You choose the second degree inequality, with the model: aX" + Character.toString((char) 178) + " + bX + c <= d");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b:");
                                double b = scan.nextDouble();
                                System.out.print("Input c:");
                                double c = scan.nextDouble();
                                System.out.print("Input d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    System.out.println("x belongs to the range [ " + x1 + " , " + x2 + " ]");
                                } else {
                                    System.out.println("The inequality has no solutions in the set of real numbers R!");
                                }
                            }
                            if (optiune5==3){
                                System.out.println("You choose the second degree inequality, with the model: aX" + Character.toString((char) 178) + " + bX + c >= d");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input pe b:");
                                double b = scan.nextDouble();
                                System.out.print("Input c:");
                                double c = scan.nextDouble();
                                System.out.print("Input d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    if (x1<=x2){
                                        System.out.println("x belongs to the range ( - inf, " + x1 + "] U [ " + x2 + " )");
                                    }
                                    else if (x1>x2){
                                        System.out.println("x belongs to the range ( - inf, " + x2 + "] U [ " + x1 + " )");
                                    }

                                } else {
                                    System.out.println("The inequality has no solutions in the set of real numbers R!");
                                }
                            }
                            if (optiune5==4){
                                System.out.println("You choose the second degree inequality, with the model: aX" + Character.toString((char) 178) + " + bX + c > d");
                                double a=0;
                        	int z = 1;
                        	while (z != 0){
                            	System.out.print("Input a: ");
                            	a = scan.nextDouble();
                        	if (a == 0) {
                            	System.out.println("The value of 'a' must be different from zero!");
                        	}
                        	else{
                             	z = 0;
                            	}
                        	}
                                System.out.print("Input b:");
                                double b = scan.nextDouble();
                                System.out.print("Input c:");
                                double c = scan.nextDouble();
                                System.out.print("Input d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    if (x1<=x2){
                                        System.out.println("x belongs to the range ( - inf, " + x1 + ") U ( " + x2 + " )");
                                    }
                                    else if (x1>x2){
                                        System.out.println("x belongs to the range ( - inf, " + x2 + ") U ( " + x1 + " )");
                                    }

                                } else {
                                    System.out.println("The inequality has no solutions in the set of real numbers R!");
                                }
                            }
                            if (optiune5==0) {
                                loop5=0;
                            }
                        }
                    }
                 if (optiune3==0){
                     loop3=0;
                 }
                } 
            }
            if (optiune1==0){
                loop1=0;
                System.out.println("Goodbye!");
            }
        } 

    }

}
