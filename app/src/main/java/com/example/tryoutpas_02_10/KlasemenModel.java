package com.example.tryoutpas_02_10;

import com.google.gson.annotations.SerializedName;

public class KlasemenModel {
    @SerializedName("intRank")
    private String intRank;

    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("intWin")
    private String intWin;

    @SerializedName("intLoss")
    private String intLoss;

    @SerializedName("intDraw")
    private String intDraw;

    @SerializedName("intGoalDifference")
    private String intGoalDifference ;

    @SerializedName("intPoints")
    private String intPoints ;

    @SerializedName("strBadge")
    private  String strBadge;

    public KlasemenModel(String intRank, String strTeam, String intWin, String intLoss, String intDraw,
                          String intGoalDifference, String intPoints, String strBadge) {
        this.intRank = intRank;
        this.strTeam = strTeam;
        this.intWin = intWin;
        this.intLoss = intLoss;
        this.intDraw = intDraw;
        this.intGoalDifference = intGoalDifference;
        this.intPoints = intPoints;
        this.strBadge = strBadge;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getIntRank() {
        return intRank;
    }

    public String getIntWin() {
        return intWin;
    }

    public String getIntLoss() {
        return intLoss;
    }

    public String getIntDraw() {
        return intDraw;
    }


    public String getIntGoalDifference() {
        return intGoalDifference;
    }

    public String getIntPoints() {
        return intPoints;
    }

    public String getStrBadge(){
        return strBadge;
    }
}
