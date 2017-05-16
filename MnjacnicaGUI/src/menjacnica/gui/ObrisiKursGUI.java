package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldPK;
	private JTextField textFieldKK;
	private JTextField textFieldSK;
	private JTextField textFieldSNaziv;
	private JCheckBox chckbxZaistaObrisi;
	private JButton btnObrisi;
	private JButton btnOdustani;

	

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI() {
		initGUI();
	}
	private void initGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldPK());
		contentPane.add(getTextFieldKK());
		contentPane.add(getTextFieldSK());
		contentPane.add(getTextFieldSNaziv());
		contentPane.add(getChckbxZaistaObrisi());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		setLocationRelativeTo(null);
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(48, 23, 56, 16);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(251, 23, 56, 16);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(48, 83, 89, 16);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(251, 83, 81, 16);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(48, 145, 75, 16);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(251, 145, 102, 16);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEnabled(false);
			textFieldSifra.setBounds(48, 48, 116, 22);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setEnabled(false);
			textFieldNaziv.setBounds(251, 48, 116, 22);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldPK() {
		if (textFieldPK == null) {
			textFieldPK = new JTextField();
			textFieldPK.setEnabled(false);
			textFieldPK.setBounds(48, 108, 116, 22);
			textFieldPK.setColumns(10);
		}
		return textFieldPK;
	}
	private JTextField getTextFieldKK() {
		if (textFieldKK == null) {
			textFieldKK = new JTextField();
			textFieldKK.setEnabled(false);
			textFieldKK.setBounds(251, 108, 116, 22);
			textFieldKK.setColumns(10);
		}
		return textFieldKK;
	}
	private JTextField getTextFieldSK() {
		if (textFieldSK == null) {
			textFieldSK = new JTextField();
			textFieldSK.setEnabled(false);
			textFieldSK.setBounds(48, 174, 116, 22);
			textFieldSK.setColumns(10);
		}
		return textFieldSK;
	}
	private JTextField getTextFieldSNaziv() {
		if (textFieldSNaziv == null) {
			textFieldSNaziv = new JTextField();
			textFieldSNaziv.setEnabled(false);
			textFieldSNaziv.setBounds(251, 174, 116, 22);
			textFieldSNaziv.setColumns(10);
		}
		return textFieldSNaziv;
	}
	private JCheckBox getChckbxZaistaObrisi() {
		if (chckbxZaistaObrisi == null) {
			chckbxZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.omoguciDugme(btnObrisi);
				}
			});
			chckbxZaistaObrisi.setBounds(48, 196, 136, 25);
		}
		return chckbxZaistaObrisi;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setEnabled(false);
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.textMenjacnica("Obrisan kurs : \n Sifra: " + getTextFieldSifra().getText() + ", Naziv: " + getTextFieldNaziv().getText() + 
							", Prodajni kurs: " + getTextFieldPK().getText() + 
							", Kupovni kurs: " + getTextFieldKK().getText() + 
							", Srednji kurs: " + getTextFieldSK().getText() + 
							", Skraceni Naziv: " + getTextFieldSNaziv().getText());
				}
			});
			btnObrisi.setBounds(48, 230, 97, 25);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriObrisiKurs();
				}
			});
			btnOdustani.setBounds(251, 230, 97, 25);
		}
		return btnOdustani;
	}
}
