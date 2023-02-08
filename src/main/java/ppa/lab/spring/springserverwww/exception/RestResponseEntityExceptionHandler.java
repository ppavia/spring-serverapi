package ppa.lab.spring.springserverwww.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestResponseEntityExceptionHandler<T> extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { RestException.class })
    protected ResponseEntity<RestResponseBean<T>> handleHttpException (RestException ex, WebRequest request) {
        RestResponseBean<T> exceptionBean = new RestResponseBean<T>(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false),
                ex.getHttpStatus().getReasonPhrase()

        );
        return new ResponseEntity<>(exceptionBean, ex.getHttpStatus());
    }
}