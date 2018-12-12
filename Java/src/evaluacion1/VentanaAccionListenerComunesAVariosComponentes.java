package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class VentanaAccionListenerComunesAVariosComponentes extends JFrame implements ActionListener {


	private JPanel contentPane;
	private JLabel lblMensaje;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAccionListenerComunesAVariosComponentes frame = new VentanaAccionListenerComunesAVariosComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanaAccionListenerComunesAVariosComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		boton1 = new JButton("1");
		boton1.addActionListener(this);
		panel.add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(this);
		panel.add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(this);
		panel.add(boton3);
		
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//obtengo sobre
		
		Object o=ae.getSource();
		String mensaje="";
		
		if(o==boton1) 		 {mensaje="Se ha pulsado el 1";}
		else if(o==boton2) {mensaje="Se ha pulsado el 2";}
		else if(o==boton3) {mensaje="Se ha pulsado el 3";}
		lblMensaje.setText(mensaje);
		}
   
	}


