package ru.sberbank.shopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbank.shopping.api.PurchaseApi;
import ru.sberbank.shopping.dto.Purchase;
import ru.sberbank.shopping.dto.request.PurchaseRequest;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class PurchaseController implements PurchaseApi {
    @Override
    public void postPerformPurchase(PurchaseRequest purchaseRequest) {

    }

    @Override
    public Purchase getPurchaseById(UUID purchaseId) {
        return null;
    }

    @Override
    public void putPurchaseInfo(UUID purchaseId, Purchase purchase) {

    }

    @Override
    public void cancelPurchase(UUID purchaseId) {

    }
}
