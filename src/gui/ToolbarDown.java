package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class ToolbarDown extends JToolBar{
	
	public ToolbarDown(){
		
		super(SwingConstants.VERTICAL);
		
		JButton btnSelect = new JButton();
		btnSelect.setToolTipText("Mouse");
		btnSelect.setIcon(new ImageIcon("images/toolbar/24x24/arrow.png"));
		add(btnSelect);
		
		addSeparator();

		JButton btnRect = new JButton();
		btnRect.setToolTipText("Rectangle");
		btnRect.setIcon(new ImageIcon("images/toolbar/24x24/video_stop.png"));
		add(btnRect);

		JButton btnCircle = new JButton();
		btnCircle.setToolTipText("Circle");
		btnCircle.setIcon(new ImageIcon("images/toolbar/24x24/video_rec.png"));
		add(btnCircle);
		
		JButton btnShape = new JButton();
		btnShape.setToolTipText("Shape");
		btnShape.setIcon(new ImageIcon("images/toolbar/24x24/flash.png"));
		add(btnShape);
	
		addSeparator();
		
		JButton btnPencil = new JButton();
		btnPencil.setToolTipText("Pencil");
		btnPencil.setIcon(new ImageIcon("images/toolbar/24x24/pencil.png"));
		add(btnPencil);

		JButton btnBrush = new JButton();
		btnBrush.setToolTipText("Brush");
		btnBrush.setIcon(new ImageIcon("images/toolbar/24x24/brush.png"));
		add(btnBrush);
		
		JButton btnEraser = new JButton();
		btnEraser.setToolTipText("Eraser");
		btnEraser.setIcon(new ImageIcon("images/toolbar/24x24/bookmark.png"));
		add(btnEraser);
		
		JButton btnPaint = new JButton();
		btnPaint.setToolTipText("Paint");
		btnPaint.setIcon(new ImageIcon("images/toolbar/24x24/paint.png"));
		add(btnPaint);
	
		addSeparator();
		
		JButton btnRuler= new JButton();
		btnRuler.setToolTipText("Ruler");
		btnRuler.setIcon(new ImageIcon("images/toolbar/24x24/ruler.png"));
		add(btnRuler);
	
		addSeparator();
		
		
		setFloatable(true);
		setBackground(new Color(74,74,74));
	}
}
