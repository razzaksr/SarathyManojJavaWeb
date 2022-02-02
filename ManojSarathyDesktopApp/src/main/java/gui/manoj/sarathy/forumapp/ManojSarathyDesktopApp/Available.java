package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Available extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	List<Forum> list ;
	JScrollPane scrollPane ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Available frame = new Available();
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
	public void collect()
	{
		model=new DefaultTableModel();
		model.addColumn("Forum Name");model.addColumn("Forum Technology");model.addColumn("Forum Head");
		model.addColumn("Forum Members Count");model.addColumn("Forum Production Hours");
		list = FileControl.fetch();
		Vector<String> tmp=null;
		for(Forum f:list)
		{
			tmp=new Vector<String>();
			tmp.add(f.getGroupName());tmp.add(f.getGroupTechnology());tmp.add(f.getGroupIncharge());
			tmp.add(""+f.getMembersCount());tmp.add(""+f.getProductionHours());
			model.addRow(tmp);
		}
		table = new JTable(model);
		table.setForeground(Color.BLUE);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setBackground(Color.PINK);
		scrollPane.setViewportView(table);
	}
	
	public Available() 
	{
		setBackground(Color.WHITE);
		setTitle("Available Forums");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Available.class.getResource("/gui/manoj/sarathy/forumapp/ManojSarathyDesktopApp/zealous.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		collect();
		
//		model=new DefaultTableModel();
//		model.addColumn("Forum Name");model.addColumn("Forum Technology");model.addColumn("Forum Head");
//		model.addColumn("Forum Members Count");model.addColumn("Forum Production Hours");
//		list = FileControl.fetch();
//		Vector<String> tmp=null;
//		for(Forum f:list)
//		{
//			tmp=new Vector<String>();
//			tmp.add(f.getGroupName());tmp.add(f.getGroupTechnology());tmp.add(f.getGroupIncharge());
//			tmp.add(""+f.getMembersCount());tmp.add(""+f.getProductionHours());
//			model.addRow(tmp);
//		}
		
		/*
		 * model.addColumn("one");model.addColumn("two");model.addColumn("three");
		 * 
		 * Vector<String> hai=new Vector<String>(); hai.add("Sarathy");
		 * hai.add("Mettur"); hai.add("Java");
		 * 
		 * model.addRow(hai);
		 */
		
		
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String found=(String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
				JOptionPane.showMessageDialog(Available.this, found+" has selected to edit");
				Update up=new Update(table.getSelectedRow());
				up.setVisible(true);
				Available.this.dispose();
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String found=(String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
				JOptionPane.showMessageDialog(Available.this, found+" has selected to delete");
				list.remove(table.getSelectedRow());
				FileControl.affect(list);
				collect();
			}
		});
		panel.add(btnNewButton_1);
	}

}
