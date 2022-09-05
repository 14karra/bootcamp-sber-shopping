package ru.sberbank.shopping.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {

    @NotNull
    private UUID id;

    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @PositiveOrZero
    private Integer quantity;

    @NotNull
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    @PositiveOrZero
    private BigDecimal amount;

    @NotNull
    @DateTimeFormat
    private LocalDate purchaseDate;

    @NotNull
    private Item item;

    @NotNull
    private Customer customer;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PURCHASE { ")
                .append("ID=").append(id)
                .append(", QUANTITY=").append(quantity)
                .append(", AMOUNT=").append(amount)
                .append(", PURCHASE_DATE=").append(purchaseDate)
                .append(", ITEM=").append(item == null ? null : item.getName())
                .append(", CUSTOMER=").append(customer == null ? null : customer.getName() + " " + customer.getLastName())
                .append(" }");
        return sb.toString();
    }
}
