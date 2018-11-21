package pojos.products.assetsandliabilities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssetsAndLiabilities {

    @SerializedName("Points")
    private List<Point> points;

    @SerializedName("Assets")
    private List<Asset> assets;

    @SerializedName("Liabilities")
    private List<Asset> liabilities;

    @SerializedName("AvailableAmounts")
    private List<Asset> availableAmounts;

}
