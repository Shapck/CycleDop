package ru.skypro;

public class Main {

    public static void main(String[] args) {
//    №4

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + ":ping");
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + ":pong");
            }
            if(i % 5 == 0 && i % 3 == 0){         System.out.println(i + ":ping pong");
            }
            if(i % 5 != 0 && i % 3 != 0){
                System.out.println(i+": ");
            }
        }
//      №5
        int x = 0, y = 1;
        System.out.print(x + " " + y + " ");
        for(int i = 0; i <= 10; i++){
            int total = x + y;
            x  = y;
            y = total;
            System.out.print(y + " ");
        }
    }
}