package com.mycompany.mavenproject1;

/**
 *
 * @author HP
 */

 import java.net.InetAddress;
public class InetAddressMethods {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();

            System.out.println("Host Name      : " + address.getHostName());
            System.out.println("Host Address   : " + address.getHostAddress());
            System.out.println("Canonical Host : " + address.getCanonicalHostName());
            System.out.println("Is Loopback?   : " + address.isLoopbackAddress());
            System.out.println("Is Site Local? : " + address.isSiteLocalAddress());
            System.out.println("Is Any Local?  : " + address.isAnyLocalAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

