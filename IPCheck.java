package com.java.networkprogramming.labreport;


import java.net.*;

public class IPCheck {
    public static void main(String[] args) throws Exception {
        InetAddress ipv4 = InetAddress.getByName("192.168.0.1");
        InetAddress ipv6 = InetAddress.getByName("2001:db8::1");

        System.out.println("IPv4 is: " + (ipv4 instanceof Inet4Address));
        System.out.println("IPv6 is: " + (ipv6 instanceof Inet6Address));
    }
}