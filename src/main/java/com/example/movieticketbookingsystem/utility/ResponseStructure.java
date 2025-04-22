package com.example.movieticketbookingsystem.utility;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseStructure<T> {
    private int Statuscode;
    private String message;
    private T data;

}
