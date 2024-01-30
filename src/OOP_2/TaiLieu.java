package OOP_2;

public class TaiLieu {
	private String maTl;
	private String tenNXB;
	private int soBanPhatHanh;
	public TaiLieu(String maTl, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTl = maTl;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public TaiLieu() {
		super();
	}
	public String getMaTl() {
		return maTl;
	}
	public void setMaTl(String maTl) {
		this.maTl = maTl;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBanphathanh() {
		return soBanPhatHanh;
	}
	public void setSoBanphathanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	@Override
	public String toString() {
		return "TaiLieu [maTl=" + maTl + ", tenNXB=" + tenNXB + ", soBanphathanh=" + soBanPhatHanh + ", toString()="
				+ super.toString() + "]";
	}
	
}
