class Account {

    String regNo;
    double totalFee;

    Account(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    final double calculateLateFee(int daysLate) {

        return daysLate * 2000;
    }

    final void printSummary(int daysLate) {

        double fee = calculateLateFee(daysLate);

        System.out.println(
            regNo +
            " | Total Fee: Rs " +
            totalFee +
            " | Late Fee: Rs " +
            fee
        );
    }
}

public class late {

    public static void main(String[] args) {

        Account[] accounts = {

            new Account("RA001", 200000),
            new Account("RA002", 150000),
            new Account("RA003", 180000),
            new Account("RA004", 220000)
        };

        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < accounts.length; i++) {

            if (daysLate[i] > 0)
                accounts[i].printSummary(daysLate[i]);
            else
                System.out.println(
                    accounts[i].regNo +
                    " - On time, no late fee"
                );
        }
    }
}