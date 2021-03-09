package view;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.SapoController;
import controller.ThreadSapos;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

	/**
	 * Criação do Frame
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);

		Icon icon = new ImageIcon(
				"C:\\Users\\danil\\eclipse-workspace\\prjExercicio_04_Thread_Corrida_Sapo\\src\\view\\sapinho.png");
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel(icon);
		lblNewLabel_1.setText("1");
		lblNewLabel_1.setBounds(24, 42, 87, 50);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(icon);
		lblNewLabel_2.setText("2");
		lblNewLabel_2.setBounds(24, 99, 87, 50);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(icon);
		lblNewLabel_3.setText("3");
		lblNewLabel_3.setBounds(24, 162, 87, 50);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(icon);
		lblNewLabel_4.setText("4");
		lblNewLabel_4.setBounds(24, 218, 87, 50);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel(icon);
		lblNewLabel_5.setText("5");
		lblNewLabel_5.setBounds(24, 282, 87, 50);
		contentPane.add(lblNewLabel_5);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(256, 350, 95, 28);
		contentPane.add(btnIniciar);
		
		
		JLabel puloSapo1 = new JLabel();
		puloSapo1.setBounds(580, 11, 56, 14);
		contentPane.add(puloSapo1);

		JLabel puloSapo2 = new JLabel();
		puloSapo2.setBounds(580, 39, 56, 14);
		contentPane.add(puloSapo2);

		JLabel puloSapo3 = new JLabel();
		puloSapo3.setBounds(580, 64, 56, 14);
		contentPane.add(puloSapo3);

		JLabel puloSapo4 = new JLabel();
		puloSapo4.setBounds(580, 89, 56, 14);
		contentPane.add(puloSapo4);

		JLabel puloSapo5 = new JLabel();
		puloSapo5.setBounds(580, 113, 56, 14);
		contentPane.add(puloSapo5);
		
		

		JLabel distancia1 = new JLabel("Sapinho 1 percorreu:         metros.");
		distancia1.setBounds(456, 11, 200, 14);
		contentPane.add(distancia1);

		JLabel distancia2 = new JLabel("Sapinho 2 percorreu:         metros.");
		distancia2.setBounds(456, 39, 200, 14);
		contentPane.add(distancia2);

		JLabel distancia3 = new JLabel("Sapinho 3 percorreu:         metros.");
		distancia3.setBounds(456, 64, 200, 14);
		contentPane.add(distancia3);

		JLabel distancia4 = new JLabel("Sapinho 4 percorreu:         metros.");
		distancia4.setBounds(456, 89, 200, 14);
		contentPane.add(distancia4);

		JLabel distancia5 = new JLabel("Sapinho 5 percorreu:         metros.");
		distancia5.setBounds(456, 110, 200, 14);
		contentPane.add(distancia5);
			
		
		
		SapoController sapocontroller = new SapoController(lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5,
		btnIniciar,puloSapo1,puloSapo2,puloSapo3,puloSapo4,puloSapo5);
		btnIniciar.addActionListener(sapocontroller);

		
	}
}