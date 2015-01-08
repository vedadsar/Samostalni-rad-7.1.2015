package CardsGame;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame {

	public static void main(String[] args) throws MalformedURLException {
		Test test = new Test();
		test.setDefaultCloseOperation(EXIT_ON_CLOSE);
		test.getContentPane().add(new JButton(new ImageIcon(new URL("https://avatars2.githubusercontent.com/u/9656061?v=3&s=40"))));
		test.getContentPane().add(new JButton(new ImageIcon("/Users/vedadzornic/Downloads/logo-ie9cyan.png")));
		test.setSize(100, 200);
		test.setLocation(100, 100);
		test.setVisible(true);
	}

}
