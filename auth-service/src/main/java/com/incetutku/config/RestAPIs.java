package com.incetutku.config;

public class RestAPIs {

    private RestAPIs() {
    }

    public static final String DEVELOPER = "/dev";
    public static final String TEST = "/test";
    public static final String PRODUCTION = "/prod";

    public static final String AUTH_SERVICE_VERSION = "/v1";
    public static final String AUTH_SERVICE = DEVELOPER + AUTH_SERVICE_VERSION + "/auth";
    public static final String AUTH_SERVICE_LOGIN = "/login";
    public static final String AUTH_SERVICE_REGISTER = "/register";


}
