package com.example.finedust.data.services

import com.example.finedust.data.models.monitoringstation.MonitoringStation
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AirKoreaApiService {

    @GET
    suspend fun getNearbyMonitoringStation(
        @Query("tmX") tmX : Double,
        @Query("tmY") tmY : Double
    ): Response<MonitoringStationResponse>
}