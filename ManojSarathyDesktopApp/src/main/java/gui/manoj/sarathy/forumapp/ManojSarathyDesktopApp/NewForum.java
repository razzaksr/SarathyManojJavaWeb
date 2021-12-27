package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class NewForum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewForum frame = new NewForum();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewForum() {
		setTitle("New forum initiative");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewForum.class.getResource("/gui/manoj/sarathy/forumapp/ManojSarathyDesktopApp/zealous.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 992, 606);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Forum Setup");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(279, 28, 388, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblForumName = new JLabel("Forum Name");
		lblForumName.setHorizontalAlignment(SwingConstants.CENTER);
		lblForumName.setForeground(Color.WHITE);
		lblForumName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblForumName.setBounds(136, 147, 208, 50);
		contentPane.add(lblForumName);
		
		JLabel lblForumTechnology = new JLabel("Forum Technology");
		lblForumTechnology.setHorizontalAlignment(SwingConstants.CENTER);
		lblForumTechnology.setForeground(Color.WHITE);
		lblForumTechnology.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblForumTechnology.setBounds(157, 212, 208, 50);
		contentPane.add(lblForumTechnology);
		
		JLabel lblForumIncharge = new JLabel("Forum Incharge");
		lblForumIncharge.setHorizontalAlignment(SwingConstants.CENTER);
		lblForumIncharge.setForeground(Color.WHITE);
		lblForumIncharge.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblForumIncharge.setBounds(146, 272, 208, 50);
		contentPane.add(lblForumIncharge);
		
		JLabel lblForumMemberscount = new JLabel("Forum MembersCount");
		lblForumMemberscount.setHorizontalAlignment(SwingConstants.CENTER);
		lblForumMemberscount.setForeground(Color.WHITE);
		lblForumMemberscount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblForumMemberscount.setBounds(171, 332, 208, 50);
		contentPane.add(lblForumMemberscount);
		
		JLabel lblForumProductionHours = new JLabel("Forum Production Hours");
		lblForumProductionHours.setHorizontalAlignment(SwingConstants.CENTER);
		lblForumProductionHours.setForeground(Color.WHITE);
		lblForumProductionHours.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblForumProductionHours.setBounds(147, 392, 267, 50);
		contentPane.add(lblForumProductionHours);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(574, 147, 199, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(574, 212, 199, 50);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(574, 272, 199, 50);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(574, 332, 199, 50);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(574, 392, 199, 50);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Enroll");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Forum forum=new Forum();
				forum.setGroupName(textField.getText());
				forum.setGroupTechnology(textField_1.getText());
				forum.setGroupIncharge(textField_2.getText());
				forum.setMembersCount(Integer.parseInt(textField_3.getText()));
				forum.setProductionHours(Integer.parseInt(textField_4.getText()));
				
				List<Forum> tmp = FileControl.fetch();
				//List<Forum> tmp=new ArrayList<Forum>(); // at first time
				tmp.add(forum);
				FileControl.affect(tmp);
				
				JOptionPane.showMessageDialog(NewForum.this, forum.getGroupName()+" has added successfully");
				textField.setText("");textField_1.setText("");
				textField_2.setText("");textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(305, 491, 126, 37);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");textField_1.setText("");
				textField_2.setText("");textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setBounds(511, 491, 126, 37);
		contentPane.add(btnCancel);
	}
}
