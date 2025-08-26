package com.nacs.staticandfinal.holidays;

public class Holidays {
    private final int serialNo;
    private final String holidayName;
    private final String holidayDate;
    private final boolean governmentHoliday;
    private final boolean collectorDeclareHoliday;

    public Holidays(int serialNo, String holidayName, String holidayDate, boolean governmentHoliday,
                    boolean collectorDeclareHoliday) {
        super();
        this.serialNo = serialNo;
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.governmentHoliday = governmentHoliday;
        this.collectorDeclareHoliday = collectorDeclareHoliday;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public boolean isGovernmentHoliday() {
        return governmentHoliday;
    }

    public boolean isCollectorDeclareHoliday() {
        return collectorDeclareHoliday;
    }

    @Override
    public String toString() {
        return "serialNo=" + serialNo + "\n" +
               "holidayName=" + holidayName + "\n" +
               "holidayDate=" + holidayDate + "\n" +
               "governmentHoliday=" + governmentHoliday + "\n" +
               "collectorDeclareHoliday=" + collectorDeclareHoliday;
    }
}
