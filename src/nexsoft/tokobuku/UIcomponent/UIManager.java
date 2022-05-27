package nexsoft.tokobuku.UIcomponent;

import java.util.ArrayList;
import java.util.List;

public class UIManager {
	List<View> lstView = new ArrayList<View>();
	
	public UIManager() {
		
	}
	
	public List<View> getLstView() {
		return lstView;
	}

	public void setLstView(List<View> lstView) {
		this.lstView = lstView;
	}
	
	public void addView(View view) {
		lstView.add(view);
	}
	
	public void render() {
		for(View view : lstView) {
			view.draw();
		}
	}
}
