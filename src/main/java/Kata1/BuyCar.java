package Kata1;

public class BuyingACar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth, double percentLossByMonth) {
        if (startPriceNew <= startPriceOld) {
            return new int[]{0, startPriceOld - startPriceNew};
        }

        double lossByMonth = percentLossByMonth;
        int passedMonths = 0;
        double currentDelta = startPriceOld - startPriceNew;
        double savingsLeft;

        do {
            passedMonths++;

            if (passedMonths % 2 == 0) {
                lossByMonth += 0.5;
            }

            currentDelta *= (1 - lossByMonth /   100);
            savingsLeft = passedMonths * savingPerMonth + currentDelta;

            System.out.println(String.format("End month: %d: percentLoss %.2f available %.3f",
                    passedMonths, lossByMonth, savingsLeft));
        } while (savingsLeft < 0);

        return new int[]{passedMonths, (int) Math.round(savingsLeft)};
    }
}
