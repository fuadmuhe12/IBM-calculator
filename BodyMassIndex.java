package New_class_book;
import javax.swing.JOptionPane;
public class BodyMassIndex {
    public static void main(String[] args) {
        char choice;
        JOptionPane.showMessageDialog(null, "Welcome, This is a body mass index calculator");

        do {
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in Kg"));
            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in m"));
            double BMI = weight / Math.pow(height, 2);
            String status;
            if (BMI > 25)
                status = "your status is Overweight, try to do workout and diet to lower your your body size";
            else if (18.5 < BMI && BMI < 25)
                status = " congratulation your in Healthy status , maintain this state";
            else status = "your status is Underweight, try to eating more balanced food ";
            JOptionPane.showMessageDialog(null, String.format("your BMI : %.2f \n %s", BMI, status));
            choice = JOptionPane.showInputDialog("Do you wanna Measure your " +
                    "IBM again (Y = yes,").toLowerCase().charAt(0);
        }
        while (choice == 'y');
    }
}
