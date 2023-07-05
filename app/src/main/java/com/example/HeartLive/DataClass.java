package com.example.HeartLive;

public class DataClass {
    private String dataDia;
    private String dataSys;
    private String dataHrt;
    private String dataTime;
    private String dataDate;
    private String dataCom;

    public String getDataDia() {
        return dataDia;
    }

    public String getDataSys() {
        return dataSys;
    }

    public String getDataHrt() {
        return dataHrt;
    }

    public String getDataTime() {
        return dataTime;
    }

    public String getDataDate() {
        return dataDate;
    }

    public String getDataCom() {
        return dataCom;
    }

    public DataClass(String dataDia, String dataSys, String dataHrt, String dataTime, String dataDate, String dataCom) {
        this.dataDia = dataDia;
        this.dataSys = dataSys;
        this.dataHrt = dataHrt;
        this.dataTime = dataTime;
        this.dataDate = dataDate;
        this.dataCom = dataCom;
    }
    public DataClass(){

    }
}

