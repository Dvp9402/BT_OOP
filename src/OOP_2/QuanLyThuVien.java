package OOP_2;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyThuVien {
	private TaiLieu[] tls;
	private Scanner scanner;
	private int INDEX =0;
	
	public QuanLyThuVien(Scanner scanner) {
		super();
		tls = new TaiLieu[0];
		this.scanner = scanner;
	}
	
	public void themTaiLieu(int luachon) {
		TaiLieu[] newtl = Arrays.copyOf(tls, tls.length +1);
		newtl[INDEX]=taoTaiLieu(luachon);
		tls = newtl;
		INDEX++;
	}
	
	public void hienThi() {
		for(TaiLieu tl: tls) {
			if(tl != null) {
				System.out.println(tl.toString());
			}
		}
	}
	public TaiLieu taoTaiLieu(int choice) {
		TaiLieu tl;
		System.out.println("Nhập mã tài liệu:");
		String maTl = scanner.nextLine();
		System.out.println("Nhập tên nhà xuất bản:");
		String tenNXB = scanner.nextLine();
		System.out.println("Nhập số bản phát hành:");
		int soBanPhatHanh = Integer.parseInt(scanner.nextLine());
		if(choice == 1) {
			System.out.println("Nhập tên tác giả: ");
			String tenTG = scanner.nextLine();
			System.out.println("Nhập số trang: ");
			int soTrang = Integer.parseInt(scanner.nextLine());
			tl = new Sach(maTl,tenNXB,soBanPhatHanh,tenTG,soTrang);
		}else if(choice == 2) {
			System.out.println("Nhập số phát hành: ");
			int soPhatHanh = Integer.parseInt(scanner.nextLine());
			System.out.println("Nhập tháng phát hành: ");
			int thangPhatHanh = Integer.parseInt(scanner.nextLine());
			tl = new TapChi(maTl,tenNXB,soBanPhatHanh,soPhatHanh,thangPhatHanh);
		}else {
			System.out.println("Nhập vào ngày phát hành: ");
			String ngayPhatHanh = scanner.nextLine();
			tl = new Bao(maTl,tenNXB,soBanPhatHanh,ngayPhatHanh);
		}
		return tl;
	}
	public void deleteByID(String name) {
		TaiLieu[] newtl = new TaiLieu[tls.length - 1];
		for (int i = 0, j = 0; i < tls.length - 1; i++, j++) {
			if (!tls[i].getMaTl().equals(name)) {
				newtl[i] = tls[j];
			} else {
				j++;
				newtl[i] = tls[j];
			}
		}
		tls = newtl;
		INDEX--;
	}
	public void searchByName(String name) {
		for (TaiLieu tl : tls) {
			if (tl.getTenNXB().contains(name)) {
				System.out.println(tl.toString());
			}
		}
	}
}
