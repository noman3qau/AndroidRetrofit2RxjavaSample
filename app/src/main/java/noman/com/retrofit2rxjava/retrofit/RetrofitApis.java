package noman.com.retrofit2rxjava.retrofit;

import java.util.List;

import io.reactivex.Single;
import noman.com.retrofit2rxjava.model.GithubIssue;
import noman.com.retrofit2rxjava.model.GithubRepo;
import noman.com.retrofit2rxjava.model.OAuthToken;
import noman.com.retrofit2rxjava.model.UserDetails;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface RetrofitApis {

    String ENDPOINT = "https://api.github.com";

    String BASE_URL_TWITTER = "https://api.twitter.com/";

    @GET("user/repos?per_page=100")
    Single<List<GithubRepo>> getRepos();

    @GET("/repos/{owner}/{repo}/issues")
    Single<List<GithubIssue>> getIssues(@Path("owner") String owner, @Path("repo") String repository);

    @POST
    Single<ResponseBody> postComment(@Url String url, @Body GithubIssue issue);


    // Below are the twitter API calls
    @FormUrlEncoded
    @POST("oauth2/token")
    Call<OAuthToken> postCredentials(@Field("grant_type") String grantType);

    @GET("/1.1/users/show.json")
    Call<UserDetails> getUserDetails(@Query("screen_name") String name);


}
