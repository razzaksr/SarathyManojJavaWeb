package sarathy.manoj.ManojSarathyJava.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;

public class Notepad extends JFrame implements ActionListener
{

	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
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
	public Notepad() {
		setFont(new Font("SansSerif", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Notepad.class.getResource("/sarathy/manoj/ManojSarathyJava/gui/zealous.png")));
		setTitle("Z - Pad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 427);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save As");
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(this);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Font");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("View");
		menuBar.add(mnNewMenu_2);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Wrap");
		mnNewMenu_2.add(chckbxmntmNewCheckItem);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("About Z -Pad");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(textArea);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String which=e.getActionCommand();
		JOptionPane.showMessageDialog(Notepad.this, which);
		if(which.equals("Save As"))
		{
			JFileChooser choose=new JFileChooser();
			int res=choose.showSaveDialog(Notepad.this);
			if(res==choose.APPROVE_OPTION)
			{
				try {
					File file = choose.getSelectedFile();
					FileOutputStream fos=new FileOutputStream(file.getAbsolutePath());
					
					fos.write(textArea.getText().getBytes());
					fos.close();
					JOptionPane.showMessageDialog(Notepad.this, file.getName()+" File has saved");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else {
				JOptionPane.showMessageDialog(Notepad.this, " File hasn't saved");
			}
		}
		else if(which.equals("Exit"))
		{
			int res=JOptionPane.showConfirmDialog(Notepad.this, "Are you sure want to exit?");
			if(res==JOptionPane.YES_OPTION)
				Notepad.this.dispose();
		}
		else if(which.equals("Open"))
		{
			JFileChooser chooser=new JFileChooser();
			int res=chooser.showOpenDialog(Notepad.this);
			if(res==chooser.APPROVE_OPTION)
			{
				try
				{
					File file=chooser.getSelectedFile();
					FileInputStream fis=new FileInputStream(file.getAbsolutePath());
					byte[] tmp=new byte[fis.available()];
					fis.read(tmp);
					fis.close();
					
					String hai=new String(tmp);
					
					textArea.setText(hai);
				}
				catch(IOException ii) {}
			}
		}
	}

}
