package OOP;


public class CongNhan extends CanBo {
	private int bac;
	
	
	
	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi,int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
		// TODO Auto-generated constructor stub
	}
     
	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	@Override
	public String toString() {
		return "CongNhan [bac=" + bac + ", toString()=" + super.toString() + "]";
	}
	
	
}
