package com.witype.Dragger.di.component;

import android.app.Application;

import com.witype.Dragger.di.module.ClientModule;
import com.witype.Dragger.integration.IRequestManager;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ClientModule.class})
public interface AppComponent {

    void inject(Application application);

    IRequestManager requestManager();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}