package gui;


public class MyApp {

	public MyApp() {
		super();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainFrame main=MainFrame.getInstance();
		main.setVisible(true);
		main.setLocationRelativeTo(null);

	}

}