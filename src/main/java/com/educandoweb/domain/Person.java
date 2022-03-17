package com.educandoweb.domain;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull private Integer id;
    @NonNull private String nome;
    @NonNull private String email;
}
