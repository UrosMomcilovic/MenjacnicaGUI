package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIKontroler {
	
	private static MenjacnicaGUI menjacnica;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new MenjacnicaGUI();
					menjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String putanja(){
		JFileChooser fc = new JFileChooser();
		int retrunValue = fc.showOpenDialog(menjacnica.getContentPane());
		
		if(retrunValue == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
			return f.getAbsolutePath();
		}
		return "";
	}
	
	public static String sacuvaj(){
		JFileChooser fc = new JFileChooser();
		int retrunValue = fc.showSaveDialog(menjacnica.getContentPane());

		if(retrunValue == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
			return f.getAbsolutePath();
		}
		return "";
	}
	
	public static void upisi(String s, Object o){
		if(o instanceof JTextArea){
			((JTextArea)o).setText(((JTextArea)o).getText() + "\n" + s);
		}
		if (o instanceof JTextField) {
			((JTextField) o).setText(((JTextField) o).getText() + "\n" + s);
		}
	}
	
	public static void izlaz(){
		int jop = JOptionPane.showConfirmDialog(menjacnica.getContentPane(), 
				"Da li zelite da izadjete iz programa", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
	
		if(jop == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	public static void about(){
		JOptionPane.showMessageDialog(menjacnica, 
				"Autor : Uros Momcilovic" + "\n" + 
		"Fakulteta Organizacionih nauka." + "\n" + 
		"broj indeksa: 1030/16");
	}
	
}
