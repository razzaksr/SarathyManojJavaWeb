package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Find extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox,comboBox_1;
	List<Forum> all ;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Find frame = new Find();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Find() {
		setResizable(false);
		setTitle("Search");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		all = FileControl.fetch();
		Vector<String> techs=new Vector<String>();techs.add("Select technology");
		Vector<String> heads=new Vector<String>();heads.add("Select incharge");
		
		for(int index=0;index<all.size();index++)
		{
			techs.add(all.get(index).getGroupTechnology());
			heads.add(all.get(index).getGroupIncharge());
		}
		
		JLabel lblNewLabel = new JLabel("Search Forums");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(216, 20, 415, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Based on Technology");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(121, 91, 321, 48);
		contentPane.add(lblNewLabel_1);
		
		comboBox = new JComboBox(techs);
		comboBox.setBounds(501, 91, 195, 48);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Based on Count of Members");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(121, 181, 321, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Based on Incharge or Hours");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(121, 280, 321, 48);
		contentPane.add(lblNewLabel_1_2);
		
		comboBox_1 = new JComboBox(heads);
		comboBox_1.setBounds(501, 280, 195, 48);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(501, 181, 195, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(501, 349, 195, 48);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Forum> tmp=new ArrayList<Forum>();
				if(!comboBox.getSelectedItem().equals("Select technology")&&textField.getText().equals("")&&comboBox_1.getSelectedItem().equals("Select incharge")&&textField_1.getText().equals(""))
				{
					for(int index=0;index<all.size();index++)
					{
						if(all.get(index).getGroupTechnology().equals(comboBox.getSelectedItem()))
						{
							tmp.add(all.get(index));
						}
					}
				}
				else if(comboBox.getSelectedItem().equals("Select technology")&&!textField.getText().equals("")&&comboBox_1.getSelectedItem().equals("Select incharge")&&textField_1.getText().equals(""))
				{
					for(int index=0;index<all.size();index++)
					{
						if(all.get(index).getMembersCount()>=Integer.parseInt(textField.getText()))
						{
							tmp.add(all.get(index));
						}
					}
				}
				else if(comboBox.getSelectedItem().equals("Select technology")&&textField.getText().equals("")&&!comboBox_1.getSelectedItem().equals("Select incharge")||textField_1.getText().equals(""))
				{
					for(int index=0;index<all.size();index++)
					{
						if(!textField_1.getText().equals(""))
						{
							if(all.get(index).getGroupIncharge().equals(comboBox_1.getSelectedItem())||
									all.get(index).getProductionHours()>=Integer.parseInt(textField_1.getText()))
							{
								tmp.add(all.get(index));
							}
						}
						else
						{
							if(all.get(index).getGroupIncharge().equals(comboBox_1.getSelectedItem()))
							{
								tmp.add(all.get(index));
							}
						}
					}
				}
				Available ava=new Available(tmp);
				ava.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(278, 433, 100, 48);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setIcon(new ImageIcon(Find.class.getResource("/gui/manoj/sarathy/forumapp/ManojSarathyDesktopApp/zealous.png")));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Select technology");
				textField.setText("");
				comboBox_1.setSelectedItem("Select incharge");
				textField_1.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReset.setBounds(476, 433, 100, 48);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(426, 139, 57, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("OR");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(426, 239, 57, 34);
		contentPane.add(lblNewLabel_2_1);
	}
}
