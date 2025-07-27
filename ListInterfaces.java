package com.java.networkprogramming.labreport;

import java.net.*;
import java.util.*;

public class ListInterfaces {
    public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        while (nets.hasMoreElements()) {
            System.out.println(nets.nextElement().getName());
        }
    }
}
