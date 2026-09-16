package adopet.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(AdocaoException.class)
    public ResponseEntity<ResponseError> adocaoException(AdocaoException ex) {
        ResponseError response = new ResponseError(
                ex.getMessage(),
                HttpStatus.BAD_REQUEST,

        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
