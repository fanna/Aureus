package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;


public class Toolbar extends JToolBar{
	
	public Toolbar(){
		//u konstruktor nadklase, tj klse JToolbar prosledjuje
		//se orijentacija toolbar-a, moguca i sa konstantom: SwingConstants.VERTICAL
		
		super(SwingConstants.HORIZONTAL);
		
		JButton btnProject = new JButton();
		btnProject.setToolTipText("New Document");
		btnProject.setIcon(new ImageIcon("images/toolbar/24x24/document.png"));
		add(btnProject);

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Open");
		btnOpen.setIcon(new ImageIcon("images/toolbar/24x24/folder.png"));
		add(btnOpen);

		JButton btnSave = new JButton();
		btnSave.setToolTipText("Save");
		btnSave.setIcon(new ImageIcon("images/toolbar/24x24/save.png"));
		add(btnSave);
	
		addSeparator();
		
		JButton btnImport = new JButton();
		btnImport.setToolTipText("Import");
		btnImport.setIcon(new ImageIcon("images/toolbar/24x24/inbox.png"));
		add(btnImport);

		JButton btnExport = new JButton();
		btnExport.setToolTipText("Export");
		btnExport.setIcon(new ImageIcon("images/toolbar/24x24/outbox.png"));
		add(btnExport);
	
		addSeparator();
		
		JButton btnUndo = new JButton();
		btnUndo.setToolTipText("Undo");
		btnUndo.setIcon(new ImageIcon("images/toolbar/24x24/video_previous.png"));
		add(btnUndo);
	
		JButton btnRedo = new JButton();
		btnRedo.setToolTipText("Redo");
		btnRedo.setIcon(new ImageIcon("images/toolbar/24x24/video_next.png"));
		add(btnRedo);		
		
		addSeparator();
		
		JButton btnCut = new JButton();
		btnCut.setToolTipText("Cut");
		btnCut.setIcon(new ImageIcon("images/toolbar/24x24/cut.png"));
		add(btnCut);
		
		JButton btnCopy = new JButton();
		btnCopy.setToolTipText("Copy");
		btnCopy.setIcon(new ImageIcon("images/toolbar/24x24/copy.png"));
		add(btnCopy);
		
		JButton btnPaste = new JButton();
		btnPaste.setToolTipText("Paste");
		btnPaste.setIcon(new ImageIcon("images/toolbar/24x24/document_empty.png"));
		add(btnPaste);
		
		addSeparator();
		
		JButton btnRotatel = new JButton();
		btnRotatel.setToolTipText("Rotate Left");
		btnRotatel.setIcon(new ImageIcon("images/toolbar/24x24/arrow_circle_left.png"));
		add(btnRotatel);
		
		JButton btnRotater = new JButton();
		btnRotater.setToolTipText("Rotate Right");
		btnRotater.setIcon(new ImageIcon("images/toolbar/24x24/arrow_circle_right.png"));
		add(btnRotater);
		
		addSeparator();
		
		JButton btnRename = new JButton();
		btnRename.setToolTipText("Rename");
		btnRename.setIcon(new ImageIcon("images/toolbar/24x24/font_p.png"));
		add(btnRename);
		
		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Delete");
		btnDelete.setIcon(new ImageIcon("images/toolbar/24x24/delete.png"));
		add(btnDelete);
		
		addSeparator();
		
		JButton btnZoomIn = new JButton();
		btnZoomIn.setToolTipText("Zoom In");
		btnZoomIn.setIcon(new ImageIcon("images/toolbar/24x24/zoom_in.png"));
		add(btnZoomIn);
		
		JButton btnZoomOut = new JButton();
		btnZoomOut.setToolTipText("Zoom Out");
		btnZoomOut.setIcon(new ImageIcon("images/toolbar/24x24/zoom_out.png"));
		add(btnZoomOut);
		
		addSeparator();
		
		JButton btnInfo = new JButton();
		btnInfo.setToolTipText("About");
		btnInfo.setIcon(new ImageIcon("images/toolbar/24x24/info.png"));
		add(btnInfo);
		
		addSeparator();
		addSeparator();
		addSeparator();
		addSeparator();
		addSeparator();
		addSeparator();
		addSeparator();
		
		JButton btnCascade = new JButton();
		btnCascade.setToolTipText("Cascade");
		btnCascade.setIcon(new ImageIcon("images/toolbar/24x24/cascade.png"));
		add(btnCascade);
		
		JButton btnTilev = new JButton();
		btnTilev.setToolTipText("Tile Vertical");
		btnTilev.setIcon(new ImageIcon("images/toolbar/24x24/tile_vertical.png"));
		add(btnTilev);
		
		JButton btnTileh = new JButton();
		btnTileh.setToolTipText("Tile Horizontal");
		btnTileh.setIcon(new ImageIcon("images/toolbar/24x24/tile_horizontal.png"));
		add(btnTileh);
		
		addSeparator();
		
		btnProject.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().createDiagram();
				
			}
			
		});
		
		btnInfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JDialog dialog = new JDialog();     
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setTitle("About");

				JPanel newPanel1 = new JPanel();

				JPanel subPanel1 = new JPanel();
				JPanel subPanel2 = new JPanel();

				newPanel1.add(subPanel1);
				newPanel1.add(subPanel2);


				dialog.add(newPanel1);


				subPanel1.add(new JLabel("<html>Stefan Mijucic<br> AI52-2012<br>stefan.mijucic@uns.ac.rs<br><br><br> Mihajlo Ciric<br> AI29-2012<br> ciricmihajlo@yahoo.com</html>"));
				subPanel2.add(new JLabel(new ImageIcon("images/losa.jpg")));
				
				dialog.setResizable(false);
				dialog.pack();
				dialog.setLocationByPlatform(true);
				dialog.setVisible(true);
			}


		});
		
		btnTilev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().tileWindowsVertically();
				
				
			}
			
		});
		
		btnTileh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().tileWindowsHorizontally();
				
				
			}
			
		});
		
		btnCascade.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().cascadeWindows();
				
				
			}
			
		});
		
		

		//toolbar je pokretljiv, probati i sa staticnim toolbarom
		setFloatable(false);
		setBackground(new Color(74,74,74));
	
}



}
