
package pojos.products.deposits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Deposit {

    @SerializedName("AgreeKey")
    @Expose
    private Long agreeKey;
    @SerializedName("ProdType")
    @Expose
    private String prodType;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Ccy")
    @Expose
    private String ccy;
    @SerializedName("DepositType")
    @Expose
    private String depositType;
    @SerializedName("NextWithdrawalDate")
    @Expose
    private Long nextWithdrawalDate;
    @SerializedName("AccountKey")
    @Expose
    private Long accountKey;
    @SerializedName("AcctNo")
    @Expose
    private String acctNo;
    @SerializedName("CurrentBalance")
    @Expose
    private Double currentBalance;
    @SerializedName("AvailableAmount")
    @Expose
    private Double availableAmount;
    @SerializedName("ProductId")
    @Expose
    private Long productId;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("DepositTypeName")
    @Expose
    private String depositTypeName;
    @SerializedName("MaturityDate")
    @Expose
    private Long maturityDate;
    @SerializedName("StartDate")
    @Expose
    private Long startDate;
    @SerializedName("IntAccrued")
    @Expose
    private Double intAccrued;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("CloseDate")
    @Expose
    private String closeDate;
    @SerializedName("InterestRate")
    @Expose
    private Double interestRate;
    @SerializedName("TotalBalance")
    @Expose
    private Double totalBalance;

    public Long getAgreeKey() {
        return agreeKey;
    }

    public void setAgreeKey(Long agreeKey) {
        this.agreeKey = agreeKey;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public Long getNextWithdrawalDate() {
        return nextWithdrawalDate;
    }

    public void setNextWithdrawalDate(Long nextWithdrawalDate) {
        this.nextWithdrawalDate = nextWithdrawalDate;
    }

    public Long getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(Long accountKey) {
        this.accountKey = accountKey;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getDepositTypeName() {
        return depositTypeName;
    }

    public void setDepositTypeName(String depositTypeName) {
        this.depositTypeName = depositTypeName;
    }

    public Long getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Long maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Double getIntAccrued() {
        return intAccrued;
    }

    public void setIntAccrued(Double intAccrued) {
        this.intAccrued = intAccrued;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString() {
        return "" + getAcctNo() +" " + getCcy() + " " + getCloseDate();
    }

}
