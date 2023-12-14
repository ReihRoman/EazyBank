package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Schema(
        name = "Error response",description = "Schema to hold error response info"
)
@Data@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(description = "Error represent path where error happened")
    private String apiPath;

    @Schema(description = "Error code representing the error happened")
    private HttpStatus errorCode;

    @Schema(description = "Error message represent the error happened")
    private String errorMessage;

    @Schema(description = "Error message represent when error happened")
    private LocalDateTime errorTime;
}
