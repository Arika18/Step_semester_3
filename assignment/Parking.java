class ParkingTicket {

    String vehicleNo;
    double ratePerMinute;

    ParkingTicket(String vehicleNo, double rate) {

        this.vehicleNo = vehicleNo;
        this.ratePerMinute = rate;
    }

    final double calculateFine(int minutes) {

        return minutes * ratePerMinute;
    }

    final void printReceipt(int minutes) {

        System.out.println(
            vehicleNo +
            " - Fine: Rs " +
            calculateFine(minutes)
        );
    }
}

public class Parking {

    public static void main(String[] args) {

        ParkingTicket[] tickets = {

            new ParkingTicket("TN09AB1234", 2),
            new ParkingTicket("TN22CD5678", 2),
            new ParkingTicket("TN09EF9012", 3),
            new ParkingTicket("TN10GH3456", 2)
        };

        int[] minutes = {15, 0, -5, 8};

        for (int i = 0; i < tickets.length; i++) {

            if (minutes[i] > 0)
                tickets[i].printReceipt(minutes[i]);
            else
                System.out.println(
                    tickets[i].vehicleNo +
                    " - No fine, within allotted time"
                );
        }
    }
}