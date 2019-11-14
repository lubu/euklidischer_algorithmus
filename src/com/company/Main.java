package com.company;
import java.util.Scanner;

public class Main {
    // Euklidischer Algorithmus

    // Bitte den schlechten Code zu entschuldigen - ist mein erster Versuch in Java bzw. Programmieren generell ;)

    // Zahlen einlesen
    public static void main(String[] args) {
    System.out.println("Berechnung ggT - Euklidischer Algorithmus");
	System.out.println("Gibt die erste Zahl ein: ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Gib die zweite Zahl ein:");
	int b = sc.nextInt();
	int c;
	int r;
	int ggt;
    //Überprüfung der eingegebenen Zahlen
        if (a==0 && b==0) {
            System.out.println("Nicht möglich");
            System.exit(0);
        }
        else if (a==0 || b==0) {
            if (a == 0) {
                ggt = b;
                System.out.println("Ergebnis ggT: " + ggt);
                System.exit(0);
            }
            else {
                ggt = a;
                System.out.println("Ergebnis ggT: " + ggt);
                System.exit(0);
            }
        }
        else {
            // Euklidischer Algorithmus
            if (a >= b) {
                do {
                    r = a % b;
                    a = b;
                    b = r;
                } while (r != 0);
                System.out.println("Ergebnis ggT: " +a);
                System.exit(0);
            }
            else {
                c = a;
                a = b;
                b = c;
                do {
                    r = a % b;
                    a = b;
                    b = r;
                } while (r != 0);
                System.out.println("Ergebnis ggT: " +a);
                System.exit(0);
            }
        }
        }

    }
