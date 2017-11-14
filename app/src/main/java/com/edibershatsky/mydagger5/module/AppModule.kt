package com.edibershatsky.mydagger5.module

import com.edibershatsky.mydagger5.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Edi Bershatsky on 13/11/2017.
 */

@Module
class AppModule (val app: App){
    @Provides
    @Singleton
    fun provideApp() = app
}