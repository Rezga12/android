
package pojos.products.accounts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("AcctKey")
    @Expose
    private Long acctKey;
    @SerializedName("AcctName")
    @Expose
    private String acctName;
    @SerializedName("PrintAcctNo")
    @Expose
    private String printAcctNo;
    @SerializedName("AvailableAmounts")
    @Expose
    private List<AvailableAmount> availableAmounts = null;
    @SerializedName("Ccy")
    @Expose
    private String ccy;
    @SerializedName("OrderNo")
    @Expose
    private Long orderNo;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("Product")
    @Expose
    private String product;
    @SerializedName("MainAcctKey")
    @Expose
    private Long mainAcctKey;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("ProductId")
    @Expose
    private Long productId;
    @SerializedName("SubAccounts")
    @Expose
    private List<SubAccount> subAccounts = null;

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getPrintAcctNo() {
        return printAcctNo;
    }

    public void setPrintAcctNo(String printAcctNo) {
        this.printAcctNo = printAcctNo;
    }

    public List<AvailableAmount> getAvailableAmounts() {
        return availableAmounts;
    }

    public void setAvailableAmounts(List<AvailableAmount> availableAmounts) {
        this.availableAmounts = availableAmounts;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getMainAcctKey() {
        return mainAcctKey;
    }

    public void setMainAcctKey(Long mainAcctKey) {
        this.mainAcctKey = mainAcctKey;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<SubAccount> getSubAccounts() {
        return subAccounts;
    }

    public void setSubAccounts(List<SubAccount> subAccounts) {
        this.subAccounts = subAccounts;
    }



}
