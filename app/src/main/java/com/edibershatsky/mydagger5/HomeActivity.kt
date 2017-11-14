package com.edibershatsky.mydagger5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.edibershatsky.mydagger5.module.HomeModule
import javax.inject.Inject
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

class HomeActivity : AppCompatActivity() {

    ///////////////////////////////////
//    @Inject app:App
    ///////////////////////////////////
    val component by lazy {
        app.component.plus(HomeModule(this)) }

//    var app : App? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)
    }
}
