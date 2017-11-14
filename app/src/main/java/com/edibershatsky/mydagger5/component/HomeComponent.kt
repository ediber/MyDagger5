package com.edibershatsky.mydagger5.component

import com.edibershatsky.mydagger5.HomeActivity
import com.edibershatsky.mydagger5.module.HomeModule
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by Edi Bershatsky on 14/11/2017.
 */

@Singleton
@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    fun inject(activity: HomeActivity)
}