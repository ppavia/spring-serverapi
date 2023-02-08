package ppa.lab.spring.springserverwww.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import ppa.lab.spring.springserverwww.exception.RestResponseBean;

import java.time.LocalDateTime;

public class HttpResponseUtil {

    public static <T> ResponseEntity<T> buildUTF8Response(T response) {
        return ResponseEntity.ok()
                .headers(setContentTypeJsonUTF8(new HttpHeaders()))
                .body(response);
    }

    public static <T> ResponseEntity<RestResponseBean<T>> buildUTF8ResponseBean(T response, String msg, String location, String reason) {
        RestResponseBean responseBean = new RestResponseBean(
                LocalDateTime.now()
                , msg
                , location
                , reason
                , response);
        return ResponseEntity.ok()
                .headers(setContentTypeJsonUTF8(new HttpHeaders()))
                .body(responseBean);
    }

    public static HttpHeaders setContentTypeJsonUTF8(HttpHeaders responseHeaders) {
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON + "; charset=UTF-8");
        return responseHeaders;
    }

    public static HttpHeaders setCrossDomain(HttpHeaders responseHeaders) {
        ResponseEntity.HeadersBuilder response = ResponseEntity.noContent();
        responseHeaders.set("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        responseHeaders.set("Access-Control-Max-Age", "3600");
        responseHeaders.set("Access-Control-Allow-Headers",
                "x-requested-with, " + "Authorization," + " content-type, " + "If-Modified-Since, " + "Cache-Control, " + "Pragma");
        return responseHeaders;
    }
}
