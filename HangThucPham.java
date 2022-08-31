package Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private final String maHang;
	private String tenHang="xxx";
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	public HangThucPham(String maHang) throws Exception{
		super();
		if (maHang.trim().equals(""))
			this.maHang = maHang;
		else 
			throw new Exception("Lỗi: Mã hàng rỗng");
		// TODO Auto-generated constructor stub
	}
	
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else 
			this.tenHang = "xxx";
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia<0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public String getMaHang() {
		return maHang;
	}
	
	public boolean hetHan() {
		LocalDate homnay = LocalDate.now();
		if (ngayHetHan.isBefore(homnay)) return true;
		return false;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%10s|%20s|%15.2f|%20s|%20s|%20s", maHang, tenHang, donGia, dtf.format(ngaySanXuat), dtf.format(ngayHetHan), hetHan()?"Hàng hết hạn":"");
	}
	
	
}
