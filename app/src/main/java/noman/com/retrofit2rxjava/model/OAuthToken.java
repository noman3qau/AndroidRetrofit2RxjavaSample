package noman.com.retrofit2rxjava.model;

import com.google.gson.annotations.SerializedName;

public class OAuthToken {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAuthorization() {
        return getTokenType() + " " + getAccessToken();
    }

}
