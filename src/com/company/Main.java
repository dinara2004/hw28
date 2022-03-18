package com.company;

import java.util.function.UnaryOperator;


public class Main {

    public static void main(String[] args) {
//        sqrt деген метод тузунуз.
//        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).

        System.out.println(sqrt.apply(125.9d));
    }
        static UnaryOperator<Double> sqrt = num -> Math.sqrt(num);
}
