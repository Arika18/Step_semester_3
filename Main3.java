import java.util.Scanner;

public class Main3 {

    static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] height = new double[3];
        double[] weight = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight: ");
            weight[i] = sc.nextDouble();
        }

        for (int i = 0; i < 3; i++) {

            double bmi = weight[i] / (height[i] * height[i]);

            System.out.println(
                "Person " + (i + 1) +
                " BMI: " + bmi +
                " Status: " + getStatus(bmi)
            );
        }
    }
}