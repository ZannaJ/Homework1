package com.company;

public class Main {

    public static void main(String[] args) {
    int Vowels = 0;
    String a = "Apples";
    a = a.toLowerCase();


    for(int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            Vowels++;

        }
    }
    System.out.println("Numbers of vowels:" + Vowels);

    }
}
