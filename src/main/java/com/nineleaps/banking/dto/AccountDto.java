package com.nineleaps.banking.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@Getter
@Setter
@ApiModel(description = "All the details related to Account")
@XmlRootElement //to support xml based req and res
public class AccountDto {

    @ApiModelProperty(notes = "The account id", hidden = true)
    private Integer id;

    @NotBlank(message="Account name cannot be empty.")
    @ApiModelProperty(notes = "Account name")
    private String name;

    @NotBlank(message="Account type cannot be empty.")
    @ApiModelProperty(notes = "Account type")
    private String type;

    @NotBlank(message="Account opening date cannot be null")
    @ApiModelProperty(notes = "Account opening date")
    @Valid
    private LocalDate openDate;
}
