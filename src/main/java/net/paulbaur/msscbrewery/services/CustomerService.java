package net.paulbaur.msscbrewery.services;

import net.paulbaur.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
