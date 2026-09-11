class LoanReceipt {

    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(
            String memberId,
            String[] bookIds) {

        this.memberId = memberId;

        // Copy array
        this.bookIds =
            bookIds.clone();
    }

    public String[] getBookIds() {

        // Return a copy
        return bookIds.clone();
    }

    public LoanReceipt withCorrectedBookId(
            int index,
            String newId) {

        String[] newBooks =
            bookIds.clone();

        newBooks[index] = newId;

        return new LoanReceipt(
            memberId,
            newBooks
        );
    }
}


class ReferenceOnlyLoanReceipt
        extends LoanReceipt {

    private String roomNumber;

    public ReferenceOnlyLoanReceipt(
            String memberId,
            String[] bookIds,
            String roomNumber) {

        super(memberId, bookIds);

        this.roomNumber = roomNumber;
    }
}


class CirculationLedger {

    static String branchCode;

    // Static block
    static {
        branchCode = "MAIN";
    }

    static String processNightlyCirculation(
            LoanReceipt[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int referenceOnly = 0;
        int regular = 0;

        for (int i = 0;
             i < receipts.length;
             i++) {

            if (receipts[i] == null) {

                nullSkipped++;
            }
            else {

                processed++;

                if (receipts[i]
                    instanceof ReferenceOnlyLoanReceipt) {

                    referenceOnly++;
                }
                else {

                    regular++;
                }
            }
        }

        return processed + " processed | " +
               nullSkipped + " null skipped | " +
               referenceOnly +
               " reference-only | " +
               regular + " regular";
    }


    public static void main(String[] args) {

        String[] books = {
            "BK-100",
            "BK-101"
        };

        LoanReceipt r =
            new LoanReceipt(
                "LIB-001",
                books
            );

        LoanReceipt corrected =
            r.withCorrectedBookId(
                1,
                "BK-102"
            );

        System.out.println(
            r.getBookIds()[1]
        );

        System.out.println(
            corrected.getBookIds()[1]
        );

        LoanReceipt[] receipts = {

            new ReferenceOnlyLoanReceipt(
                "LIB-001",
                new String[]{"BK-200"},
                "Reading Room 3"
            ),

            null,

            new LoanReceipt(
                "LIB-002",
                new String[]{"BK-201"}
            )
        };

        System.out.println(
            processNightlyCirculation(receipts)
        );
    }
}