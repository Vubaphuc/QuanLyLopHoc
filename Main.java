import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("MENU__________________");
            System.out.println("1. in ra thông tin học sinh, giáo viên");
            System.out.println("2. Tìm kiếm theo keyword bất kỳ nếu xuất hiện trong tên hoặc email hoặc số điện thoại thì in a thông tin người đó");
            System.out.println("3. Sắp xếp theo tên tăng dần ( theo từ điển a-zA-Z0-1-2)");
            System.out.println("4. Sắp xếp theo tuổi giảm dần");
            System.out.println("0. Kết thúc Chương Trình");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1:
                    service.xuat();
                    break;
                case 2:
                    service.timKiem(sc);
                    break;
                case 3:
                    service.sapXepTheoTen();
                    break;
                case 4:
                    service.sapXepTheoTuoi();
                    break;
                case 0:
                    System.out.println("Kết thúc Chương Trình");
                    System.exit(0);
                    break;
            }
        }
    }
}