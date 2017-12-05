package com.example.sherly.pesantriat.service;

import com.example.sherly.pesantriat.model.DataDokter;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by sherly on 05/12/2017.
 */

public class ApiService {
    public static String BASE_URL = "http://kkidz.ayohijab.com";

    public static PostService service_post = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(ApiService.PostService.class);

    public static GetService service_get = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(ApiService.GetService.class);

    public static DeleteService service_delete = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(ApiService.DeleteService.class);

    public interface GetService {
        @GET("/dokter/api")
        Call<DataDokter> getDokter();

        @GET("/dokter/api/{id}")
        Call<DataDokter> getDetailDokter();
    }

    public interface PostService {

    }

    public interface DeleteService {

    }
}
