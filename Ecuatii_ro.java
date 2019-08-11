package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int loop1=10;
        while (loop1!=0) {
        System.out.println("Program ecuatii si inecuatii ver 1.0");
        System.out.println("0 - Iesire din program");
        System.out.println("1 - Ecuatii");
        System.out.println("2 - Inecuatii");
        System.out.print("Alege o optiune:");
        Scanner scan = new Scanner(System.in);
        int optiune1 = scan.nextInt();
            if (optiune1 == 1) {
                int loop2=10;
                while (loop2 != 0) {
                System.out.println("0 - Iesire");
                System.out.println("1 - Ecuatia de gradul I");
                System.out.println("2 - Ecuatia de gradul II");
                System.out.print("Alege o optiune:");
                int optiune2 = scan.nextInt();
                    if (optiune2 == 1) {
                        System.out.println("Ai ales ecuatia de gradul I, avand forma aX + b = c");
                        double a=0;
                        int z = 1;
                        while (z != 0){
                            System.out.print("Introduceti pe a: ");
                            a = scan.nextDouble();
                        if (a == 0) {
                            System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                        }
                        else{
                             z = 0;
                            }
                        }
                        System.out.print("Introduceti pe b: ");
                        double b = scan.nextDouble();
                        System.out.print("Introduceti pe c: ");
                        double c = scan.nextDouble();
                        double x = (c - b) / a;
                        System.out.println("Rezultatul este x=:" + x);
                        loop2 = 0;
                    } else if (optiune2 == 2) {
                        System.out.println("Ai ales ecuatia de gradul II, avand forma: aX" + Character.toString((char) 178) + " + bX + c = d");
                        double a=0;
                        int z = 1;
                        while (z != 0){
                            System.out.print("Introduceti pe a: ");
                            a = scan.nextDouble();
                            if (a == 0) {
                                System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                            }
                            else{
                                z = 0;
                            }
                        }
                        System.out.print("Introduceti pe b:");
                        double b = scan.nextDouble();
                        System.out.print("Introduceti pe c:");
                        double c = scan.nextDouble();
                        System.out.print("Introduceti pe d:");
                        double d = scan.nextDouble();
                        double x1, x2;
                        double delta = (b * b) - (4 * a * c);
                        if (delta >= 0) {
                            x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                            x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                            System.out.println("X1 = " + x1);
                            System.out.println("X2 = " + x2);
                        } else {
                            System.out.println("Ecuatia nu are solutii in multimea numerelor reale R!");
                        }
                    } else if (optiune2==0) {
                        loop2 = 0;
                    }
                }
            }

            //Meniu inecuatii
            if (optiune1 == 2) {
                int loop3=10;
                while (loop3!=0) {
                System.out.println("0 - Iesire");
                System.out.println("1 - Inecuatia de gradul I");
                System.out.println("2 - Inecuatia de gradul II");
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
                                System.out.println("Ai ales inecuatia de gradul I, avand forma aX + b < c");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b: ");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x apartine intervalului ( - inf , +" + x + " )");
                            }
                            if (optiune4==2){
                                System.out.println("Ai ales inecuatia de gradul I, avand forma aX + b <= c");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b: ");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x apartine intervalului ( - inf , +" + x + " ]");
                            }
                            if (optiune4==3){
                                System.out.println("Ai ales inecuatia de gradul I, avand forma aX + b >= c");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b: ");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x apartine intervalului [ "+ x + " , inf )");
                            }
                            if (optiune4==4){
                                System.out.println("Ai ales inecuatia de gradul I, avand forma aX + b > c");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b: ");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c: ");
                                double c = scan.nextDouble();
                                double x = (c - b) / a;
                                System.out.println("x apartine intervalului ( "+ x + " , inf )");
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
                                System.out.println("Ai ales inecuatia de gradul II, avand forma: aX" + Character.toString((char) 178) + " + bX + c < d");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b:");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c:");
                                double c = scan.nextDouble();
                                System.out.print("Introduceti pe d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    System.out.println("x apartine intervalului ( " + x1 + " , " + x2 + " )");
                                } else {
                                    System.out.println("Inecuatia nu are solutii in multimea numerelor reale R!");
                                }
                            }
                            if (optiune5==2){
                                System.out.println("Ai ales inecuatia de gradul II, avand forma: aX" + Character.toString((char) 178) + " + bX + c <= d");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b:");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c:");
                                double c = scan.nextDouble();
                                System.out.print("Introduceti pe d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    System.out.println("x apartine intervalului [ " + x1 + " , " + x2 + " ]");
                                } else {
                                    System.out.println("Inecuatia nu are solutii in multimea numerelor reale R!");
                                }
                            }
                            if (optiune5==3){
                                System.out.println("Ai ales inecuatia de gradul II, avand forma: aX" + Character.toString((char) 178) + " + bX + c >= d");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b:");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c:");
                                double c = scan.nextDouble();
                                System.out.print("Introduceti pe d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    if (x1<=x2){
                                        System.out.println("x apartine intervalului ( - inf, " + x1 + "] U [ " + x2 + " )");
                                    }
                                    else if (x1>x2){
                                        System.out.println("x apartine intervalului ( - inf, " + x2 + "] U [ " + x1 + " )");
                                    }

                                } else {
                                    System.out.println("Inecuatia nu are solutii in multimea numerelor reale R!");
                                }
                            }
                            if (optiune5==4){
                                System.out.println("Ai ales inecuatia de gradul II, avand forma: aX" + Character.toString((char) 178) + " + bX + c > d");
                                double a=0;
                                int z = 1;
                                while (z != 0){
                                    System.out.print("Introduceti pe a: ");
                                    a = scan.nextDouble();
                                    if (a == 0) {
                                        System.out.println("Valoarea lui a trebuie sa fie diferita de zero!");
                                    }
                                    else{
                                        z = 0;
                                    }
                                }
                                System.out.print("Introduceti pe b:");
                                double b = scan.nextDouble();
                                System.out.print("Introduceti pe c:");
                                double c = scan.nextDouble();
                                System.out.print("Introduceti pe d:");
                                double d = scan.nextDouble();
                                double x1, x2;
                                double delta = (b * b) - (4 * a * c);
                                if (delta >= 0) {
                                    x1 = (-1 * b - Math.sqrt(delta)) / (2 * a);
                                    x2 = (-1 * b + Math.sqrt(delta)) / (2 * a);
                                    if (x1<=x2){
                                        System.out.println("x apartine intervalului ( - inf, " + x1 + ") U ( " + x2 + " )");
                                    }
                                    else if (x1>x2){
                                        System.out.println("x apartine intervalului ( - inf, " + x2 + ") U ( " + x1 + " )");
                                    }

                                } else {
                                    System.out.println("Inecuatia nu are solutii in multimea numerelor reale R!");
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
                } //inchidere loop3
            }
            if (optiune1==0){
                loop1=0;
                System.out.println("La revedere!");
            }
        } // terminaer loop1

    }

}
