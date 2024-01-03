package com.javamasters.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CoreResponseDto {
    private Boolean operationSuccessful;
    private String message;
}
