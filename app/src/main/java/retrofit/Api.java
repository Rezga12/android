package retrofit;

import java.util.List;

import pojos.clients.clientinfo.ClientInfo;
import pojos.clients.login.Login;
import pojos.products.accounts.Account;
import pojos.products.assetsandliabilities.AssetsAndLiabilities;
import pojos.products.cards.Card;
import pojos.products.deposits.Deposit;
import pojos.products.loans.Loan;
import pojos.products.transactions.Transactions;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface Api {
    @Headers({"Content-Type: application/json"})
    @GET("api/Clients/Login/{username}/{password}")
    Call<Login> getLogin(@Path("username") String username, @Path("password") String password);

    @Headers({"Content-Type: application/json"})
    @GET("api/Clients/ClientInfo/{sessionId}")
    Call<ClientInfo> getClientInfo(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/AssetsAndLiabilities/{sessionId}")
    Call<AssetsAndLiabilities> getAssetsAndLiabilities(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/Loans/{sessionId}")
    Call<List<Loan>> getLoans(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/Deposits/{sessionId}")
    Call<List<Deposit>> getDeposits(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/Accounts/{sessionId}")
    Call<List<Account>> getAccounts(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/Cards/{sessionId}")
    Call<List<Card>> getCards(@Path("sessionId") String sessionId);

    @Headers({"Content-Type: application/json"})
    @GET("api/Products/Transactions/{sessionId}")
    Call<Transactions> getTransactions(@Path("sessionId") String sessionId);


}
