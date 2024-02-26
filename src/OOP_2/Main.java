package OOP_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyThuVien qltv = new QuanLyThuVien(scanner);
		int luachon;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1.Tạo mới tài liệu");
			System.out.println("2.Xóa tài liệu");
			System.out.println("3.Hiển thị danh sách tài liệu");
			System.out.println("4.Tìm kiếm theo loại");
			System.out.println("Nhập vào lựa chọn:");
			luachon = Integer.parseInt(scanner.nextLine());
		switch(luachon) {
		case 1:
			System.out.println("Chọn tài liệu muốn tạo:");
			System.out.println("1.Sách");
			System.out.println("2.Tạp chí");
			System.out.println("3.Báo");
			System.out.println("Nhập vào lựa chọn:");
			int luachon1 = Integer.parseInt(scanner.nextLine());
			qltv.themTaiLieu(luachon1);
			break;
		case 2:
			System.out.println("Xóa tài liệu");
			System.out.println("Nhập mã tài liệu muốn xóa: ");
			String MatlDel = scanner.nextLine();
			qltv.deleteByID(MatlDel);
			break;
		case 3:
			qltv.hienThi();
			break;
		case 4:
			System.out.println("Tìm kiếm");
			System.out.println("Nhập mã tài liệu muốn xóa: ");
			String searchNXB = scanner.nextLine();
			qltv.searchByName(searchNXB);
			break;
			}
		} while(luachon != 0);
	}
}


