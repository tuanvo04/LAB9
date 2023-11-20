package task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		// Tạo danh sách chương sách cho sách tham khảo
		List<ChuongSach> chuongSachList = new ArrayList<>();
		chuongSachList.add(new ChuongSach("Chương 1: Giới thiệu", 10));
		chuongSachList.add(new ChuongSach("Chương 2: Phương pháp nghiên cứu", 15));
		// Tạo sách tham khảo
		SachThamKhao sachThamKhao1 = new SachThamKhao("Sách Y học", 200, 2022, "Le Thi D", 70.0, "Y học",
				chuongSachList);
		
		
		 // Tạo danh sách chương sách cho sách khác
        List<ChuongSach> chuongSachList2 = new ArrayList<>();
        chuongSachList2.add(new ChuongSach("Chương 1: Thể thao hiện đại", 12));
        chuongSachList2.add(new ChuongSach("Chương 2: Các kỹ thuật mới", 18));
        chuongSachList2.add(new ChuongSach("Chương 3: Các kỹ thuật cũ", 119));
        // Tạo sách tham khảo khác
        SachThamKhao sachThamKhao2 = new SachThamKhao("Sách Thể thao", 150, 2021, "Le Thi D", 60.0, "Thể thao", chuongSachList2);
		
        // Tạo tạp chí
		TapChi tapChi = new TapChi("Tạp chí ABC", 50, 2022, "Nguyen Van A", 25.0, "Tạp chí Khoa học");
		TapChi tapChi1 = new TapChi("Tạp chí ABC", 50, 2022, "Nguyen Van A", 25.0, "Tạp chí Khoa CNTT ");

		// Tạo danh mục ấn phẩm
        DanhMucAnPham danhMucAnPham = new DanhMucAnPham();
        danhMucAnPham.themAnPham(sachThamKhao1);
        danhMucAnPham.themAnPham(tapChi);
        danhMucAnPham.themAnPham(sachThamKhao2);

		System.out.println("Loại của ấn phẩm: ");
		System.out.println(sachThamKhao1.getLoaiAnPham());
		System.out.println(tapChi.getLoaiAnPham());
		
		
		
		System.out.print("kiểm tra có là tạp chì và sản xuất cách đây 10 năm hay không: "+tapChi.isTapChi());
		System.out.println();
		System.out.print("kiểm tra có cùng loại cùng tác giả không: "+sachThamKhao1.cungLoaiVaTacGia( sachThamKhao2));
		System.out.println();
		System.out.println("Tổng tiền ấn phẩm: " + danhMucAnPham.tongTienAnPham());
		
		System.out.println("Sách tham khảo có chương sách nhiều trang nhất: ");
		System.out.println(danhMucAnPham.timSachThamKhaoNhieuTrangNhat());
		
		
		System.out.println("Danh sách ấn phẩm có chứa tạp chí có tên cho trước hay không: "+danhMucAnPham.isChuaTapChi(tapChi1));
		
		System.out.println("Tạp chí được xuất bản vào một anwm trước: "+ danhMucAnPham.tapChiXuatBanTrongNam(2021));
		
		System.out.println("Sắp xếp ấn phẩm tăng dần theo tiêu đề và giảm dần theo năm xuất bản: ");
		danhMucAnPham.sapXepAnPham();
		
		danhMucAnPham.thongKeSoLuongTheoNam();
		
		
	}
}
