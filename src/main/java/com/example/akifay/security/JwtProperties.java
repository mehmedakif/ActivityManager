package com.example.akifay.security;

public class JwtProperties {
    public static final String SECRET = "akifay";
    public static final long EXPIRATION_TIME = 423_000_000; // 5 gün
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}