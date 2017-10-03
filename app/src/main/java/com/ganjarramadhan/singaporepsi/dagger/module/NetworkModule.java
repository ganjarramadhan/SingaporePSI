package com.ganjarramadhan.singaporepsi.dagger.module;

import android.content.Context;
import com.ganjarramadhan.singaporepsi.constant.AppConstant;
import com.ganjarramadhan.singaporepsi.dagger.scope.AppScope;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

/**
 * Created by ganjarramadhan on 7/18/17.
 * ganjar.ramadhan05@gmail.com
 */

@Module public class NetworkModule {

  @Provides @AppScope public Retrofit retrofit(OkHttpClient mClient, Gson gson) {
    return new Retrofit.Builder().baseUrl(AppConstant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(mClient)
        .build();
  }

  @Provides @AppScope public Gson gson() {
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    return gsonBuilder.create();
  }

  @Provides @AppScope public OkHttpClient okHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, Cache cache) {
    return new OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .cache(cache)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build();
  }

  @Provides @AppScope public HttpLoggingInterceptor httpLoggingInterceptor() {
    HttpLoggingInterceptor interceptor =
        new HttpLoggingInterceptor(message -> Timber.tag("PopularNow").d(message));
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    return interceptor;
  }

  @Provides @AppScope public Cache cache(File directory) {
    return new Cache(directory, 10 * 1000 * 1000); // 10MB cache
  }

  @Provides @AppScope public File cacheFile(Context context) {
    File file = new File(context.getCacheDir(), "singapore_psi");
    file.mkdirs();
    return file;
  }
}
