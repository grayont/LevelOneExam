import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class LevelOneExamGrant implements ActionListener {
	
	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton but = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	JButton but4 = new JButton();
	
	public static void main(String[] args) {
		
		LevelOneExamGrant g = new LevelOneExamGrant();
		g.run();
		
			
	}
	
	 void run() {
		
		
		
		frame.setVisible(true);
		but.setBackground(Color.yellow);
		but2.setBackground(Color.red);
		but3.setBackground(Color.blue);
		but4.setBackground(Color.green);
		but.setOpaque(true);
		but2.setOpaque(true);
		but3.setOpaque(true);
		but4.setOpaque(true);
		but.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		
		frame.add(panel);
		panel.add(but);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		frame.pack();
		
	}
	
	
	
	
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == but) {
			speak("Yellow");
		}
		else if(e.getSource() == but2) {
			speak("Red");
		}
		else if(e.getSource() == but3) {
			speak("Blue");
		}
		else {
			speak("Green");
		}
	}

}
