package ru.sberbank.shopping.dto.request;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    @NotNull
    private UUID productId;

    @NotNull
    private Long quantity;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PURCHASE { ")
                .append(", PRODUCT_ID=").append(productId.toString())
                .append(", QUANTITY=").append(quantity)
                .append(" }");
        return sb.toString();
    }
}
