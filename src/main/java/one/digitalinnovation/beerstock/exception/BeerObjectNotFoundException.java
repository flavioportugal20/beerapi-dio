package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerObjectNotFoundException extends Exception {

    public BeerObjectNotFoundException(String beerName) {
        super(String.format("Beer with name %s not found in the system.", beerName));
    }

    public BeerObjectNotFoundException(Long id) {
        super(String.format("Beer with id %s not found in the system.", id));
    }
}
