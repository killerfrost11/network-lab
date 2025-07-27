package com.java.networkprogramming.labreport;

import java.net.*;

public class URLEncoderExample {
    public static void main(String[] args) throws Exception {
        String data = "name=rastrika&email=test@example.com";
        String encoded = URLEncoder.encode(data, "UTF-8");
        System.out.println(encoded);
    }
}
