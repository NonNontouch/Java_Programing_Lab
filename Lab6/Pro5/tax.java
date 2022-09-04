package Pro5;

public class tax {
    private int income;
    private double calculatedtax;
    private short Status;
    private double[] rate = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.36 };
    private int[][] brackets = {
            { 8350, 33950, 82250, 171550, 372950 },
            { 16700, 67900, 137050, 20885, 372950 },
            { 8350, 3395, 68525, 104425, 186475 },
            { 11950, 45500, 117450, 190200, 372950 } };

    public tax() {
        this.income=400000;
        this.Status=0;
    }

    public tax(int income, short Status) {
        this.income = income;
        this.Status = Status;
    }

    public double gettax() {

        if (income <= brackets[Status][0]) {
            calculatedtax = income * 0.10;
        } else if (income <= brackets[Status][1]) {
            calculatedtax = brackets[Status][0] * 0.1 + (income - brackets[Status][0]) * 0.15;
        } else if (income <= brackets[Status][2]) {
            calculatedtax = brackets[Status][0] * 0.1 + (brackets[Status][1] - brackets[Status][0]) * 0.15
                    + (income - brackets[Status][1]) * 0.25;
        } else if (income <= brackets[Status][3]) {
            calculatedtax = brackets[Status][0] * 0.1 + (brackets[Status][1] - brackets[Status][0]) * 0.15
                    + (brackets[Status][2] - brackets[Status][1]) * 0.25 + (income - brackets[Status][2]) * 0.28;
        } else if (income <= brackets[Status][4]) {
            calculatedtax = brackets[Status][0] * 0.1 + (brackets[Status][1] - brackets[Status][0]) * 0.15
                    + (brackets[Status][2] - brackets[Status][1]) * 0.25
                    + (brackets[Status][3] - brackets[Status][2]) * 0.28 + (income - brackets[Status][3]) * 0.33;
        } else {
            calculatedtax = brackets[Status][0] * 0.1 + (brackets[Status][1] - brackets[Status][0]) * 0.15
                    + (brackets[Status][2] - brackets[Status][1]) * 0.25
                    + (brackets[Status][3] - brackets[Status][2]) * 0.28
                    + (brackets[Status][4] - brackets[Status][3]) * 0.33 + (income - brackets[Status][4]) * 0.35;
        }
        return calculatedtax;
    }

}
