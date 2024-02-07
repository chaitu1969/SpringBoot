package com.chaitu.RESTService.rest;

public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public  StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String message, long timeStamp){
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;

    }

    public int getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public long getTimeStamp(){
        return timeStamp;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;
    }

}
