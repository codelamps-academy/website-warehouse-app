package com.codelamps.enumeration;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 06/08/23
 * Time: 14.57
 * description: website-warehouse-smk-giripuro-sumpiuh
 */

public enum OS {

    WINDOWS,
    MAC,
    LINUX,
    ANDROID,
    IPHONE,
    UNKNOWN;

    public static OS valueOf(HttpServletRequest request){
        final String userAgent = request.getHeader("User-Agent");
        final OS toReturn;

        if (userAgent == null || userAgent.isEmpty()){
            toReturn = UNKNOWN;
        } else if (userAgent.toLowerCase().contains("windows")) {
            toReturn = WINDOWS;
        } else if (userAgent.toLowerCase().contains("mac")) {
            toReturn = MAC;
        } else if (userAgent.toLowerCase().contains("linux")) {
            toReturn = LINUX;
        } else if (userAgent.toLowerCase().contains("android")) {
            toReturn = ANDROID;
        } else if (userAgent.toLowerCase().contains("iphone")) {
            toReturn = IPHONE;
        } else {
            toReturn = UNKNOWN;
        }

        return toReturn;
    }
}
