package pojos.products.assetsandliabilities;

public class Asset {

    private String ProductType;
    private Double AmountBase;
    private String ProductName;

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public Double getAmountBase() {
        return AmountBase;
    }

    public void setAmountBase(Double amountBase) {
        AmountBase = amountBase;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}
