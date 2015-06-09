package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.event.InternalFrameEvent;

import com.sun.prism.Image;


public class MainFrame extends JFrame{

	private static JDesktopPane desktop;
	private static MainFrame instance=null;
	
	
	private MainFrame() {
		initialise();
		
    }
	
	
	
	public static MainFrame getInstance(){
		  if (instance==null)
			  instance=new MainFrame();
		  return instance;
		  
	}

	public void initialise(){
	    
		
        //kreiramo instancu JDesktopPane u koju cemo stavljati unutrasnje prozore
        desktop = new JDesktopPane(); 
        //podesavamo drag mode da ne bi bio spor u slucaju velikog broja unutrasnjih prozora
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
       
       // setContentPane(desktop);
        add(desktop, BorderLayout.CENTER);
        
        ////// PRVI NACIN ZA SLIKU U POZADINI
        //JLabel background=new JLabel(new ImageIcon("images/aureus_logo_64x64.png"));
	    //add(background);

        
        
		setSize(1280,720);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Aureus 0.1");
		
		ImageIcon img = new ImageIcon("images/aureus_logo_16x16.png");
		setIconImage(img.getImage());
		
	    Menu menu=new Menu();
	    setJMenuBar(menu);
	    

	    
	  //kreiramo instancu klase Toolbar
        Toolbar toolbar=new Toolbar();
        //dodajemo u Frame nas Toolbar, klasa BorderLayout se odnosi na rad sa prostorim rasporedom
        //komponenti, za sada je dovoljno znati da na ovaj nacin Toolbar se postavlja na vrh glavne forme
        add(toolbar, BorderLayout.NORTH);
        
        ToolbarDown toolbarDown=new ToolbarDown();
        add(toolbarDown, BorderLayout.EAST);
	    
	    
        //LOOK AND FEEL
		/*
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
        */
        ////// DRUGI NACIN ZA SLIKU U POZADINI
        /*JPanel bgPanel = new JPanel();
        
        JLabel background=new JLabel(new ImageIcon("images/aureus_logo_64x64.png"));
        bgPanel.setBounds(0,0,500,500); 
        bgPanel.add(background);
        add(bgPanel);*/
        
		
		 JPanel mainPanel = new JPanel();
		  //mainPanel.setLayout(new GridLayout(1, 5));
		  getContentPane().add(mainPanel, BorderLayout.SOUTH);
		  mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		  //mainPanel.setPreferredSize(new Dimension(desktop.getWidth(), 18));
		  mainPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));

		  JPanel statusPanel1 = new JPanel();
		  JPanel statusPanel2 = new JPanel();
		  JPanel statusPanel3 = new JPanel();
		  JPanel statusPanel4 = new JPanel();
		  JPanel statusPanel5 = new JPanel();
		  
		  JLabel statusLabel1 = new JLabel("status 1");
		  statusLabel1.setHorizontalAlignment(SwingConstants.LEFT);
		  statusPanel1.add(statusLabel1);
			
		  JLabel statusLabel2 = new JLabel("status 2");
		  statusLabel2.setHorizontalAlignment(SwingConstants.LEFT);
		  statusPanel2.add(statusLabel2);
		  
		  JLabel statusLabel3 = new JLabel("status 3");
		  statusLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		  statusPanel3.add(statusLabel3);
		  
		  JLabel statusLabel4 = new JLabel("status 4");
		  statusLabel4.setHorizontalAlignment(SwingConstants.LEFT);
		  statusPanel4.add(statusLabel4);
		  
		  JLabel statusLabel5 = new JLabel("status 5");
		  statusLabel5.setHorizontalAlignment(SwingConstants.LEFT);
		  statusPanel5.add(statusLabel5);

		  mainPanel.add(statusPanel1);
		  mainPanel.add(statusPanel2);
		  mainPanel.add(statusPanel3);
		  mainPanel.add(statusPanel4);
		  mainPanel.add(statusPanel5);
		  
	}
	
	
	public void createDiagram(){
		DocumentFrame df=new DocumentFrame();
		
		desktop.add(df);
			
		df.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		df.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
		
		public void internalFrameClosing(InternalFrameEvent e) {
			int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Close?",  JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION)
			{
				df.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		      }
		});
		
		try {
			//ovo se radi da bi se novokreirani unutrasnji prozor pojavio iznad svih ostalih unutrasnjih prozora
			//isti efekat bi se postigao i sa metodom moveToFront();
			df.setSelected(true);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
	public JDesktopPane getDesktop(){
		return desktop;
	}
	
	public void tileWindowsVertically() {
		
		
		int k = 0;
		
		if (MainFrame.getInstance().getDesktop().getAllFrames().length == 0)
			return;
		
		int rows = (int) Math.ceil(MainFrame.getInstance().getDesktop().getAllFrames().length / Math.floor(Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length)));
		int columns = (int) Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length);
		
		
		int x = (int) MainFrame.getInstance().getDesktop().getSize().getWidth() / rows;
		int y = (int) MainFrame.getInstance().getDesktop().getSize().getHeight() / columns;
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				if (k < MainFrame.getInstance().getDesktop().getAllFrames().length) {
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setLocation(x * i, y * j);
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setSize(x, y);
					k++;
				}
			}
	}
	
	public void tileWindowsHorizontally() {
		
		
		int k = 0;
		
		if (MainFrame.getInstance().getDesktop().getAllFrames().length == 0)
			return;
		
		int rows = (int) Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length);
		int columns = (int) Math.ceil(MainFrame.getInstance().getDesktop().getAllFrames().length / Math.floor(Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length)));
		
		int x = (int) MainFrame.getInstance().getDesktop().getSize().getWidth() / rows;
		int y = (int) MainFrame.getInstance().getDesktop().getSize().getHeight() / columns;
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				if (k < MainFrame.getInstance().getDesktop().getAllFrames().length) {
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setLocation(x * i, y * j);
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setSize(x, y);
					k++;
				}
			}
	}
	
	public void cascadeWindows() {
		
		
		if (MainFrame.getInstance().getDesktop().getAllFrames().length == 0)
			return;
		
		int i;
		JInternalFrame[] pom = new JInternalFrame[MainFrame.getInstance().getDesktop().getAllFrames().length];
		
		for (i = 0; i < pom.length; i++) {
			pom[i] = MainFrame.getInstance().getDesktop().getAllFrames()[i];
		}
		
		for (i = pom.length - 1; i >= 0; i--) {
			pom[i].setLocation((pom.length - i - 1) * 30, (pom.length - i - 1) * 30);
			pom[i].setSize((int) MainFrame.getInstance().getDesktop().getSize().getWidth(), 400);

		}


	}
	
	
}