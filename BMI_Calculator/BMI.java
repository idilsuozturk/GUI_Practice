import javax.swing.*;

public class BMI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI CALCULATOR");
        frame.setSize(640, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BMIPanel panel = new BMIPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
