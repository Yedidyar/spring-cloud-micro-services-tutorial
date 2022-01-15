package com.microservicestutorial.eurekaserver.customer;

public record CustomerRegistrationRequest(String lastName,
                                          String firstName,
                                          String email) {
}
