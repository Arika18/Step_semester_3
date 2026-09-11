class FeeAccount {

    void pay(double amount) {

        System.out.println(
            "Paid in one go: Rs " + amount
        );
    }
}

class HostelFeeAccount extends FeeAccount {

    void payInTwoParts(double amount) {

        System.out.println(
            "Paid in two installments: Rs " + amount
        );
    }
}

public class acc {

    public static void main(String[] args) {

        FeeAccount[] accounts = {

            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        double[] amounts = {
            60000, 60000, 60000, 60000
        };

        int hostel = 0;
        int dayScholar = 0;

        for (int i = 0; i < accounts.length; i++) {

            if (accounts[i] instanceof HostelFeeAccount) {

                HostelFeeAccount h =
                    (HostelFeeAccount) accounts[i];

                h.payInTwoParts(amounts[i]);

                hostel++;

            } else {

                accounts[i].pay(amounts[i]);

                dayScholar++;
            }
        }

        System.out.println(
            "Hostel accounts processed: " + hostel
        );

        System.out.println(
            "Day-scholar accounts processed: " +
            dayScholar
        );
    }
}