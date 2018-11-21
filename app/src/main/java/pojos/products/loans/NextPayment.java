
package pojos.products.loans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NextPayment {

    @SerializedName("PayDate")
    @Expose
    private Long payDate;
    @SerializedName("Ccy")
    @Expose
    private String ccy;
    @SerializedName("PriAmt")
    @Expose
    private Double priAmt;
    @SerializedName("IntAmt")
    @Expose
    private Double intAmt;
    @SerializedName("FeeAmt")
    @Expose
    private Double feeAmt;
    @SerializedName("InsAmt")
    @Expose
    private Long insAmt;
    @SerializedName("RliAmt")
    @Expose
    private Long rliAmt;
    @SerializedName("TotalAmt")
    @Expose
    private Double totalAmt;
    @SerializedName("NextPayAmt")
    @Expose
    private Double nextPayAmt;

    public Long getPayDate() {
        return payDate;
    }

    public void setPayDate(Long payDate) {
        this.payDate = payDate;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Double getPriAmt() {
        return priAmt;
    }

    public void setPriAmt(Double priAmt) {
        this.priAmt = priAmt;
    }

    public Double getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(Double intAmt) {
        this.intAmt = intAmt;
    }

    public Double getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Double feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Long getInsAmt() {
        return insAmt;
    }

    public void setInsAmt(Long insAmt) {
        this.insAmt = insAmt;
    }

    public Long getRliAmt() {
        return rliAmt;
    }

    public void setRliAmt(Long rliAmt) {
        this.rliAmt = rliAmt;
    }

    public Double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Double getNextPayAmt() {
        return nextPayAmt;
    }

    public void setNextPayAmt(Double nextPayAmt) {
        this.nextPayAmt = nextPayAmt;
    }

}
