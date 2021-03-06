package com.myxh.developernews.network;

import com.myxh.developernews.bean.GankData;
import com.myxh.developernews.bean.ZhihuDetailData;
import com.myxh.developernews.bean.ZhihuHotData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by asus on 2016/9/19.
 */
public interface ZhihuApi {

    @GET("3/news/hot")
    Observable<ZhihuHotData> getZhihuHotData();

    @GET("4/news/{newsId}")
    Observable<ZhihuDetailData> getZhihuDetailData(@Path("newsId")int newsId);

}
