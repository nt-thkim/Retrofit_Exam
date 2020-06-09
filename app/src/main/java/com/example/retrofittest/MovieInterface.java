package com.example.retrofittest;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Taehyung Kim on 2020-06-09.
 *
 * @Discription:
 */
public interface MovieInterface {
    @GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json")
    Call<Map<String,Object>> getBoxOffice(@Query("key") String key,
                                          @Query("targetDt") String targetDt);
}
