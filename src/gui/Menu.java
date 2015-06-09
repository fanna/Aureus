package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;



public class Menu extends JMenuBar{
	public Menu (){

		JMenu file=new JMenu("File");
		file.setMnemonic('F');

		JMenuItem miNew =new JMenuItem("New");
		miNew.setMnemonic('N');
		JMenuItem miOpen =new JMenuItem("Open");
		miOpen.setMnemonic('O');
		JMenuItem miSave =new JMenuItem("Save");
		miSave.setMnemonic('S');
		JMenuItem miImport =new JMenuItem("Import");
		miImport.setMnemonic('I');
		JMenuItem miExport =new JMenuItem("Export");
		miExport.setMnemonic('E');
		JMenuItem miClose =new JMenuItem("Close");
		miClose.setMnemonic('C');

		miNew.setIcon(new ImageIcon("images/icons/document_new.png"));
		miOpen.setIcon(new ImageIcon("images/icons/folder_dark.png"));
		miSave.setIcon(new ImageIcon("images/icons/card.png"));
		miImport.setIcon(new ImageIcon("images/icons/arrow_right.png"));
		miExport.setIcon(new ImageIcon("images/icons/arrow_left.png"));
		miClose.setIcon(new ImageIcon("images/icons/forbidden.png"));

		miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		miImport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));
		miExport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
		miClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));

		JMenu edit=new JMenu("Edit");
		edit.setMnemonic('E');

		JMenuItem miUndo =new JMenuItem("Undo");
		miUndo.setMnemonic('U');
		JMenuItem miRedo =new JMenuItem("Redo");
		miRedo.setMnemonic('R');
		JMenuItem miCut =new JMenuItem("Cut");
		miCut.setMnemonic('T');
		JMenuItem miCopy =new JMenuItem("Copy");
		miCopy.setMnemonic('C');
		JMenuItem miPaste =new JMenuItem("Paste");
		miPaste.setMnemonic('P');
		JMenuItem miRotatel =new JMenuItem("Rotate Left");
		miRotatel.setMnemonic('L');
		JMenuItem miRotater =new JMenuItem("Rotate Right");
		JMenuItem miRename =new JMenuItem("Rename");
		JMenuItem miDelete =new JMenuItem("Delete");
		miDelete.setMnemonic('D');

		miUndo.setIcon(new ImageIcon("images/icons/go_back.png"));
		miRedo.setIcon(new ImageIcon("images/icons/go_forward.png"));
		miCut.setIcon(new ImageIcon("images/icons/page_dark_alt.png"));
		miCopy.setIcon(new ImageIcon("images/icons/stack_clear.png"));
		miPaste.setIcon(new ImageIcon("images/icons/page_alt.png"));
		miRotatel.setIcon(new ImageIcon("images/icons/rotate_left.png"));
		miRotater.setIcon(new ImageIcon("images/icons/repeat.png"));
		miRename.setIcon(new ImageIcon("images/icons/paragraph.png"));
		miDelete.setIcon(new ImageIcon("images/icons/trash.png"));

		miUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		miRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		miCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		miCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		miPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));

		JMenu view=new JMenu("View");
		view.setMnemonic('V');

		JMenuItem miZoomIn =new JMenuItem("Zoom In");
		miZoomIn.setMnemonic('I');
		JMenuItem miZoomOut =new JMenuItem("Zoom Out");
		miZoomOut.setMnemonic('O');

		miZoomIn.setIcon(new ImageIcon("images/icons/plus_light_alt.png"));
		miZoomOut.setIcon(new ImageIcon("images/icons/minus_light_alt.png"));

		miZoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_MASK));
		miZoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.CTRL_MASK));

		JMenu mnWindow=new JMenu("Window");
		mnWindow.setMnemonic('W');

		JMenuItem miCascade=new JMenuItem("Cascade");
		miCascade.setMnemonic('C');
		JMenuItem miTilev=new JMenuItem("Tile Vertically");
		miTilev.setMnemonic('V');
		JMenuItem miTileh=new JMenuItem("Tile Horizontally");
		miTileh.setMnemonic('H');
		JMenuItem miPrevious=new JMenuItem("Previous Window");
		miPrevious.setMnemonic('P');
		JMenuItem miNext=new JMenuItem("Next Window");
		miNext.setMnemonic('N');

		miCascade.setIcon(new ImageIcon("images/icons/news.png"));
		miTilev.setIcon(new ImageIcon("images/icons/tile_v.png"));
		miTileh.setIcon(new ImageIcon("images/icons/tile_h.png"));
		miPrevious.setIcon(new ImageIcon("images/icons/previous.png"));
		miNext.setIcon(new ImageIcon("images/icons/play.png"));	

		miCascade.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK + KeyEvent.ALT_MASK));
		miTileh.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK + KeyEvent.ALT_MASK));
		miTilev.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK + KeyEvent.ALT_MASK));

		JMenu help=new JMenu("Help");
		help.setMnemonic('H');

		JMenuItem miAbout=new JMenuItem("About");
		miAbout.setMnemonic('A');

		miAbout.setIcon(new ImageIcon("images/icons/info.png"));


		miNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().createDiagram();

			}


		});

		miClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Close?",  JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}

			}


		});
		miAbout.addActionListener(new ActionListener(){
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
		
		miCascade.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().cascadeWindows();
				
				
			}
			
		});
		
		miTileh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().tileWindowsHorizontally();
				
				
			}
			
		});
		
		miTilev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getInstance().tileWindowsVertically();
				
				
			}
			
		});

		file.add(miNew);
		file.add(miOpen);
		file.add(miSave);
		file.addSeparator();
		file.add(miImport);
		file.add(miExport);
		file.addSeparator();
		file.add(miClose);

		edit.add(miUndo);
		edit.add(miRedo);
		edit.addSeparator();
		edit.add(miCut);
		edit.add(miCopy);
		edit.add(miPaste);
		edit.addSeparator();
		edit.add(miRotatel);
		edit.add(miRotater);
		edit.add(miRename);
		edit.addSeparator();
		edit.add(miDelete);

		view.add(miZoomIn);
		view.add(miZoomOut);

		help.add(miAbout);

		mnWindow.add(miCascade);
		mnWindow.add(miTileh);
		mnWindow.add(miTilev);
		mnWindow.addSeparator();
		mnWindow.add(miPrevious);
		mnWindow.add(miNext);

		add(file);
		add(edit);
		add(view);
		add(mnWindow);
		add(help);



	}

}
