package com.deathmanwowgmail.zhkh;
import java.sql.*;


public class Programm {

    public static final String URL="jdbc:mysql://localhost:3306/spb";
    public static final String USERNAME="root";
    public static final String PUSSWORD=".12345qwert.";

    static public void main(String[] arg) throws Exception{
        try {
            HttpServer.mainHTTP();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}