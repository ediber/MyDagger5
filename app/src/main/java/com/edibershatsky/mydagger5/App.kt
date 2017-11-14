package com.edibershatsky.mydagger5

import android.app.Application
import com.edibershatsky.mydagger5.component.AppComponent
import com.edibershatsky.mydagger5.component.DaggerAppComponent
import com.edibershatsky.mydagger5.module.AppModule

/**
 * Created by Edi Bershatsky on 13/11/2017.
 */
class App : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}