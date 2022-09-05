package ru.sberbank.shopping.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @NotNull
    private String sigmaLogin;

    @NotNull
    private String name;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ITEM { ")
                .append("ID=").append(sigmaLogin)
                .append(", NAME=").append(name)
                .append(" }");
        return sb.toString();
    }
}
