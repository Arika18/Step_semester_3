class BookingReceipt {

    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(
            String bookingId,
            String[] seatNumbers) {

        this.bookingId = bookingId;

        this.seatNumbers =
            seatNumbers.clone();
    }

    public String[] getSeatNumbers() {

        return seatNumbers.clone();
    }

    public BookingReceipt withUpdatedSeat(
            int index,
            String newSeat) {

        String[] newSeats =
            seatNumbers.clone();

        newSeats[index] = newSeat;

        return new BookingReceipt(
            bookingId,
            newSeats
        );
    }
}


class GroupBookingReceipt extends BookingReceipt {

    int groupSize;

    public GroupBookingReceipt(
            String bookingId,
            String[] seatNumbers,
            int groupSize) {

        super(bookingId, seatNumbers);

        this.groupSize = groupSize;
    }
}


class Book {

    static String processNightlySettlement(
            BookingReceipt[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int group = 0;
        int individual = 0;

        for (int i = 0; i < receipts.length; i++) {

            if (receipts[i] == null) {
                nullSkipped++;
            }
            else {

                processed++;

                if (receipts[i]
                    instanceof GroupBookingReceipt) {

                    group++;
                }
                else {
                    individual++;
                }
            }
        }

        return processed + " processed | " +
               nullSkipped + " null skipped | " +
               group + " group | " +
               individual + " individual";
    }

    public static void main(String[] args) {

        String[] seats = {"A1", "A2"};

        BookingReceipt b =
            new BookingReceipt("CH-1001", seats);

        BookingReceipt updated =
            b.withUpdatedSeat(1, "A3");

        System.out.println(
            b.getSeatNumbers()[1]
        );

        System.out.println(
            updated.getSeatNumbers()[1]
        );
    }
}