package nexsoft.tokobuku.UIcomponent;

public class Label extends Component {
	
	String text=" ";
	
	public Label(String text) {
		super.width=text.length()+2;
		super.height=3;
		this.text = text;
	}
	
	public Label() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void content(int width, int height) {
		// TODO Auto-generated method stub
		System.out.print(text.charAt(width-1));
	}
	
}
