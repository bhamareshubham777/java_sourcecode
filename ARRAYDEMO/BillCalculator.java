package ARRAYDEMO;


public class BillCalculator {
    double[] gstCalculation(double[] amounts) {
        double[] gstAmounts = new double[amounts.length];

        for (int a = 0; a < amounts.length; a++) {
            if (amounts[a] < 500) {
                gstAmounts[a] = amounts[a] * 0.05;
            } else {
                gstAmounts[a] = amounts[a] * 0.1;
            }
        }
        return gstAmounts;
    }

    void calculateBill(double[] amounts) {
        double[] gstValues = gstCalculation(amounts);

        double[] totalAmounts = new double[amounts.length];

        for (int a = 0; a < amounts.length; a++) {
            totalAmounts[a] = amounts[a] + gstValues[a];
        }

        double totalBillAmt = 0.0;
        double totalGstAmt = 0.0;
        double totalFinalAmt = 0.0;

        for (int a = 0; a < amounts.length; a++) {
            totalBillAmt += amounts[a];
            totalGstAmt += gstValues[a];
            totalFinalAmt += totalAmounts[a];
        }

        System.out.println("BIL.AMT\tGST.AMT\tTOTAL");
        System.out.println("----------------------------------------");
        for (int a = 0; a < amounts.length; a++) {
            System.out.println(amounts[a] + "\t" + gstValues[a] + "\t" + totalAmounts[a]);
        }
        System.out.println("----------------------------------------");
        System.out.println(totalBillAmt + "\t" + totalGstAmt + "\t" + totalFinalAmt);
    }
}
