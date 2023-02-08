package ppa.lab.spring.springserverwww.exception;

import java.time.LocalDateTime;

public class RestResponseBean<T> {
    private LocalDateTime dateTime;
    private String errorMsq;
    private String location;
    private String reason;
    private T data;

    public RestResponseBean(LocalDateTime dateTime, String errorMsq, String location, String reason) {
        this.dateTime = dateTime;
        this.errorMsq = errorMsq;
        this.location = location;
        this.reason = reason;
    }

    public RestResponseBean(LocalDateTime dateTime, String errorMsq, String location, String reason, T data) {
        this.dateTime = dateTime;
        this.errorMsq = errorMsq;
        this.location = location;
        this.reason = reason;
        this.data = data;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getErrorMsq() {
        return errorMsq;
    }

    public void setErrorMsq(String errorMsq) {
        this.errorMsq = errorMsq;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
