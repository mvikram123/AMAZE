package com.Ecommerce.Amaze.Service;

import com.Ecommerce.Amaze.Exception.CustomerNotFoundException;
import com.Ecommerce.Amaze.Model.Card;
import com.Ecommerce.Amaze.Model.Customer;
import com.Ecommerce.Amaze.Repository.CardRepository;
import com.Ecommerce.Amaze.Repository.CustomerRepository;
import com.Ecommerce.Amaze.RequestDto.CardDto;
import com.Ecommerce.Amaze.RequestDto.CardRequestDto;
import com.Ecommerce.Amaze.ResponseDto.CardResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    @Autowired
    CustomerRepository customerRepository;
//    @Autowired
   // CardRepository cardRepository;
    public CardResponseDto addCard(CardRequestDto cardRequestDto) throws CustomerNotFoundException {
        Customer customer;
        try{
            customer= customerRepository.findById(cardRequestDto.getCustomerId()).get();
        }
        catch (Exception e)
        {
            throw new CustomerNotFoundException("customerId is Invalid");

        }
        // Make a card object
        Card card=Card.builder()
                .cardNo(cardRequestDto.getCardNo())
                .cardType(cardRequestDto.getCardType())
                .cvv(cardRequestDto.getCvv())
                .customer(customer)
                .build();


                // add the card to current card list
                customer.getCard().add(card);


                customerRepository.save(customer);  // save both customer and card

                //prepare response dto

                CardResponseDto cardResponseDto=new CardResponseDto();
                cardResponseDto.setName(customer.getName());

                // convert every card to carddto
                List<CardDto> cardDtoList=new ArrayList<>();
                for(Card card1: customer.getCard())
                {
                    CardDto cardDto=new CardDto();
                    cardDto.setCardNo(card1.getCardNo());
                    cardDto.setCardType(card1.getCardType());
                    cardDtoList.add(cardDto);
                }

                cardResponseDto.setCardDtos(cardDtoList);
                return cardResponseDto;

    }

}
