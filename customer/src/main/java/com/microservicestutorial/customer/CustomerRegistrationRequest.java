package com.microservicestutorial.customer;

public record CustomerRegistrationRequest(String lastName,
                                          String firstName,
                                          String email) {
}
