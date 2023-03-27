package com.Ecommerce.Amaze.Service;

import com.Ecommerce.Amaze.Convertor.CustomerConvertor;
import com.Ecommerce.Amaze.Model.Cart;
import com.Ecommerce.Amaze.Model.Customer;
import com.Ecommerce.Amaze.Repository.CustomerRepository;
import com.Ecommerce.Amaze.RequestDto.CustomerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public String addCustomer(CustomerRequestDto customerRequestDto)
    {
        Customer customer= CustomerConvertor.customerRequestDtoToCustomer(customerRequestDto);


        //allocate cart to customer
        Cart cart=new Cart();
        cart.setCartTotal(0);
        cart.setCustomer(customer);

        //set cart in customer
        customer.setCart(cart);
         customerRepository.save(customer);
         return "welcome to amaze";

    }
}
