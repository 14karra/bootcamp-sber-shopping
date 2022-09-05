package ru.sberbank.shopping.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @NotNull
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    @DateTimeFormat
    private Date birthday;

    @NotNull
    private String username;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CUSTOMER { ")
                .append("ID=").append(id)
                .append(", NAME=").append(name)
                .append(", LAST_NAME=").append(lastName)
                .append(", BIRTHDAY=").append(birthday)
                .append(", USERNAME=").append(username)
                .append(" }");
        return sb.toString();
    }
}
