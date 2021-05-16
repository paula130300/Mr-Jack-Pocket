package projet;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Menu2 {
	private static JTextField txtJoueur;
	private static JTextField txtJoueur_1;

	public static void main(String[] args) {
		Game.Initialisation();
		showWindow();
        for (int i = 1; i<=8; i++) {
            switch (i%2) {
            case 1:
                Game.TourImpairs();
                break;
            case 0:
                Game.TourPairs();
                break;
            }
        }
            
	}
	
	

	public static void showWindow() {
		
		JFrame frame = new JFrame("Mr Jack Pocket ");
		frame.setBounds(100,100,700,630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("R\u00E9veler Mr Jack");
		btnNewButton.setBounds(526, 100, 136, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district12.getImage())));
		btnNewButton_1.setBounds(55, 181, 150, 150);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district22.getImage())));
		btnNewButton_1_1.setBounds(203, 181, 150, 150);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district32.getImage())));
		btnNewButton_1_2.setBounds(352, 181, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district13.getImage())));
		btnNewButton_1_2_1.setBounds(55, 330, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("");
		btnNewButton_1_2_2.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district23.getImage())));
		btnNewButton_1_2_2.setBounds(203, 330, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("");
		btnNewButton_1_2_3.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district33.getImage())));
		btnNewButton_1_2_3.setBounds(352, 330, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_2_4 = new JButton("");
		btnNewButton_1_2_4.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district31.getImage())));
		btnNewButton_1_2_4.setBounds(352, 32, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_4);
		
		JButton btnNewButton_1_2_5 = new JButton("");
		btnNewButton_1_2_5.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district21.getImage())));
		btnNewButton_1_2_5.setBounds(203, 32, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_5);
		
		JButton btnNewButton_1_2_6 = new JButton("");
		btnNewButton_1_2_6.setIcon(new ImageIcon(Menu2.class.getResource(StartDistrict.district11.getImage())));
		btnNewButton_1_2_6.setBounds(55, 32, 150, 150);
		frame.getContentPane().add(btnNewButton_1_2_6);
		
		JButton btnTerminerLeTour = new JButton("Terminer le tour");
		btnTerminerLeTour.setBounds(526, 267, 136, 23);
		frame.getContentPane().add(btnTerminerLeTour);
		
		JButton btnPiocherUneCarte = new JButton("Piocher une carte");
		btnPiocherUneCarte.setBounds(526, 319, 136, 23);
		frame.getContentPane().add(btnPiocherUneCarte);
		
		
		txtJoueur = new JTextField();
		txtJoueur.setText(Joueurs.getNomPlayer1());
		txtJoueur.setBounds(526, 134, 96, 20);
		frame.getContentPane().add(txtJoueur);
		txtJoueur.setColumns(10);
		
		txtJoueur_1 = new JTextField();
		txtJoueur_1.setText(Joueurs.getNomPlayer2());
		txtJoueur_1.setColumns(10);
		txtJoueur_1.setBounds(526, 162, 96, 20);
		frame.getContentPane().add(txtJoueur_1);
		
		frame.setVisible(true);
		
        
	}
}
	
