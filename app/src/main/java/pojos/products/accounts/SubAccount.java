
package pojos.products.accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubAccount {

    @SerializedName("AcctKey")
    @Expose
    private Long acctKey;
    @SerializedName("PrintAcctNo")
    @Expose
    private String printAcctNo;
    @SerializedName("AvailableAmount")
    @Expose
    private Double availableAmount;
    @SerializedName("RealAmount")
    @Expose
    private Double realAmount;
    @SerializedName("Ccy")
    @Expose
    private String ccy;

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public String getPrintAcctNo() {
        return printAcctNo;
    }

    public void setPrintAcctNo(String printAcctNo) {
        this.printAcctNo = printAcctNo;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Double getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Double realAmount) {
        this.realAmount = realAmount;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }



}
