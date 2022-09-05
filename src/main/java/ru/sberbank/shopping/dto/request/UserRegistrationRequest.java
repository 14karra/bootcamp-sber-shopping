package ru.sberbank.shopping.dto.request;

import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
public class UserRegistrationRequest {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private Role role;

    public UserRegistrationRequest() {
    }

    public UserRegistrationRequest(@NotNull String username, @NotNull String password, @NotNull Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("USER { ")
                .append(", USERNAME=").append(username)
                .append(", PASSWORD=").append(password)
                .append(", ROLE=").append(role)
                .append(" }");
        return sb.toString();
    }
}
