package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblProdajniKurs;
	private JLabel lblValuta;
	private JLabel lblKupovniKurs;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		initGUI();
	}
	private void initGUI() {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		setLocationRelativeTo(null);
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(31, 23, 85, 16);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(199, 23, 56, 16);
		}
		return lblValuta;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(321, 23, 85, 16);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setBounds(22, 52, 116, 22);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setBounds(316, 52, 116, 22);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR ", "CHF", "USD"}));
			comboBox.setBounds(199, 52, 56, 22);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(32, 98, 56, 16);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(31, 139, 116, 22);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(281, 98, 101, 16);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(281, 123, 127, 25);
			rdbtnKupovina.setSelected(true);
			buttonGroup.add(rdbtnKupovina);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(281, 153, 127, 25);
			buttonGroup.add(rdbtnProdaja);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					int iznos = slider.getValue();
					getTextFieldIznos().setText(iznos + "");
				}
			});
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setBounds(54, 187, 328, 45);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String operacija = "";
					if(rdbtnKupovina.isSelected()){
						operacija = "Kupovina";
					}else{
						operacija = "Prodaja";
					}
					GUIKontroler.textMenjacnica("Izvrsena zamena \nValuta: " + comboBox.getSelectedItem().toString() +
												   ", Iznos: " + textFieldIznos.getText() +
												   ", Vrsta transakcija: " + operacija);
				
				}
			});
			btnIzvrsiZamenu.setBounds(31, 240, 116, 25);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.zatvoriZamenu();
				}
			});
			btnOdustani.setBounds(293, 240, 97, 25);
		}
		return btnOdustani;
	}
}
