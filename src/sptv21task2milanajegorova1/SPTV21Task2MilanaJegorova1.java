package sptv21task2milanajegorova1;

import java.util.Scanner;

public class SPTV21Task2MilanaJegorova1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = Integer.parseInt(Integer.toString(number).substring(0,1))
                +Integer.parseInt(Integer.toString(number).substring(1,2))
                +Integer.parseInt(Integer.toString(number).substring(2,3));
            System.out.println(sum);
    }
}