package com.java.networkprogramming.labreport;

import java.net.*;

public class URLDecoderExample {
    public static void main(String[] args) throws Exception {
        String encoded = "name%3Drastrika%26email%3Dtest%40example.com";
        String decoded = URLDecoder.decode(encoded, "UTF-8");
        System.out.println(decoded);
    }
}
