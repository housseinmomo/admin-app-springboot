package sn.isi.adminapp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIException {
    // Va nous permettre de renvoyer un les messages d'erreurs aux clients
    String message;
    HttpStatus status;
    LocalDateTime timestamp;
}
