package com.cabrera.elwin.weatherapp.listener;

import com.cabrera.elwin.weatherapp.data.Channel;

/**
 * Created by Elwin on 6/6/2016.
 */
public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
