package com.Ecommerce.Amaze.RequestDto;

import com.Ecommerce.Amaze.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {
    private String cardNo;
    private CardType cardType;

}
