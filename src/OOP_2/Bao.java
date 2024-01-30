package OOP_2;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bao(String maTl, String tenNXB, int soBanPhatHanh,String ngayPhatHanh) {
		super(maTl, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh=ngayPhatHanh;
		// TODO Auto-generated constructor stub
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + ", toString()=" + super.toString() + "]";
	}
	
	
}
