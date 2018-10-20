package gt.hack.photogallery;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("https://bioinfobot.github.io/data/2017-05.json")
    void getInfo(@Query("mid") Callback<Response> callback);

}
