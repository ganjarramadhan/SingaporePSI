package com.ganjarramadhan.singaporepsi.dagger.components;

import android.content.Context;
import com.ganjarramadhan.singaporepsi.dagger.module.AppModule;
import com.ganjarramadhan.singaporepsi.dagger.module.NetworkModule;
import com.ganjarramadhan.singaporepsi.dagger.scope.AppScope;
import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by ganjarramadhan on 7/20/17.
 */

@AppScope @Component(modules = { AppModule.class, NetworkModule.class })
public interface AppComponent {

  Retrofit retrofit();

  Context context();

  OkHttpClient okHttpClient();

}
