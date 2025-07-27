package com.java.networkprogramming.labreport;

import java.io.*;
import java.net.*;

public class ReadURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = br.readLine()) != null) System.out.println(line);
    }
}
