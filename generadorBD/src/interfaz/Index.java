package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;

import java.awt.Font;
import java.awt.Choice;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import conexionBD.GestionBD;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JComboBox;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JProgressBar;
import javax.swing.JLayeredPane;

public class Index {

	private JFrame frmGenerateDataBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frmGenerateDataBase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGenerateDataBase = new JFrame();
		frmGenerateDataBase.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				llenarcomboRegion();
				llenarcombos();
				
			}
		});
		frmGenerateDataBase.setTitle("Generate Data Base Files");
		frmGenerateDataBase.getContentPane().setBackground(new Color(245, 255, 250));
		frmGenerateDataBase.setBounds(100, 100, 863, 552);
		frmGenerateDataBase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGenerateDataBase.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 841, 496);
		frmGenerateDataBase.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GENERATE DATA BASE FILES");
		lblNewLabel.setBounds(10, 10, 273, 50);
		panel.add(lblNewLabel);
		
		JLabel lblConjutno = new JLabel("Conjunto");
		lblConjutno.setBounds(10, 49, 200, 50);
		panel.add(lblConjutno);
		
		textField = new JTextField();
		textField.setBounds(122, 61, 182, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n");
		lblRegion.setBounds(10, 115, 200, 50);
		panel.add(lblRegion);
		
		Label label = new Label("Nombre de la columna");
		label.setBounds(10, 199, 162, 27);
		panel.add(label);
		
		Label label_1 = new Label("Tipo de dato");
		label_1.setBounds(198, 199, 102, 27);
		panel.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(10, 244, 133, 27);
		panel.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(10, 290, 133, 27);
		panel.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(10, 330, 133, 27);
		panel.add(textField_3);
		
		Button btnAgregar = new Button("Agergar Columna");
		btnAgregar.setBounds(26, 395, 132, 27);
		panel.add(btnAgregar);
		
		Button btnCSV = new Button("Crear CSV");
		btnCSV.setBounds(26, 459, 91, 27);
		panel.add(btnCSV);
		
		Button button = new Button("Crear SQL");
		button.setBounds(213, 459, 91, 27);
		panel.add(button); cmbRegion = new JComboBox();
		cmbRegion.setBounds(122, 127, 182, 26);
		panel.add(cmbRegion);
		
		JComboBox cmbItem1 = new JComboBox();
		cmbItem1.setBounds(176, 245, 146, 26);
		panel.add(cmbItem1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(362, 466, 146, 14);
		panel.add(progressBar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(176, 291, 146, 26);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(176, 331, 146, 26);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ejemplo");
		lblNewLabel_1.setBounds(348, 244, 265, 27);
		panel.add(lblNewLabel_1);
	}
	
	protected void llenarcombos() {
		// TODO Auto-generated method stub
		
		
	}
	private JComboBox cmbRegion;
	
	GestionBD objCombo=new GestionBD();
	
		protected void llenarcomboRegion() {
			String consultaBD="SELECT zona_geo FROM zona";
			ResultSet cdr=objCombo.ejecutarConsulta(consultaBD);
			try {
				while(cdr.next()){
					cmbRegion.addItem(cdr.getString(1));
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// TODO Auto-generated method stub
		
	}

	
		private JTextField textField;
}
