package controller;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadSapos extends Thread {


	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	
	private JButton btnIniciar;
	
	private JLabel puloSapo1;
	private JLabel puloSapo2;
	private JLabel puloSapo3;
	private JLabel puloSapo4;
	private JLabel puloSapo5;
	

	
	public ThreadSapos( JLabel lblNewLabel_1, JLabel lblNewLabel_2, JLabel lblNewLabel_3,
						JLabel lblNewLabel_4, JLabel lblNewLabel_5, JButton btnIniciar1, JLabel puloSapo1,JLabel puloSapo2,
						JLabel puloSapo3,JLabel puloSapo4,
						JLabel puloSapo5) {

		this.lblNewLabel_1 = lblNewLabel_1;
		this.lblNewLabel_2 = lblNewLabel_2;
		this.lblNewLabel_3 = lblNewLabel_3;
		this.lblNewLabel_4 = lblNewLabel_4;
		this.lblNewLabel_5 = lblNewLabel_5;
		
		this.btnIniciar = btnIniciar;
		
		this.puloSapo1 = puloSapo1;
		this.puloSapo2 = puloSapo2;
		this.puloSapo3 = puloSapo3;
		this.puloSapo4 = puloSapo4;
		this.puloSapo5 = puloSapo5;
	


	}
	
	@Override
	public void run() {
		iniciaCorrida();
	}

	public void iniciaCorrida() {
		
		Rectangle posicao1;
		Rectangle posicao2;
		Rectangle posicao3;
		Rectangle posicao4;
		Rectangle posicao5;

		posicao1 = lblNewLabel_1.getBounds();
		lblNewLabel_1.setBounds(posicao1);

		posicao2 = lblNewLabel_2.getBounds();
		lblNewLabel_2.setBounds(posicao2);

		posicao3 = lblNewLabel_3.getBounds();
		lblNewLabel_3.setBounds(posicao3);

		posicao4 = lblNewLabel_4.getBounds();
		lblNewLabel_4.setBounds(posicao4);

		posicao5 = lblNewLabel_5.getBounds();
		lblNewLabel_5.setBounds(posicao5);
		
		int distMaxima = 30;
		int contaDistancia = 0;
		int puloMaximo = 20;

		posicao1.x = 0;
		posicao2.x = 0;
		posicao3.x = 0;
		posicao4.x = 0;
		posicao5.x = 0;
		
		lblNewLabel_1.setBounds(posicao1);
		lblNewLabel_2.setBounds(posicao2);
		lblNewLabel_3.setBounds(posicao3);
		lblNewLabel_4.setBounds(posicao4);
		lblNewLabel_5.setBounds(posicao5);

		while (contaDistancia < distMaxima) {
			
			int aleat =  (int) (Math.random() * puloMaximo);
			System.out.println("Salto Sapinho 1: " + aleat);
			posicao1.x = posicao1.x + aleat;
			
			aleat =  (int) (Math.random() * puloMaximo);
			System.out.println("Salto Sapinho 2: " + aleat);
			posicao2.x = posicao2.x + aleat;

			aleat =  (int) (Math.random() * puloMaximo);
			System.out.println("Salto Sapinho 3: " + aleat);
			posicao3.x = posicao3.x + aleat;

			aleat =  (int) (Math.random() * puloMaximo);
			System.out.println("Salto Sapinho 4: " + aleat);
			posicao4.x = posicao4.x + aleat;

			aleat =  (int) (Math.random() * puloMaximo);
			System.out.println("Salto Sapinho 5: " + aleat);
			posicao5.x = posicao5.x + aleat;

			
			puloSapo1.setText(String.valueOf(posicao1.x));
			puloSapo2.setText(String.valueOf(posicao2.x));
			puloSapo3.setText(String.valueOf(posicao3.x));
			puloSapo4.setText(String.valueOf(posicao4.x));
			puloSapo5.setText(String.valueOf(posicao5.x));
			
			lblNewLabel_1.setBounds(posicao1);
			lblNewLabel_2.setBounds(posicao2);
			lblNewLabel_3.setBounds(posicao3);
			lblNewLabel_4.setBounds(posicao4);
			lblNewLabel_5.setBounds(posicao5);
			

			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			contaDistancia++;
			
			
		}

		
		
	}
}