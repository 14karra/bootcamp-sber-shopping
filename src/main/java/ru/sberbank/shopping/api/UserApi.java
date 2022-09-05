package ru.sberbank.shopping.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sberbank.shopping.dto.request.UserRegistrationRequest;
import ru.sberbank.shopping.exception.ApiError;

@RequestMapping(value = "/api/v1/user")
public interface UserApi {

    @Operation(summary = "Создпние нового клиента", operationId = "postUserRegistrationRequest", tags = {"Пользователь"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Пользователь успешно зарегистрирован"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @PostMapping(path = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    void postUserRegistrationRequest(@RequestBody() UserRegistrationRequest userRegistrationRequest);
}
