package com.invoiceportal.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBtest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://aws-0-ap-northeast-1.pooler.supabase.com:5432/postgres";
        String user = "postgres.mwegrrrmlodclexxiluf";
        String password = "@Pratik421401";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTED SUCCESSFULLY!");
            conn.close();
        } catch (Exception e) {
            System.out.println("FAILED: " + e.getMessage());
            e.printStackTrace();
        }
    }
}