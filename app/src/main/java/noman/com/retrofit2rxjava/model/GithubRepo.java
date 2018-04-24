package noman.com.retrofit2rxjava.model;

public class GithubRepo {
    public String name;
    public String owner;
    public String url;

    @Override
    public String toString() {
        return (name + " " + url);
    }
}
