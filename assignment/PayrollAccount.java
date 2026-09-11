class PayrollAccount {

    private double basicSalary;
    private double bonus;

    PayrollAccount(double basicSalary) {

        if (basicSalary < 0)
            basicSalary = 0;

        this.basicSalary = basicSalary;
    }

    void creditBonus(double amount) {

        if (amount <= 0)
            System.out.println("Invalid bonus");
        else
            bonus += amount;
    }

    void deductTax(double percent) {

        if (percent < 0 || percent > 100)
            System.out.println("Invalid tax percentage");
        else
            basicSalary = basicSalary - (basicSalary * percent / 100);
    }

    double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class Pay {

    public static void main(String[] args) {

        PayrollAccount p = new PayrollAccount(50000);

        p.creditBonus(5000);
        p.deductTax(10);

        System.out.println("Net salary: Rs " +
                           p.getNetSalary());
    }
}