package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class QLCB {
	
	private CanBo[] cbs ;
	private Scanner scanner;
	private int INDEX =0;
	
	
	public QLCB(Scanner scanner) {
		super();
		cbs = new CanBo[0];
		this.scanner = scanner;
	}
	
	public void themCanBo(int luachon) {
		CanBo[] newCbs = Arrays.copyOf(cbs, cbs.length +1);
		newCbs[INDEX] = taoCanBo(luachon);
		cbs = newCbs;
		INDEX ++;
	}
	
	public CanBo timKiemTheoHoTen(String HoTen) {
        for (CanBo cb : cbs) {
            if (cb.getHoTen().equals(HoTen)) {
                return cb;
            }
        }
        return null;
    }
	public void hienThi() {
		for(CanBo cb: cbs) {
			if(cb != null) {
				System.out.println(cb.toString());
			}
		}
	}
	
	public CanBo taoCanBo(int luaChon) {
		CanBo cb;
		System.out.println("Nhập tên:");
		String HoTen = scanner.nextLine();
		System.out.println("Nhập tuổi:");
		int Tuoi = Integer.parseInt(scanner.nextLine());
		String GioiTinh = luaChonGioiTinh();
		System.out.println("Nhập địa chỉ:");
		String DiaChi = scanner.nextLine();
		if(luaChon == 1) {
			System.out.println("Nhập ngành đào tạo:");
			String NganhDaoTao = scanner.nextLine();
			cb = new KySu(HoTen,Tuoi,GioiTinh,DiaChi,NganhDaoTao);
		}else if(luaChon == 2) {
			System.out.println("Nhập vào bậc:");
			int bac = scanner.nextInt();
			cb = new CongNhan(HoTen,Tuoi,GioiTinh,DiaChi,bac);
		}else {
			System.out.println("Nhập vào công việc:");
			String CongViec = scanner.nextLine();
			cb = new NhanVien(HoTen,Tuoi,GioiTinh,DiaChi,CongViec);
		}
		return cb;
	}
	private String luaChonGioiTinh() {
		System.out.println("Chọn giới tính:");
		System.out.println("1.Nam");
		System.out.println("2.Nữ");
		System.out.println("3.Khác");
		System.out.println("Nhập lựa chọn:");
		int luaChonGioiTinh = Integer.parseInt(scanner.nextLine());
		if(luaChonGioiTinh == 1) {
			return "Nam";
		}else if(luaChonGioiTinh == 2) {
			return "Nữ";
		}else{
			return "Khác";
		}
	}
}
