package projet;

import java.io.File;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.util.EventObject;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.ImageIcon;


public class Menu extends JFrame implements ActionListener,WindowListener {
	
	private static final long serialVersionUID = -7982980348928595614L;
	
	public Menu() {
		super("MrJackPocket");
		getContentPane().setBackground(new Color(255, 255, 255));
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize( new Dimension(450, 450));
		this.setLocationRelativeTo(null);
		
		
		
		JPanel contentPane = (JPanel) this.getContentPane();
		
		JButton btnLancer = new JButton("Lancer la partie");
		btnLancer.setBounds(52, 97, 132, 23);
		btnLancer.addActionListener(this);
		getContentPane().setLayout(null);
		contentPane.add(btnLancer);
		
		JButton btnRegles = new JButton("Règles du jeux");
		btnRegles.setBounds(272, 97, 125, 23);
		btnRegles.addActionListener(this);
		contentPane.add(btnRegles);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/projet/Mr_Jack_Pocket.png")));
		lblNewLabel.setBounds(0, 0, 438, 404);
		getContentPane().add(lblNewLabel);
		
		this.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				int clickedButton = JOptionPane.showConfirmDialog(Menu.this,
						"Etes-vous sûr de vouloir quitter le jeu","Bye!",JOptionPane.YES_NO_OPTION );
				if ( clickedButton == JOptionPane.YES_OPTION) {
					//Menu.this.dispose();
					dispose();
				}
			};	
		});			
	
		}
	
	
	
	public static void main(String[] args ) {
		Menu menu = new Menu();
		menu.setVisible(true);
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent event) {
		if ( ((JButton)event.getSource()).getText().equals("Lancer la partie")) {
			Game.Initialisation();
			Menu2.showWindow();
			getContentPane().setBackground(new Color(255, 255, 255));
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			this.setSize( new Dimension(450, 450));
			this.setLocationRelativeTo(null); }
		if ( ((JButton)event.getSource()).getText().equals("Règles du jeux")) {
			try {

		        File pdfFile = new File("C:\\Arnaud\\ISEP\\A1\\Nouveau java\\Mr_Jackv3-20210121T143855Z-001\\Mr_Jackv3\\src\\projet\\Reglesdujeu.pdf");
		        if (pdfFile.exists()) {

		            if (Desktop.isDesktopSupported()) {
		                Desktop.getDesktop().open(pdfFile);
		            } else {
		                System.out.println("Awt Desktop n'est pas supporté");
		            }

		        } else {
		            System.out.println("Le fichier n'existe pas !");
		        }

		        System.out.println("Done");

		      } catch (Exception ex) {
		        ex.printStackTrace();
		      }

		    }
		}
	}


		      
		
	

