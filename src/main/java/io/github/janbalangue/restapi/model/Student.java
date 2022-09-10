package io.github.janbalangue.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Document(collection = "students")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String grade;
}
