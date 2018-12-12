package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mostrarnumero extends JFrame {

	private JPanel contentPane;
	private JTextField textMensaje;
	private JLabel lblMensaje;
	private JLabel lblNumero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrarnumero frame = new Mostrarnumero();
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
	public Mostrarnumero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblNumero);
		
		textMensaje = new JTextField();
		textMensaje.setHorizontalAlignment(SwingConstants.RIGHT);
		textMensaje.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textMensaje.setText("0");
		panel.add(textMensaje);
		textMensaje.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			lblMensaje.setText(textMensaje.getText());
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(btnOk);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
	}

}
