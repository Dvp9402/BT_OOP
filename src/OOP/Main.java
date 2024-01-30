package OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB(scanner);
		int luachon;
		do {
			System.out.println("Menu");
			System.out.println("1.Tạo mới cán bộ");
			System.out.println("2.Tìm kiếm cán bộ theo tên");
			System.out.println("3. Hiển thị danh sách cán bộ");
			System.out.println("0.Thoát");
			System.out.println("Nhập vào lựa chọn:");
			luachon = Integer.parseInt(scanner.nextLine());
		switch(luachon) {
		case 1:
			System.out.println("Chọn vị trí muốn tạo:");
			System.out.println("1.Kỹ sư");
			System.out.println("2.Công nhân");
			System.out.println("3.Nhân viên");
			System.out.println("Nhập vào lựa chọn:");
			int luachon1 = Integer.parseInt(scanner.nextLine());
			qlcb.themCanBo(luachon1);
			break;
		case 2:
			System.out.println("Nhập vào họ tên cần tìm: ");
			String tenCanTim = scanner.nextLine();
			qlcb.timKiemTheoHoTen(tenCanTim);
			break;
		case 3:
			qlcb.hienThi();
			break;
			}
		} while(luachon != 0);
	}

}
