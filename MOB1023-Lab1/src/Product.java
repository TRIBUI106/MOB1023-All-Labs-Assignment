public class Product implements DAO {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getImportTax() {
        return this.price * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void showInfo() {
        System.out.println("Tên : " + getName());
        System.out.println("Giá : " + getPrice());
    }

    @Override
    public void update() {
        System.out.println("Cập nhật thành công!");
    }

    @Override
    public void insert() {
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void select() {
        System.out.println("Đã chọn!");
    }

    @Override
    public void delete() {
        System.out.println("Xóa thành công!");
    }
}