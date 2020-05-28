package com.lhy.frame;

import com.lhy.data.HomeRecyclerBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiService {


    @GET(".")
    Observable<HomeRecyclerBean> getTreData(@QueryMap Map<String, Object> params, @Query("page_id") int pageId);

}
