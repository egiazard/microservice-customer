package org.mkzaman.microservice.customer.listener;

import org.bson.types.ObjectId;
import org.mkzaman.microservice.customer.domain.Customer;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerListener implements BeforeConvertCallback<Customer> {

    @Override
    public Customer onBeforeConvert(Customer entity, String collection) {
        System.out.println("Customer Name = " + entity.getLastName());
        return entity;
    }
}
