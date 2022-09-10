package io.github.janbalangue.restapi.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
public class StudentDTO {
    private String id;
    private String firstName;
    private String lastName;

    public enum Grade {
        A, B, C, D, F
    }
}
