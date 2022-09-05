package ru.sberbank.shopping.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sberbank.shopping.dto.Customer;
import ru.sberbank.shopping.exception.ApiError;


@RequestMapping(value = "/api/v1/customer")
public interface CustomerApi {

    @Operation(summary = "Получение информации о клиенте по его идентификатору (сигма логин)", operationId = "getCustomerBySigmaLogin", tags = {"Клиент"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Информации о клиенте получено успешно", content = {@Content(schema = @Schema(implementation = Customer.class))}),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Клиент не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @GetMapping(path = "/{sigmaLogin}", produces = {MediaType.APPLICATION_JSON_VALUE})
    Customer getCustomerBySigmaLogin(@PathVariable String sigmaLogin);

    @Operation(summary = "Обновление данных о клиенте", operationId = "putCustomerInfo", tags = {"Клиент"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Данные о клиенте обновлены успешно"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Клиент не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @PutMapping(path = "/{sigmaLogin}")
    void putCustomerInfo(@PathVariable String sigmaLogin,
                         @RequestBody Customer customer);

    @Operation(summary = "Удаление клиента", operationId = "deleteCustomer", tags = {"Клиент"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Клиент удален успешно"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Клиент не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @DeleteMapping(path = "/{sigmaLogin}")
    void deleteCustomer(@PathVariable String sigmaLogin);
}
