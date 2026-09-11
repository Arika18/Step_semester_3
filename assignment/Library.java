class Library {

    private String membershipId;
    private String name;
    private boolean premiumMember;

    // Stored internally, but no getter
    private String securityAnswer;

    public LibraryMember() {
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String id) {

        // Set only once
        if (membershipId == null) {
            membershipId = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(
            boolean premium) {

        premiumMember = premium;
    }

    public void setSecurityAnswer(
            String answer) {

        // Simple transformation
        securityAnswer =
            new StringBuilder(answer)
            .reverse()
            .toString();
    }

    public static void main(String[] args) {

        LibraryMember m =
            new LibraryMember();

        m.setMembershipId("LIB-8841");

        // This will be ignored
        m.setMembershipId("FAKE-0000");

        m.setName("Priya");

        m.setPremiumMember(true);

        m.setSecurityAnswer(
            "BlueMountain"
        );

        System.out.println(
            m.getMembershipId()
        );

        System.out.println(
            m.getName()
        );

        System.out.println(
            m.isPremiumMember()
        );
    }
}