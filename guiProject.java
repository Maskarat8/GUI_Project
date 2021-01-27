package conko3;

import java.awt.EventQueue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

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
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 752, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TODO List");
		frame.getContentPane().setLayout(null);


		JLabel dateLabel = new JLabel("Today's date:");
		dateLabel.setBackground(Color.LIGHT_GRAY);
		dateLabel.setForeground(Color.MAGENTA);
		dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dateLabel.setBounds(20, 22, 225, 45);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		dateLabel.setText(dateLabel.getText()+dtf.format(now));
		frame.getContentPane().add(dateLabel);


		JLabel goalLabel = new JLabel("/ 3");
		goalLabel.setForeground(Color.MAGENTA);
		goalLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		goalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		goalLabel.setBounds(652, 459, 45, 40);
		frame.getContentPane().add(goalLabel);


		JLabel doneThingsLabel = new JLabel("0");
		doneThingsLabel.setForeground(Color.MAGENTA);
		doneThingsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		doneThingsLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		doneThingsLabel.setBounds(622, 459, 45, 40);
		frame.getContentPane().add(doneThingsLabel);


		JLabel activitiesLabel = new JLabel("Activities that you should do today:");
		activitiesLabel.setForeground(Color.MAGENTA);
		activitiesLabel.setBackground(Color.CYAN);
		activitiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		activitiesLabel.setBounds(292, 24, 331, 40);
		frame.getContentPane().add(activitiesLabel);


		eightTo12Field = new JTextField();
		eightTo12Field.setBounds(242, 90, 378, 73);
		frame.getContentPane().add(eightTo12Field);


		twelveTo16Field = new JTextField();
		twelveTo16Field.setBounds(242, 224, 378, 73);
		frame.getContentPane().add(twelveTo16Field);


		sixteenTo20Field = new JTextField();
		sixteenTo20Field.setBounds(242, 351, 378, 73);
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
		completedButton1.setBounds(665, 133, 32, 30);
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
		failedButton3.setBounds(665, 351, 32, 30);
		frame.getContentPane().add(failedButton3);


		JRadioButton completedButton3 = new JRadioButton("");
		completedButton3.setBackground(Color.GREEN);
		completedButton3.setHorizontalAlignment(SwingConstants.CENTER);
		completedButton3.setBounds(665, 394, 32, 30);
		frame.getContentPane().add(completedButton3);


		JLabel lblNewLabel = new JLabel("8:00 to 12:00");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(64, 117, 156, 14);
		frame.getContentPane().add(lblNewLabel);


		JLabel lblNewLabel_1 = new JLabel("12:00 to 16:00");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(64, 251, 147, 14);
		frame.getContentPane().add(lblNewLabel_1);


		JLabel lblNewLabel_2 = new JLabel("16:00 to 20:00");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(64, 377, 147, 14);
		frame.getContentPane().add(lblNewLabel_2);



		ButtonGroup group1 = new ButtonGroup();
		group1.add(failedButton1);
		group1.add(completedButton1);

		ButtonGroup group2 = new ButtonGroup();
		group2.add(failedButton2);
		group2.add(completedButton2);

		ButtonGroup group3 = new ButtonGroup();
		group3.add(failedButton3);
		group3.add(completedButton3);

		//Взимаме текстовите файлове. Всеки отделен файл отговаря за съответните полета на интерфейса.
		File file1 = new File("8to12.txt");
		File file2 = new File("12to16.txt");
		File file3 = new File("16to20.txt");

		JButton updateButton = new JButton("UPDATE");
		updateButton.setBackground(Color.CYAN);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				try {
					//създаваме filewriter-и които да пишат върху файловете текста от textfield-овете
					FileWriter fileWriter1 = new FileWriter(file1);
					FileWriter fileWriter2 = new FileWriter(file2);
					FileWriter fileWriter3 = new FileWriter(file3);


					String field1Result = eightTo12Field.getText();
					String field2Result = twelveTo16Field.getText();
					String field3Result = sixteenTo20Field.getText();

					int completedCounter = 0;
					//проверки дали са изпълнени дадените цели, според това кой радиобутон е натиснат
					//В случай че са изпълнени, текстът се добавя към файловете
					//Броячът за изпълнени цели се увеличава
					if(completedButton1.isSelected()) {

						fileWriter1.write(String.format("%s%n", field1Result));
						fileWriter1.flush();
						fileWriter1.close();
						completedCounter++;
					}

					if(completedButton2.isSelected()) {

						fileWriter2.write(String.format("%s%n", field2Result));
						fileWriter2.flush();
						fileWriter2.close();
						completedCounter++;
					}

					if(completedButton3.isSelected()) {

						fileWriter3.write(String.format("%s%n", field3Result));
						fileWriter3.flush();
						fileWriter3.close();

						completedCounter++;
					}

					doneThingsLabel.setText(String.valueOf(completedCounter));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


			}
		});
		updateButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		updateButton.setForeground(Color.MAGENTA);
		updateButton.setBounds(462, 456, 129, 46);
		frame.getContentPane().add(updateButton);
		JButton btnNewButton = new JButton("CHECK COMPLETED TODAY ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Изваждане на информация за деня, четейки информацията от файловете в които са записани целите
				String output1 = getTextFromFile(file1);
				String output2 = getTextFromFile(file2);
				String output3 = getTextFromFile(file3);

				StringBuilder sb = new StringBuilder();
				sb.append("8:00 to 12:00\n").append(output1+"\n")
				.append("12:00 to 16:00\n").append(output2+"\n")
				.append("16:00 to 20:00\n").append(output3+"\n");

				JOptionPane.showMessageDialog(frame, sb.toString().trim() , "Completed Today", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(20, 458, 346, 46);
		frame.getContentPane().add(btnNewButton);
	}
	public String getTextFromFile(File file) {

		StringBuilder sb = new StringBuilder();
		try {
			Scanner reader = new Scanner(file);

			while(reader.hasNextLine()) {
				sb.append(reader.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString().trim();
	}
}