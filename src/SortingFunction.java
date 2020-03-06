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

public class SortingFunction extends BubbleSortGUI {
	static String s = "";

	public static String stringToArray(String num) {

		int[] arr = new int[num.length()];

		for (int i = 0; i < num.length(); i++) {

			arr[i] = Character.getNumericValue(num.charAt(i));
		}

		bubbleSort(arr);
		return printArray(arr);

	}

	public static void bubbleSort(int arr[]) {
		// int sortedArr[];

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
	}

	static /* Prints the array */
	String printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i]);
		System.out.println();
		s = Arrays.toString(arr);

		return s;

	}
}