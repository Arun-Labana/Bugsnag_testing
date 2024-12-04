package com.example.myapplication

import android.app.Application
import com.bugsnag.android.Bugsnag
import com.bugsnag.android.performance.BugsnagPerformance
import com.bugsnag.android.performance.PerformanceConfiguration

class AFMobileApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Bugsnag.start(this)
        BugsnagPerformance.start(PerformanceConfiguration.load(this))
    }

    companion object {
        init {
            BugsnagPerformance.reportApplicationClassLoaded()
        }
    }
}