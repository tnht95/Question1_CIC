package com.cic.test1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Csv {
    private String athleteName;
    private Long score;
}
