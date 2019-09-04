package com.mayank.flikrwallpaperapplication;

import com.mayank.flikrwallpaperapplication.models.PhotoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/services/rest/?method=flickr.photos.getRecent&per_page=20&page=1&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s")
    Call<PhotoResponse> getAllPhotos();
}
