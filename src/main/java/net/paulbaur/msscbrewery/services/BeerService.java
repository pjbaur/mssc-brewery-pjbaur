package net.paulbaur.msscbrewery.services;

import net.paulbaur.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
