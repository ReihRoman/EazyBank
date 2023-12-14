package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be a 10 digits")
    @Schema(description = "Account Number of EazyBank account")
    private Long accountNumber;

    @Schema(description = "Account Type of EazyBank acoout" , example = "Saving")
    @NotEmpty(message = "AccountType cannot be a null or empty")
    private String accountType;

    @Schema(description = "EazyBank BranchAdress")
    @NotEmpty(message = "branchAddress cannot be a null or empty")
    private String branchAddress;
}
