package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
       long[] aver = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       StatsService service = new StatsService();
       service.sum(aver);
    }
}