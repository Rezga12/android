
package pojos.products.loans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastPayment {

    @SerializedName("PaymentDate")
    @Expose
    private Long paymentDate;
    @SerializedName("Principal")
    @Expose
    private Double principal;
    @SerializedName("Interest")
    @Expose
    private Double interest;
    @SerializedName("Penalty")
    @Expose
    private Long penalty;
    @SerializedName("Fee")
    @Expose
    private Long fee;
    @SerializedName("ScheduledFee")
    @Expose
    private Double scheduledFee;
    @SerializedName("InsAmt")
    @Expose
    private Long insAmt;
    @SerializedName("RliAmt")
    @Expose
    private Long rliAmt;
    @SerializedName("AmountPaid")
    @Expose
    private Double amountPaid;
    @SerializedName("Ccy")
    @Expose
    private String ccy;

    public Long getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Long paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Long getPenalty() {
        return penalty;
    }

    public void setPenalty(Long penalty) {
        this.penalty = penalty;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Double getScheduledFee() {
        return scheduledFee;
    }

    public void setScheduledFee(Double scheduledFee) {
        this.scheduledFee = scheduledFee;
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

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

}
