package nexsoft.tokobuku.UIcomponent;

import java.util.ArrayList;
import java.util.List;

import nexsoft.tokobuku.adapter.OnClickListener;

public class View {
//	implements OnClickListener
	
	
	String name = "";
	int height = 0;
	int width = 0;
	
	List<Component> lstComponent = new ArrayList<Component>();
	
	public View() {
		
	}
	
	public void addComponent(Component component) {
		lstComponent.add(component);
	}
	
	public void draw() {
		for(Component component : lstComponent) {
			component.draw();
		}
	}
	
	public View(String name, int height, int width) {
		this.name=name;
		this.height=height;
		this.width=width;
	}

//	@Override
//	public void onClick() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
