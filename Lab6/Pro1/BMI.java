package Pro1;

public class BMI {
    private double weight;
    private double heightfeet;
    private double heightinch;
    private double bminumber;

    public void getweight(double weight) {
        this.weight = weight;
    }

    public void gethightfeet(double heightfeet) {
        this.heightfeet = heightfeet;
    }

    public void getheightinch(double heightinch) {
        this.heightinch = heightinch;
    }

    public String getBMI() {
        heightinch = ((heightfeet * 12) + heightinch) * 0.0254;
        weight = weight * 0.45359237;
        bminumber = weight / (heightinch * heightinch);
        if (bminumber < 18.5) {
            return "Underweight";
        } 
        else if (bminumber >= 18.5 && bminumber < 25.0) {
            return "Normal";
        } 
        else if (bminumber >= 25.0 && bminumber < 30.0) {
            return "Overweight";
        }
        else 
        {
            return "Obese";
        }

        

    }
}
