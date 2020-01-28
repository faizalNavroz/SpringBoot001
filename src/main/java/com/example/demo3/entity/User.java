package com.example.demo3.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

    private static final long serialVersionUID = -5916357204577734153L;

    private int userId;
    private String userName;
    private Map<Integer,String>response = new HashMap<>();
    private Map<String,Account>accountMap = new HashMap<>();

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<Integer, String> getResponse() {
        return response;
    }

    public void setResponse(Map<Integer, String> response) {
        this.response = response;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }

    public User() {

    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }


}

