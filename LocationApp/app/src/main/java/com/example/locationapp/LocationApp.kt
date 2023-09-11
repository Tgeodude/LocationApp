package com.example.locationapp

import android.app.Application
import com.yandex.mapkit.MapKitFactory

/**
 *
 *
 * @author Виктор Щеглов on 15.08.2023
 */
class LocationApp: Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("3c414c81-2085-44c3-8775-676a8228f46b")
    }
}