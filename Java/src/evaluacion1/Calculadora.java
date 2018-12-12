package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblmensaje;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnexit;
	private JButton btnce;
	private JButton btnigual;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/iconos/acercade.gif")));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmensaje = new JLabel("0");
		lblmensaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lblmensaje.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblmensaje.setBackground(Color.LIGHT_GRAY);
		lblmensaje.setBounds(10, 5, 255, 65);
		contentPane.add(lblmensaje);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 87, 351, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.addActionListener(this);
		btn1.setBounds(10, 10, 76, 56);
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.addActionListener(this);
		btn2.setBounds(96, 10, 76, 56);
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.addActionListener(this);
		btn3.setBounds(182, 10, 76, 56);
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.addActionListener(this);
		btn4.setBounds(10, 76, 76, 56);
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.addActionListener(this);
		btn5.setBounds(96, 76, 76, 56);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.addActionListener(this);
		btn6.setBounds(182, 76, 76, 56);
		panel.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.addActionListener(this);
		btn7.setBounds(10, 142, 76, 56);
		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.addActionListener(this);
		btn8.setBounds(96, 142, 76, 56);
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.addActionListener(this);
		btn9.setBounds(182, 142, 76, 56);
		panel.add(btn9);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.addActionListener(this);
		btn0.setBounds(96, 206, 76, 56);
		panel.add(btn0);
		
		JButton btnpunto = new JButton(".");
		btnpunto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnpunto.setBounds(10, 208, 76, 56);
		panel.add(btnpunto);
		
		JButton btnsuma = new JButton("+");
		btnsuma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnsuma.setBounds(268, 10, 76, 56);
		panel.add(btnsuma);
		
		JButton btnresta = new JButton("-");
		btnresta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnresta.setBounds(268, 76, 76, 56);
		panel.add(btnresta);
		
		JButton btndivision = new JButton("/");
		btndivision.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btndivision.setBounds(268, 142, 76, 56);
		panel.add(btndivision);
		
		JButton btnmultiplicacion = new JButton("x");
		btnmultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnmultiplicacion.setBounds(268, 206, 76, 56);
		panel.add(btnmultiplicacion);
		
		btnce = new JButton("CE");
		btnce.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnce.setBounds(182, 206, 76, 56);
		panel.add(btnce);
		
		btnexit = new JButton("EXIT");
		btnexit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnexit.setBounds(280, 13, 69, 29);
		contentPane.add(btnexit);
		
		btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnigual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnigual.setBounds(280, 52, 69, 29);
		contentPane.add(btnigual);
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		double a;
		String resultado="";
		Object o = ae.getSource();
		a=((JButton)o).getText();
		resultado=a + JButton.getText();
		lblmensaje.setText(resultado);
	}
}
