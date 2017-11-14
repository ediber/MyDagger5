package com.edibershatsky.mydagger5.component

import com.edibershatsky.mydagger5.App
import com.edibershatsky.mydagger5.module.AppModule
import com.edibershatsky.mydagger5.module.HomeModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Edi Bershatsky on 13/11/2017.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: App)

    fun plus(homeModule: HomeModule): HomeComponent
}