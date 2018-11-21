
package pojos.products.accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableAmount {

    @SerializedName("Amount")
    @Expose
    private Double amount;
    @SerializedName("Currency")
    @Expose
    private String currency;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



}
