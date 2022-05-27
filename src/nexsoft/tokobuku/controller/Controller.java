package nexsoft.tokobuku.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nexsoft.tokobuku.UIcomponent.Label;
import nexsoft.tokobuku.UIcomponent.MultiLineLabel;
import nexsoft.tokobuku.UIcomponent.UIManager;
import nexsoft.tokobuku.UIcomponent.View;
import nexsoft.tokobuku.model.ModelBuku;

public class Controller {

	UIManager manager;
	List<ModelBuku> buku;

	public Controller(UIManager manager, List<ModelBuku> buku) {
		this.manager = manager;
		this.buku = buku;
	}

	public void start() {
		MenuUI();
	}

	public void MenuUI() {
		View canvas = new View();

		List<String> data1 = new ArrayList<String>();
		data1.add("1. Tambah Buku");
		data1.add("2. Lihat Buku");
		data1.add("3. Keluar");
		MultiLineLabel multi = new MultiLineLabel(data1);

		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());

		manager.addView(canvas);
		manager.render();
		
		System.out.print("Masukkan pilihan anda? : ");
		Scanner in = new Scanner(System.in);
		int pilih = in.nextInt();

		switch (pilih) {
		case 1:

			break;
		case 2:
			LihatBuku();
			break;
		case 3:
			break;
		}
	}
	
	public void TambahBuku() {
		
		View canvas = new View();
		ModelBuku model = new ModelBuku();

		canvas.addComponent(HeaderUI());
		
		Scanner in = new Scanner(System.in);
		
		canvas.addComponent(new Label("Judul Buku-->"));
		manager.render();
		String judul = in.nextLine();
		model.setJudulBuku(judul);
		
		canvas.addComponent(new Label("ISBN-->"));
		manager.render();
		String isbn = in.nextLine();
		model.setIsbn(isbn);
		
		canvas.addComponent(new Label("Harga-->"));
		manager.render();
		int harga = in.nextInt();
		model.setHarga(harga);
		
		//// masih bisa ditambahkan sampai penerbit
		
		buku.add(model);
		String pilih = in.nextLine();
		LihatBuku();
	}
	
	public void LihatBuku() {
		View canvas = new View();

		List<String> menu = new ArrayList<String>();

		int x = 1;
		for (ModelBuku book : buku) {
			menu.add(x + ". " + book.getJudulBuku() + " " + book.getHarga());
			x++;
		}

		MultiLineLabel multi = new MultiLineLabel(menu);

		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());

		manager.addView(canvas);

		manager.render();
		Scanner in = new Scanner(System.in);
		int pilih = in.nextInt();
		MenuUI();
	}

	public MultiLineLabel HeaderUI() {
		List<String> header = new ArrayList<String>();
		header.add("                           ");
		header.add("       TOKO BUKU           ");
		header.add("                           ");
		MultiLineLabel multi = new MultiLineLabel(header);
		return multi;
	}

	public MultiLineLabel FooterUI() {
		List<String> header = new ArrayList<String>();
		header.add("                           ");
		header.add("      JL BUKU SATU         ");
		header.add("                           ");
		MultiLineLabel multi = new MultiLineLabel(header);
		return multi;
	}

}
