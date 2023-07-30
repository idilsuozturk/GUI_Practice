import javax.swing.*;
import java.awt.event.*;  
import java.awt.*;

public class BMIPanel extends JPanel{
    private JTextField weight;
    private JTextField height;
    private JLabel result;
    private JPanel panel;
    private JLabel weightLabel;
    private JLabel heightLabel;
    private JButton button;
    private double bmi;

    public BMIPanel() {
        result = new JLabel();
        createTextField();
        createButton();
        createPanel();
    }

    public void createTextField() {
        weightLabel = new JLabel("Weight: ");
        heightLabel = new JLabel("Height: ");

        weight = new JTextField(10);
        height = new JTextField(10);
    }

    private void createButton() {
        button = new JButton("Calculate");
        ActionListener listener = new AddListener();
        button.addActionListener(listener);
    }

    private void createPanel() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(weightLabel);
        panel.add(weight);
        panel.add(heightLabel);
        panel.add(height);
        panel.add(button);
        panel.add(result);
        add(panel);
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double heightInt = Double.parseDouble(height.getText());
            double weightInt = Double.parseDouble(weight.getText());
            bmi = weightInt / (heightInt * heightInt);
            result.setText("BMI is: " + bmi);
        }
    }
}
