package ru.sberbank.shopping.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sberbank.shopping.dto.Purchase;
import ru.sberbank.shopping.dto.request.PurchaseRequest;
import ru.sberbank.shopping.exception.ApiError;

import java.util.UUID;

@RequestMapping(value = "/api/v1/purchase")
public interface PurchaseApi {

    @Operation(summary = "Создание нового заказы", operationId = "postPerformPurchase", tags = {"Заказ"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Заказ создан успешно"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    void postPerformPurchase(@RequestBody PurchaseRequest purchaseRequest);

    @Operation(summary = "Получение информации о заказе по его идентификатору", operationId = "getCustomerBySigmaLogin", tags = {"Заказ"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Информации о заказе получено успешно", content = {@Content(schema = @Schema(implementation = Purchase.class))}),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Клиент не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @GetMapping(path = "/{purchaseId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    Purchase getPurchaseById(@PathVariable UUID purchaseId);

    @Operation(summary = "Редактирование заказа", operationId = "putPurchaseInfo", tags = {"Заказ"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Заказ обновлен успешно"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Заказ не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @PutMapping(path = "/{purchaseId}")
    void putPurchaseInfo(@PathVariable UUID purchaseId,
                         @RequestBody Purchase purchase);

    @Operation(summary = "Отмена заказа", operationId = "cancelPurchase", tags = {"Заказ"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Заказ отменен успешно"),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(schema = @Schema(implementation = ApiError.class))}),
                    @ApiResponse(responseCode = "404", description = "Заказ не был найден", content = {@Content(schema = @Schema(implementation = ApiError.class))})
            })
    @PutMapping(path = "/{purchaseId}/actions/cancel")
    void cancelPurchase(@PathVariable UUID purchaseId);
}
