package FrameL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame2 extends JFrame{

	Frame2()
	{
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Frame 2");
		
		JButton b = new JButton("<");
		b.setBounds(10,10,90,40);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new Frame1().setVisible(true);
			}
			
		});
		
		add(b);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new Frame2();
				
			}
			
		});

	}

}
