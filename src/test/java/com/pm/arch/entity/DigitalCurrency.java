package com.pm.arch.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DigitalCurrency {

    private String currency;

    private int volume;
}
