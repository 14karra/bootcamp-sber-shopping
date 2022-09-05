package ru.sberbank.shopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbank.shopping.api.UserApi;
import ru.sberbank.shopping.dto.request.UserRegistrationRequest;

@RequiredArgsConstructor
@RestController
public class UserController implements UserApi {
    @Override
    public void postUserRegistrationRequest(UserRegistrationRequest userRegistrationRequest) {

    }
}
