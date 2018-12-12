package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentajaAccionLIstenercomun extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdContrasea;
	private JLabel lblTexto;
	private JLabel lblContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentajaAccionLIstenercomun frame = new VentajaAccionLIstenercomun();
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
	public VentajaAccionLIstenercomun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.addActionListener(this);
		txtUsuario.setText("");
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblContrasea);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		panel.add(pwdContrasea);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOk.addActionListener(this);
		
		panel.add(btnOk);
		
		lblTexto = new JLabel("Anonimo");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			//Acciones a realizar al pulsar el boton
			//compruebo el usuario y la pcontraseña
			String usuario=txtUsuario.getText();
			String contrasea=new String(pwdContrasea.getPassword());
			String mensaje;
			if(usuario.equals("1dw3")&& contrasea.equals("1dw3")){
				//si los datos coinciden:
				mensaje="Bienvenido"+ txtUsuario.getText();
			}
			else {
				//si los datos no coinciden 
				mensaje="Datos Incorrectos";
			}
			lblTexto.setText(mensaje); 
	}

}
