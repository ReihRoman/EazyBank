package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Name of The Customer",example = "EazyBytes")
    @NotEmpty(message = "Name cannot by empty")
    @Size(min = 3,max = 30,message = "Name should be min 3 characters max 30")
    private String name;

    @Schema(description = "Email address of the customer ", example = "example@mail.com")
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email address should be a valid")
    private String email;

    @Schema(description = "Mobile Number of the customer " , example = "1234567890")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be a 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
