package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import javax.swing.JToolBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class BotonesMensajes extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblMensaje;
	private JButton btnAgur;
	private JButton btnKaixo;
	private JButton btnHola;
	private JButton btnAdios;
	private JTextField txtTexto;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonesMensajes frame = new BotonesMensajes();
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
	public BotonesMensajes() {
		setTitle("Botones de Mensajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JCheckBoxMenuItem chckbxmntmAgur = new JCheckBoxMenuItem("Agur");
		chckbxmntmAgur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mnArchivo.add(chckbxmntmAgur);
		
		JCheckBoxMenuItem chckbxmntmKaixo = new JCheckBoxMenuItem("Kaixo");
		mnArchivo.add(chckbxmntmKaixo);
		
		JCheckBoxMenuItem chckbxmntmAdios = new JCheckBoxMenuItem("Adios");
		mnArchivo.add(chckbxmntmAdios);
		
		JCheckBoxMenuItem chckbxmntmHola = new JCheckBoxMenuItem("Hola");
		mnArchivo.add(chckbxmntmHola);
		JMenuItem mniNuevo = new JMenuItem("Nuevo");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);{
		};{

		};{
		};{
		};
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		txtTexto = new JTextField();
		txtTexto.setText("Anonimo");
		panelCentral.add(txtTexto, BorderLayout.NORTH);
		txtTexto.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		panelCentral.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnHola_2 = new JButton("Hola");
		btnHola_2.addActionListener(this); 
		panelBotones.add(btnHola_2);
		
		JButton btnAdios_2 = new JButton("Adios");
		btnAdios_2.addActionListener(this); 
		panelBotones.add(btnAdios_2);
		
		JButton btnKaixo_2 = new JButton("Kaixo");
		btnKaixo_2.addActionListener(this); 
		panelBotones.add(btnKaixo_2);
		
		JButton btnAgur_2 = new JButton("Agur");
		btnAgur_2.addActionListener(this); 
		panelBotones.add(btnAgur_2);
		
		lblMensaje = new JLabel("No Hay Mensaje");
		contentPane.add(lblMensaje, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String mensaje="";
		//cojo el texto del boton que se ha pulsado
		//obtengo el boton que ha sido pulsado
		Object o = ae.getSource();
		//obtengo el texto de ese boton y se lo doy a mensaje
		mensaje=((JButton)o).getText();
		//completo el mensaje con el texto
		mensaje=mensaje+" "+ txtTexto.getText();
		//muestro el mensaje en la etiqueta
		lblMensaje.setText(mensaje);
	}

}
