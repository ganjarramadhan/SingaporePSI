package com.ganjarramadhan.singaporepsi.dagger.module;

import android.app.Application;
import android.content.Context;
import com.ganjarramadhan.singaporepsi.dagger.scope.AppScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ganjarramadhan on 7/20/17.
 */

@Module public class AppModule {

  private final Context context;

  public AppModule(Application application) {
    this.context = application.getApplicationContext();
  }

  @AppScope @Provides public Context context() {
    return context;
  }

}
