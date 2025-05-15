package com.example.tryoutpas_02_10;

import com.google.gson.annotations.SerializedName;

public class TimModel {
    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strStadium")
    private String strStadium;

    @SerializedName("strTeamShort")
    private String strTeamShort;

    @SerializedName("strBadge")
    private String strBadge;

    public String getStrTeam() {
        return strTeam;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public String getStrTeamShort() {
        return strTeamShort;
    }

    public String getStrBadge(){
        return strBadge;
    }
}
