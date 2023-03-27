package com.Ecommerce.Amaze.ResponseDto;

import com.Ecommerce.Amaze.RequestDto.CardDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardResponseDto {
    private String name;
     private List<CardDto> cardDtos;
}
