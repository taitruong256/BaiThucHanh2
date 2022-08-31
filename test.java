package Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
	public static HangThucPham nhap(){
		String maHang, tenHang, ngaySanXuat, ngayHetHan;
		double donGia;
		System.out.println("Nhập mã hàng: ");
		Scanner sc = new Scanner(System.in);
		maHang = sc.nextLine();
		System.out.println("Nhập tên hàng: ");
		sc = new Scanner(System.in);
		tenHang = sc.nextLine();
		System.out.println("Nhập đơn giá: ");
		sc = new Scanner(System.in);
		donGia = sc.nextDouble();
		System.out.println("Nhập ngày sản xuất (dd/MM/yyyy): ");
		sc = new Scanner(System.in);
		ngaySanXuat = sc.nextLine();
		System.out.println("Nhập ngày hết hạn (dd/MM/yyyy: ");
		sc = new Scanner(System.in);
		ngayHetHan = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		return new HangThucPham(maHang, tenHang, donGia, LocalDate.parse(ngaySanXuat, formatter), LocalDate.parse(ngayHetHan, formatter));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
//			HangThucPham tp1 = new HangThucPham("001", "Gao", 100000, LocalDate.parse("10/07/2018", formatter), LocalDate.parse("10/07/2018", formatter));
//			HangThucPham tp2 = new HangThucPham("002", "Mi", 5000, LocalDate.parse("01/03/2018", formatter), LocalDate.parse("01/09/2018", formatter));
//			HangThucPham tp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.parse("01/03/2017", formatter), LocalDate.parse("01/03/2018", formatter));
			HangThucPham tp1 = nhap();
			HangThucPham tp2 = nhap();
			HangThucPham tp3 = nhap();
			System.out.println(String.format("%10s|%20s|%15s|%20s|%20s%20s", "Mã hàng", "Tên hàng", "Đơn giá", "Ngày sản xuất", "Ngày hết hạn", "Ghi chú"));
			System.out.println(tp1.toString());
			System.out.println(tp2.toString());
			System.out.println(tp3.toString());
		}
		catch (Exception e){	
			System.err.println(e);
		}
	}
}
