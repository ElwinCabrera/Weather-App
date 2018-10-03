package com.cabrera.elwin.weatherapp.listener;

import com.cabrera.elwin.weatherapp.data.LocationResults;

/**
 * Created by Elwin on 6/6/2016.
 */
public interface GeocodingServiceListener {

    void geocodeSuccess(LocationResults location);

    void geocodeFailure(Exception exception);
}
