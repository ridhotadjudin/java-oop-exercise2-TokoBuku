package nexsoft.tokobuku.UIcomponent;

import java.util.ArrayList;
import java.util.List;

public class MultiLineLabel extends Label {

	private List<String> lstText = new ArrayList<String>();

	public MultiLineLabel(List<String> text) {
		lstText = text;
		super.width = maxWidth()+2;
		super.height = lstText.size() + 2;
	}

	@Override
	public void content(int width, int height) {
		// TODO Auto-generated method stub
		if (lstText.get(height - 1).length() > width-1) {
			System.out.print(lstText.get(height - 1).charAt(width - 1));

		} else {
			System.out.print(" ");
		}
	}

	public int maxWidth() {
		int max = 0;
		for (String text : lstText) {
			if (text.length() > max) {
				max = text.length();
			}
		}
		return max;
	}
}
