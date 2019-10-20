package edu.dmacc.coma510.week03;

public class OrderOfPrecedence {
    public static void main(String[] args) {
        System.out.println("operations");
        System.out.println(  1 + 2 * 3 - 4 / 5  ); // 7
        System.out.println(  1 + 2 * (3 - 4) /5  ); // 1
        System.out.println(  (1 + 2) * 3 - 4 / 5  ); // 9
        System.out.println(  (1 + 2) * (3 - 4) / 5  ); // 0
    }
}
