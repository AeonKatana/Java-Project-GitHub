package com.example.test.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    
    private String firstname;
    private String lastname;

    public String fullname(){
        return firstname + " " + lastname;
    }

}
