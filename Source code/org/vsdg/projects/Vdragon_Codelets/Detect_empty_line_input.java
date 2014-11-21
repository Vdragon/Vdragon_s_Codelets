package org.vsdg.projects.Vdragon_Codelets;
import java.util.Scanner;

public class Detect_empty_line_input {
	public static void main(String args[]) {
		Scanner standard_input_reader = new Scanner(System.in);
		StringBuffer input_line = new StringBuffer();

		while (!(input_line.insert(0, standard_input_reader.nextLine())
				.toString().isEmpty())) {
			System.out.println(input_line);
			input_line.setLength(0);
		}

		standard_input_reader.close();
		standard_input_reader = null;
		input_line = null;
	}
}