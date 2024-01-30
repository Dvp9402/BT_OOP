package OOP;

public class CanBo {
	private String HoTen;
	private int Tuoi;
	private String GioiTinh;
	private String DiaChi;
	
	
	
	public CanBo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
		super();
		HoTen = hoTen;
		Tuoi = tuoi;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
	}


	public String getHoTen() {
		return HoTen;
	}


	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}


	public int getTuoi() {
		return Tuoi;
	}


	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}


	public String getGioiTinh() {
		return GioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}


	public String getDiaChi() {
		return DiaChi;
	}


	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	

	@Override
	public String toString() {
		return "CanBo [HoTen=" + HoTen + ", Tuoi=" + Tuoi + ", GioiTinh=" + GioiTinh + ", DiaChi=" + DiaChi + "]";
	}
	
	
}
