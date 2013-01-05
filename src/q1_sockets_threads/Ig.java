package q1_sockets_threads;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Ig extends javax.swing.JFrame {
	private JPanel jPanel_Affichage;
	public static JLabel jLabel_Objet_Recu;
	public static JLabel jLabel_Etat_Client;
	private JLabel jLabel_Etat_Serveur;
	private JButton jButton_Demarrer_Serv;
	private JLabel jLabel_Objet;
	private JLabel jLabel_Client;
	private JLabel jLabel_Serveur;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public Ig() {
		super();
		initGUI();
	}

	public static void main(String[] args){
		Ig ig = new Ig();
		ig.setVisible(true);
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanel_Affichage = new JPanel();
				GridBagLayout jPanel_ContenuLayout = new GridBagLayout();
				jPanel_ContenuLayout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.0, 0.0, 0.1};
				jPanel_ContenuLayout.rowHeights = new int[] {7, 7, 7, 21, 26, 7};
				jPanel_ContenuLayout.columnWeights = new double[] {0.0, 0.1, 0.1, 0.1};
				jPanel_ContenuLayout.columnWidths = new int[] {116, 7, 7, 7};
				getContentPane().add(jPanel_Affichage, BorderLayout.NORTH);
				jPanel_Affichage.setLayout(jPanel_ContenuLayout);
				jPanel_Affichage.setPreferredSize(new java.awt.Dimension(384, 140));
				{
					jLabel_Serveur = new JLabel();
					jLabel_Serveur.setLayout(null);
					jPanel_Affichage.add(jLabel_Serveur, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Serveur.setText("Serveur : ");
					jLabel_Serveur.setPreferredSize(new java.awt.Dimension(256, 16));
				}
				{
					jLabel_Client = new JLabel();
					jPanel_Affichage.add(jLabel_Client, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Client.setPreferredSize(new java.awt.Dimension(384, 32));
					jLabel_Client.setText("Client : ");
				}
				{
					jLabel_Objet = new JLabel();
					jPanel_Affichage.add(jLabel_Objet, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Objet.setText("Objet Reçu : ");
				}
				{
					jButton_Demarrer_Serv = new JButton();
					jPanel_Affichage.add(jButton_Demarrer_Serv, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.VERTICAL, new Insets(0, 0, 0, 0), 0, 0));
					jButton_Demarrer_Serv.setText("Démarrer le serveur !");
					jButton_Demarrer_Serv.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							try {
								Serveur s = new Serveur();
								jLabel_Etat_Serveur.setText("Démarré");
								jLabel_Etat_Client.setText("En attente d'un client");
								jButton_Demarrer_Serv.setVisible(false);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
				}
				{
					jLabel_Etat_Serveur = new JLabel();
					jPanel_Affichage.add(jLabel_Etat_Serveur, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Etat_Serveur.setText("Arrêté");
				}
				{
					jLabel_Etat_Client = new JLabel();
					jPanel_Affichage.add(jLabel_Etat_Client, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Etat_Client.setText("Serveur arrêté");
				}
				{
					jLabel_Objet_Recu = new JLabel();
					jPanel_Affichage.add(jLabel_Objet_Recu, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
					jLabel_Objet_Recu.setText("Aucun ");
				}
			}
			pack();
			this.setSize(400, 177);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	

}
