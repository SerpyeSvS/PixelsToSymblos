package teryne;

import javax.swing.*;
import static teryne.LcynteCoreConstant.*;
/**
 * Created by Serpye on 19.01.18
 * */
public class LcynteCore
{
/*::|		FIELD		:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~*/
/*::|		CONSTRUCTOR		:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~*/
/*::|		SUB_CLASS		:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~*/
/*::|		F / P		:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~:~*/
	public static void main(String sqcString[])
	{
		JFrame frame = FR_TERYNE;
		frame.setSize(FR_TERYNE_WIDTH, FR_TERYNE_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(PNL_TERYNE);
		frame.setVisible(true);
	}
}
