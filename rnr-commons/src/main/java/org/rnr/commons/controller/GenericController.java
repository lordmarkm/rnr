package org.rnr.commons.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author mbmartinez
 */
public class GenericController {

    protected <E> ResponseEntity<E> ok(E response) {
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
