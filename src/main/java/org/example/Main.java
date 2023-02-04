package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a',' d MMMM yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        System.out.println("Hello world! Jest teraz: " + dtf.format(now));
    }
}