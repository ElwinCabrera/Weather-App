package com.cabrera.elwin.weatherapp.service;

import com.cabrera.elwin.weatherapp.data.Channel;

/**
 * Created by Elwin on 6/6/2016.
 */
public interface YahooWeatherCallback {
    void serviceSuccess(Channel channel);
    void serviceFalure(Exception ex);
}
