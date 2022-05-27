package nexsoft.tokobuku;

import java.util.ArrayList;
import java.util.List;
import nexsoft.tokobuku.UIcomponent.UIManager;
import nexsoft.tokobuku.controller.Controller;
import nexsoft.tokobuku.model.ModelBuku;

public class Main {

	public static void main(String[] args) {
		UIManager manager = new UIManager();
		List<ModelBuku> lstBuku = new ArrayList<>();
		ModelBuku buku1 = new ModelBuku("KKN di Desa Penyanyi","12345",15000,"Intan","PT Buku Bajakan");
		ModelBuku buku2 = new ModelBuku("Stranger Things","23456",20000,"Antoni","PT Buku Asli");
		
		lstBuku.add(buku1);
		lstBuku.add(buku2);
		
		Controller control = new Controller(manager, lstBuku);
		control.start();
	
	}

}
