public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTax() {
        return 0;
    }

}
