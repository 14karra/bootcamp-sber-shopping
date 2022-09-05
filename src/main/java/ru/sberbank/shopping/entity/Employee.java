package ru.sberbank.shopping.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.UUID;

public class Employee {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    @DateTimeFormat
    private Date birthday;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CUSTOMER { ")
                .append("ID=").append(id)
                .append(", NAME=").append(name)
                .append(", LAST_NAME=").append(lastName)
                .append(", BIRTHDAY=").append(birthday)
                .append(" }");
        return sb.toString();
    }
}
