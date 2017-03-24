package com.uoowo.bean;

public class BbsTableDayKey {
    private Short year;

    private Byte month;

    private Byte day;

    private String table;

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table == null ? null : table.trim();
    }
}