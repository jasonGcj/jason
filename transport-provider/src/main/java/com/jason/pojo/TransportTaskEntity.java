package com.jason.pojo;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by GCJ on 2019/5/16 15:29
 */
public class TransportTaskEntity implements Serializable {

    private String id;

    private String driverName;

    private String driverPhone;

    private String driverCode;

    private String vehicleNo;

    private Date creatTime;

    @Override
    public String toString() {
        return "TransportTaskEntity{" +
                "id='" + id + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", driverCode='" + driverCode + '\'' +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
