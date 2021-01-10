package conko3;

import java.awt.EventQueue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class guiProject {

private JFrame frame;
private JTextField eightTo12Field;
private JTextField twelveTo16Field;
private JTextField sixteenTo20Field;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	guiProject window = new guiProject();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public guiProject() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(Color.DARK_GRAY);
frame.setBounds(100, 100, 752, 565);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("TODO List");
frame.getContentPane().setLayout(null);


JLabel dateLabel = new JLabel("Today's date:");
dateLabel.setBackground(Color.LIGHT_GRAY);
dateLabel.setForeground(Color.MAGENTA);
dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
dateLabel.setBounds(102, 22, 225, 45);
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
  LocalDateTime now = LocalDateTime.now();
  dateLabel.setText(dateLabel.getText()+dtf.format(now));
frame.getContentPane().add(dateLabel);


JLabel goalLabel = new JLabel("/    3");
goalLabel.setForeground(Color.MAGENTA);
goalLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
goalLabel.setHorizontalAlignment(SwingConstants.CENTER);
goalLabel.setBounds(83, 193, 45, 40);
frame.getContentPane().add(goalLabel);


JLabel doneThingsLabel = new JLabel("0");
doneThingsLabel.setForeground(Color.MAGENTA);
doneThingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
doneThingsLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
doneThingsLabel.setBounds(39, 193, 45, 40);
frame.getContentPane().add(doneThingsLabel);


JLabel activitiesLabel = new JLabel("Activities that you should do today:");
activitiesLabel.setForeground(Color.MAGENTA);
activitiesLabel.setBackground(Color.CYAN);
activitiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
activitiesLabel.setBounds(376, 24, 331, 40);
frame.getContentPane().add(activitiesLabel);


eightTo12Field = new JTextField();
eightTo12Field.setBounds(424, 90, 196, 73);
frame.getContentPane().add(eightTo12Field);


twelveTo16Field = new JTextField();
twelveTo16Field.setBounds(424, 224, 196, 73);
frame.getContentPane().add(twelveTo16Field);


sixteenTo20Field = new JTextField();
sixteenTo20Field.setBounds(424, 351, 196, 73);
frame.getContentPane().add(sixteenTo20Field);


JRadioButton failedButton1 = new JRadioButton();
failedButton1.setBackground(Color.RED);
failedButton1.setHorizontalAlignment(SwingConstants.CENTER);
failedButton1.setFont(new Font("Tahoma", Font.PLAIN, 11));
failedButton1.setBounds(665, 90, 32, 30);
frame.getContentPane().add(failedButton1);


JRadioButton completedButton1 = new JRadioButton("");
completedButton1.setBackground(Color.GREEN);
completedButton1.setHorizontalAlignment(SwingConstants.CENTER);
completedButton1.setBounds(665, 139, 32, 30);
frame.getContentPane().add(completedButton1);


JRadioButton failedButton2 = new JRadioButton("");
failedButton2.setBackground(Color.RED);
failedButton2.setHorizontalAlignment(SwingConstants.CENTER);
failedButton2.setBounds(665, 224, 32, 30);
frame.getContentPane().add(failedButton2);


JRadioButton completedButton2 = new JRadioButton("");
completedButton2.setBackground(Color.GREEN);
completedButton2.setHorizontalAlignment(SwingConstants.CENTER);
completedButton2.setBounds(665, 268, 32, 30);
frame.getContentPane().add(completedButton2);


JRadioButton failedButton3 = new JRadioButton("");
failedButton3.setBackground(Color.RED);
failedButton3.setHorizontalAlignment(SwingConstants.CENTER);
failedButton3.setBounds(665, 345, 32, 30);
frame.getContentPane().add(failedButton3);


JRadioButton completedButton3 = new JRadioButton("");
completedButton3.setBackground(Color.GREEN);
completedButton3.setHorizontalAlignment(SwingConstants.CENTER);
completedButton3.setBounds(665, 394, 32, 30);
frame.getContentPane().add(completedButton3);


JLabel lblNewLabel = new JLabel("8:00 to 12:00");
lblNewLabel.setForeground(Color.MAGENTA);
lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
lblNewLabel.setBounds(198, 117, 118, 14);
frame.getContentPane().add(lblNewLabel);


JLabel lblNewLabel_1 = new JLabel("12:00 to 16:00");
lblNewLabel_1.setForeground(Color.MAGENTA);
lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
lblNewLabel_1.setBounds(198, 251, 109, 14);
frame.getContentPane().add(lblNewLabel_1);


JLabel lblNewLabel_2 = new JLabel("16:00 to 20:00");
lblNewLabel_2.setForeground(Color.MAGENTA);
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
lblNewLabel_2.setBounds(198, 377, 111, 14);
frame.getContentPane().add(lblNewLabel_2);


JButton EndExitBtn = new JButton("FINITTO");
EndExitBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
EndExitBtn.setForeground(Color.MAGENTA);
EndExitBtn.setBounds(462, 456, 129, 46);
frame.getContentPane().add(EndExitBtn);


}
}
