package com.cabrera.elwin.weatherapp.data;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Elwin on 6/6/2016.
 */
public class LocationResults implements JSONPopulator {

    private String address;

    public String getAddress() {
        return address;
    }

    @Override
    public void populate(JSONObject data) {
        address = data.optString("formatted_address");
    }

    @Override
    public JSONObject toJSON() {
        JSONObject data = new JSONObject();

        try {
            data.put("formatted_address", address);
        } catch (JSONException e) {}

        return data;
    }
}
