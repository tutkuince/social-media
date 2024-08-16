package com.incetutku.config;

public class ResAPIs {
    private ResAPIs() {
    }

    public static final String DEVELOPER = "/dev";
    public static final String TEST = "/test";
    public static final String PRODUCTION = "/prod";

    public static final String USER_SERVICE_VERSION = "/v1";
    public static final String USER_SERVICE = DEVELOPER + USER_SERVICE_VERSION + "/user-profile";
    public static final String USER_SERVICE_CREATE_USER = "/create-user";
    public static final String USER_SERVICE_GET_USER_LIST = "/get-all";
}
