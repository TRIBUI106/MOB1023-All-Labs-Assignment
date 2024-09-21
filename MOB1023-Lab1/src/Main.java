import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("+==============  M E N U  ==============+");
            System.out.println("1. Truy xuất lớp Product");
            System.out.println("2. Tạo 5 sản phẩm input từ bàn phím");
            System.out.println("3. Tạo 3 sản phẩm ( trong đó có 1 không thuế )");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
            System.out.println("0. Thoát");
            System.out.println("+==============  M E N U  ==============+");
            System.out.print("Nhập chức năng muốn chọn : ");

            try {
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        Bai1();
                        break;
                    case 2:
                        Bai2();
                        break;
                    case 3:
                        Bai3();
                        break;
                    case 4:
                        break;
                    case 0:
                        System.out.println("\n\n\t ĐÃ THOÁT CHƯƠNG TRÌNH \n\n");
                        System.exit(0);
                    default:
                        System.out.println("Vui lòng nhập từ 0 -> 4 ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập từ 0 -> 4 !");
                sc.nextLine();
            }
        }
    }

    public static void Bai1() {
        Product sp1 = new Product("Sữa rửa mặt", 10000.0);
        System.out.println("======================================");
        sp1.showInfo();
        System.out.println("Thuế nhập : " + sp1.getImportTax());
        System.out.println("======================================");
    }

    public static void Bai2() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> danhSachSanPham = new ArrayList<>();
        boolean wrongInput = false;

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println();
                System.out.println("Sản Phẩm thứ " + (i + 1) + ":");
                System.out.print("Nhập tên sp: ");
                String nameSp = sc.nextLine();
                System.out.print("Nhập giá sp: ");
                double giaSp = sc.nextDouble();
                sc.nextLine(); // Khi nhập số sẽ dư Enter nên bị lỗi, dùng sc.nextLine() cho enter bín mất
                Product sp = new Product(nameSp, giaSp);
                danhSachSanPham.add(sp);
                sp.insert();
            } catch (InputMismatchException e) {
                System.out.println("\nVui lòng nhập đúng dạng giá\n");
                wrongInput = true;
                break;
            }
        }

        // Hiển thị thông tin của các sản phẩm
        if (!wrongInput) {
            System.out.println("\n+============== S P A C E ==============+\n");
            int count = 0;
            for (Product sp : danhSachSanPham) {
                ++count;
                System.out.println("Sản phẩm thứ " + count);
                sp.showInfo();
                System.out.println("Thuế nhập : " + sp.getImportTax());
                System.out.println();
            }
        }

    }

    public static void Bai3() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> danhSachSanPham2 = new ArrayList<>();
        boolean wrongInput = false;

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println();
                System.out.println("Sản Phẩm thứ " + (i + 1) + ":");
                System.out.print("Nhập tên sp: ");
                String nameSp = sc.nextLine();
                System.out.print("Nhập giá sp: ");
                double giaSp = sc.nextDouble();
                sc.nextLine(); // Khi nhập số sẽ dư Enter nên bị lỗi, dùng sc.nextLine() cho enter bín mất
                if ( i == 0 ) {
                    NoTaxProduct sp = new NoTaxProduct(nameSp, giaSp);
                    danhSachSanPham2.add(sp);
                    sp.insert();
                } else {
                    Product sp = new Product(nameSp, giaSp);
                    danhSachSanPham2.add(sp);
                    sp.insert();
                }
            } catch (InputMismatchException e) {
                System.out.println("\nVui lòng nhập đúng dạng giá\n");
                wrongInput = true;
                break;
            }
        }

        // Hiển thị thông tin của các sản phẩm
        if (!wrongInput) {
            System.out.println("\n+============== S P A C E ==============+\n");
            int count = 0;
            for (Product sp : danhSachSanPham2) {
                ++count;
                System.out.println("Sản phẩm thứ " + count);
                sp.showInfo();
                System.out.println("Thuế nhập : " + sp.getImportTax());
                System.out.println();
            }
        }
        
    }



}