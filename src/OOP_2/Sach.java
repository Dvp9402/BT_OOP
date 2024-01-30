package OOP_2;

public class Sach extends TaiLieu {
	private String tenTG;
	private int soTrang;
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sach(String maTl, String tenNXB, int soBanPhatHanh,String tenTG,int soTrang) {
		super(maTl, tenNXB, soBanPhatHanh);
		this.tenTG = tenTG;
		this.soTrang=soTrang;
		// TODO Auto-generated constructor stub
	}
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	@Override
	public String toString() {
		return "Sach [tenTG=" + tenTG + ", soTrang=" + soTrang + ", toString()=" + super.toString() + "]";
	}
	
	
}
