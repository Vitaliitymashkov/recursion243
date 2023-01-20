package org.example;

import org.example.service.Service;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Output is %s%n", Service.go(3, 5));
    }
}