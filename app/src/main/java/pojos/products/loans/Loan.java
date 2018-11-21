
package pojos.products.loans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loan {

    @SerializedName("LoanKey")
    @Expose
    private Long loanKey;
    @SerializedName("ProdType")
    @Expose
    private String prodType;
    @SerializedName("LoanName")
    @Expose
    private String loanName;
    @SerializedName("Ccy")
    @Expose
    private String ccy;
    @SerializedName("LoanType")
    @Expose
    private String loanType;
    @SerializedName("ProductId")
    @Expose
    private Long productId;
    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("SignedDate")
    @Expose
    private Long signedDate;
    @SerializedName("MatureDate")
    @Expose
    private Long matureDate;
    @SerializedName("InitialPrincipal")
    @Expose
    private Long initialPrincipal;
    @SerializedName("RemainingInterest")
    @Expose
    private Double remainingInterest;
    @SerializedName("InterestRate")
    @Expose
    private Double interestRate;
    @SerializedName("RestAmount")
    @Expose
    private Double restAmount;
    @SerializedName("NextPayment")
    @Expose
    private NextPayment nextPayment;
    @SerializedName("LastPayment")
    @Expose
    private LastPayment lastPayment;

    public Long getLoanKey() {
        return loanKey;
    }

    public void setLoanKey(Long loanKey) {
        this.loanKey = loanKey;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Long signedDate) {
        this.signedDate = signedDate;
    }

    public Long getMatureDate() {
        return matureDate;
    }

    public void setMatureDate(Long matureDate) {
        this.matureDate = matureDate;
    }

    public Long getInitialPrincipal() {
        return initialPrincipal;
    }

    public void setInitialPrincipal(Long initialPrincipal) {
        this.initialPrincipal = initialPrincipal;
    }

    public Double getRemainingInterest() {
        return remainingInterest;
    }

    public void setRemainingInterest(Double remainingInterest) {
        this.remainingInterest = remainingInterest;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getRestAmount() {
        return restAmount;
    }

    public void setRestAmount(Double restAmount) {
        this.restAmount = restAmount;
    }

    public NextPayment getNextPayment() {
        return nextPayment;
    }

    public void setNextPayment(NextPayment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public LastPayment getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(LastPayment lastPayment) {
        this.lastPayment = lastPayment;
    }

}
