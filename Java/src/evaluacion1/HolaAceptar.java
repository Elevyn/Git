package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HolaAceptar extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar;
	private JLabel lblMensaje;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaAceptar frame = new HolaAceptar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public HolaAceptar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lblMensaje.setText("Has Pulsado Aceptar");
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnAceptar.setBounds(143, 184, 137, 50);
		contentPane.add(btnAceptar);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setBounds(78, 46, 244, 50);
		contentPane.add(lblMensaje);
	}
}
