package com.java.networkprogramming.labreport;

import java.net.InetAddress;

public class IpAddressDisplay {
    public static void main(String[] args) throws Exception {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}
