package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
@Schema(name = "Response",description = "Schema to hold successful response info")
@Data@AllArgsConstructor
public class ResponseDTO {

    @Schema(description = "Status code in response ",example = "200")
    private String statusCode;

    @Schema(description = "Status message in response ", example = "Request processed succssfully")
    private String StatusMsg;
}
