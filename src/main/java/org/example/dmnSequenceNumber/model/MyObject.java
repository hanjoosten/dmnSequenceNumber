package org.example.dmnSequenceNumber.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class MyObject {
    Integer sequenceNumber;
    String foo;
    LocalDate bar;
}
