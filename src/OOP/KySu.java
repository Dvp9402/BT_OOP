package OOP;

public class KySu extends CanBo {
	private String NganhDaoTao;
	

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi,String NganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.NganhDaoTao = NganhDaoTao;
		// TODO Auto-generated constructor stub
	}

	public String getNganhDaoTao() {
		return NganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		NganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return "KySu [NganhDaoTao=" + NganhDaoTao + ", toString()=" + super.toString() + "]";
	}

	
	
}
