package Astar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gui implements ActionListener{
	 GridBagLayout gridBag = new GridBagLayout ();
	 GridBagConstraints gbc = new GridBagConstraints ();
	 Frame frame = new Frame("Astar");
	 TextArea text = new TextArea(1,10);
	 TextField field1 = new TextField("0",1);
	 TextField field2 = new TextField("0",1);
	 int x=0,y=0;
	public  void add_text(int x,int y){
		text.append(x + " " + y + "\n");
	}
	public void actionPerformed(ActionEvent e){
		Object sursa = e.getSource();
		if (sursa instanceof TextField) {
			TextField tf = (TextField) sursa;
			if (tf == field1) {
				text.setText("");
				x = Integer.parseInt(tf.getText());
				Main.construct(x, y);
			}
			if(tf == field2) {
				text.setText("");
				y = Integer.parseInt(tf.getText());
				Main.construct(x, y);
			}
		}
	}
	public  void init(){
		gbc . weightx = 100;
		gbc . weighty = 100;
		gbc . insets = new Insets (5, 5, 5, 5);
		frame.setLayout(gridBag);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		text.setEditable(false);
		gbc . gridx = 2;
		gbc . gridy = 0;
		gbc . gridwidth = 1;
		gbc . gridheight = 1;
		gbc . fill = GridBagConstraints . VERTICAL ;
		gbc . anchor = GridBagConstraints . EAST ;
		gridBag.setConstraints (text,gbc);
	
		gbc . fill = GridBagConstraints . NONE ;
		gbc . anchor = GridBagConstraints . SOUTH ;
		gbc . gridx = 0;
		gbc . gridy = 0;
		gridBag.setConstraints (field1,gbc);
		gbc . gridx = 1;
		gbc . gridy = 0;
		gridBag.setConstraints (field2,gbc);
		frame.add(text);
		frame.add(field1);
		frame.add(field2);
		field1.addActionListener(this);
		field2.addActionListener(this);
		frame.addWindowListener(new WindowAdapter(){
      	  public void windowClosing(WindowEvent we){
      		  System.exit(0);
      	  }
      	  });
}
	
}