package vnpt.spring.kafka.demo.spring.kafka.common;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Data
@Setter
@RequiredArgsConstructor
@Accessors(fluent = true)
public class ResponseModel implements Serializable {
    private Integer statusCode;
    private String message;
    private Object data = new Object();

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}