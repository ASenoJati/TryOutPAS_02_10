package com.example.tryoutpas_02_10;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KlasemenResponse {
    @SerializedName("table")
    private List<KlasemenModel> klasemen;

    public List<KlasemenModel> getKlasemenLaliga() {
        return klasemen;
    }
}
