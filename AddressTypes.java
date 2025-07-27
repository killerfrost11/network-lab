package com.java.networkprogramming.labreport;

import java.net.*;

public class AddressTypes {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        System.out.println("Any Local: " + addr.isAnyLocalAddress());
        System.out.println("Loopback: " + addr.isLoopbackAddress());
        System.out.println("Link Local: " + addr.isLinkLocalAddress());
        System.out.println("Site Local: " + addr.isSiteLocalAddress());
        System.out.println("Multicast: " + addr.isMulticastAddress());
    }
}

