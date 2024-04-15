package com.muzej.pris.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Wiki sa traženim naslovom ne postoji!")
public class WikiIsNotFound extends RuntimeException {

	private static final long serialVersionUID = 1885482126985242293L;

}
