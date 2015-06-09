package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class DocumentFrame extends JInternalFrame{
	
    //broj otvorenih unutrasnjih prozora
	static int openFrameCount = 0;
	
	// sluze nam za odredjivanje pozicije unutrasnjeg prozora
	static final int xOffset = 30, yOffset = 30;

	
	public DocumentFrame() {
		super("New Document " + (++openFrameCount),
		          true, //resizable
		          true, //closable
		          true, //maximizable
		          true);//iconifiable
		
		//obavezno je postavljanje dimenzija unutrasnjeg prozora
		setSize(400,400);
		//pozeljno je odredjivanje lokacije, na ovaj nacin novi prozor se otvara "smaknut u odnosu na prethodni"
		setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
    	//obavezno je prozor uciniti vidljivim
		setVisible(true);


	
	}
	



}