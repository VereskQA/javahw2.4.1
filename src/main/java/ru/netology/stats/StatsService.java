package ru.netology.stats;

public class StatsService {
    public long salesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        StatsService service = new StatsService();
        return service.salesSum(sales) / 12;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long salesBelowAverage(long[] sales) {
        StatsService service = new StatsService();
        long average = service.averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count ++;
            }
        }
        return count;
    }

    public long salesOverAverage(long[] sales) {
        StatsService service = new StatsService();
        long average = service.averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count ++;
            }
        }
        return count;
    }
}
