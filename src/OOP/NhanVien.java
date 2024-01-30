package OOP;

public class NhanVien extends CanBo {
	private String CongViec;
	
	

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi,String CongViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.CongViec = CongViec;
		// TODO Auto-generated constructor stub
	}

	public String getCongViec() {
		return CongViec;
	}

	public void setCongViec(String congViec) {
		CongViec = congViec;
	}

	@Override
	public String toString() {
		return "NhanVien [CongViec=" + CongViec + ", toString()=" + super.toString() + "]";
	}
}
