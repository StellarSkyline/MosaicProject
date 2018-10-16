//Seth Torralba
//Main Class Mosaic Project

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


class MosaicFrame extends JFrame {
	public MosaicFrame() {
		super("Mosaic Application");
		setBounds(200,200, 800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Create layout objects
		Container contentPane = new Container();
		JButton randomBtn = new JButton("Random");
		JPanel gridPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		btnPanel.add(randomBtn);
		contentPane.setLayout(new BorderLayout());
		gridPanel.setLayout(new GridLayout(12,12));
		
		//Place objects in content panels
		contentPane.add(btnPanel, BorderLayout.SOUTH);
		contentPane.add(gridPanel, BorderLayout.CENTER);
	}
}

public class Mosaic {

	public static void main(String[] args) {
		MosaicFrame myProgram = new MosaicFrame();
		myProgram.setVisible(true);
	}

}
