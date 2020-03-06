import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class BubbleSortGUI {
	private static JTextField txt;
	private static JTextField enterNumbers;
	private static String sorted = "";
	static String s = "";

	public static void main(String args[]) {

		// Creating the Frame
		JFrame frm = new JFrame("Bubble Sort");
		frm.setTitle("Bubble Sort by Kalvin Kao");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(340, 484);
		frm.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pnl = new JPanel();
		frm.getContentPane().add(pnl);
		pnl.setLayout(new GridLayout(0, 1, 0, 0));

		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setText("Please Enter Numbers To Sort");
		pnl.add(txt);
		txt.setColumns(10);

		enterNumbers = new JTextField();
		enterNumbers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		enterNumbers.setHorizontalAlignment(SwingConstants.CENTER);
		pnl.add(enterNumbers);
		enterNumbers.setColumns(10);

		JTextArea sortedArea = new JTextArea();
		sortedArea.setWrapStyleWord(true);
		sortedArea.setLineWrap(true);
		sortedArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		sortedArea.setEditable(false);

		pnl.add(sortedArea);

		JButton sortBtn = new JButton("SORT");
		sortBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		sortBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = SortingFunction.stringToArray(enterNumbers.getText());
				sortedArea.setText(s);
			}
		});
		pnl.add(sortBtn);

		frm.setVisible(true);

	}
}
