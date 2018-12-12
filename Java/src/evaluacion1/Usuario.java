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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Usuario extends JFrame implements ActionListener {

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
					Usuario frame = new Usuario();
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
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblUsuario = new JLabel("Usuario");
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			txtUsuario.select(0, txtUsuario.getText().length());	
			}
			@Override
			public void focusLost(FocusEvent e) {
			txtUsuario.select(0, 0);}
		});
		txtUsuario.addActionListener(this);
		txtUsuario.setText("Usuario");
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		panel.add(lblContrasea);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pwdContrasea.setSelectionStart(0);
				String contrasea = new String(pwdContrasea.getPassword()); 
				pwdContrasea.setSelectionEnd(contrasea.length());
				}
			@Override
			public void focusLost(FocusEvent e) {
				pwdContrasea.select(0, 0);
				}
		});
		pwdContrasea.setText("Contrasena");
		panel.add(pwdContrasea);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		
		panel.add(btnOk);
		
		lblTexto = new JLabel("Anonimo");
		contentPane.add(lblTexto, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
			//Acciones a realizar al pulsar el boton
			//compruebo el usuario y la pcontraseña
			String usuario=txtUsuario.getText();
			String contrasea=new String(pwdContrasea.getPassword());
			String mensaje;
			mensaje="";
			if(usuario.equals("1dw3") && contrasea.equals("1dw3")){
				//si los datos coinciden:
				//creo una nueva ventana
				VentanaHola vh = new VentanaHola();
				// le cambio el Title
				vh.setTitle("Bienvenido "+txtUsuario.getText());
				// la muestro
				vh.setVisible(true);
				// oculto la ventana de inicio
				// 
				this.setVisible(false);
				//borro de memoriala ventana de inicio
				this.dispose();
			}
			else {
				//si los datos no coinciden 
				mensaje="Datos Incorrectos";
			}
			lblTexto.setText(mensaje); 
	}

}
