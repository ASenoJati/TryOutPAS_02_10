package com.example.tryoutpas_02_10;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SoccerAPI {
    @GET("/api/v1/json/3/search_all_teams.php?l=Spanish%20La%20Liga")
    Call<SoccerResponse> getLaliga(@Query("l") String league);
}
