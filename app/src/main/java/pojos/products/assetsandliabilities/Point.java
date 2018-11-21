package pojos.products.assetsandliabilities;

public class Point {


    private Integer Id;
    private String ProductName;
    private Integer OrderNo;
    private Integer Amount;
    private String ProdType;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(Integer orderNo) {
        OrderNo = orderNo;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getProdType() {
        return ProdType;
    }

    public void setProdType(String prodType) {
        ProdType = prodType;
    }
}
