class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight;
    private double height;

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        return (weight * KILOGRAMS_PER_POUND / Math.pow(height * METERS_PER_INCH, 2));
    }

    // public String gotStatus() {
    //     double bmi = getBMI();
    //     if (bmi < 18.5) {
    //         return "Underweight";
    //     }
    // }
    // public String getStatus()
    // {
    //     double bmi = this.getBMI();
    //     if (bmi < 18.5) {
    //         return "Undeweight";
    //     } else if (bmi < 25) {
    //         return "Normal";
    //     }
    //     // return "heda";
    // }
    public void getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            System.out.println("(Underweight)");
        } else if (bmi < 25) {
            System.out.println("(Normal)");
        } else if (bmi > 25) {
            System.out.println("(Overweight)");
        }
    }

    // public String getStatus() {
    //     if (bmi < 18.5) 
    //     return "Underweight";
    //     double bmi = getBMI();
    //     if (bmi < 18.5) 
    //         return "Underweight";

    // }
    public String getName() {
        return name;
    }
}

public class BMITest {
    public static void main(String[] args) {
        BMI bmiTanvir = new BMI("Tanvir Rifat", 145, 70);
        BMI bmiTamim = new BMI("Tamim Shahriar Subeen", 140, 60);
        System.out.print("The BMI For " + bmiTanvir.getName() + " is " + bmiTanvir.getBMI()+" ");
        bmiTanvir.getStatus();
        System.out.print("The BMI For " + bmiTamim.getName() + " is " + bmiTamim.getBMI()+" ");
        bmiTamim.getStatus();
    }
}
