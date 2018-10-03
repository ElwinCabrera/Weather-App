package com.cabrera.elwin.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Elwin on 6/6/2016.
 */
public interface JSONPopulator {

    void populate(JSONObject data);
    JSONObject toJSON();
}
