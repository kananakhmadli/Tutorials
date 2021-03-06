package com.akh.service;

import com.akh.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;
    }

    public List<Customer> getCustomer() {
        return customerList;
    }

    public Customer getCustomer(int customerId) {
        return customerList.stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();

    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customerList.stream()
                .forEach(c -> {
                    if (c.getCustomerId() == customer.getCustomerId()) {
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }

                });
        return customerList.stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public void deleteCustomer(int customerId) {
        customerList.stream()
                .forEach(c -> {
                    if (c.getCustomerId() == customerId) {
                        customerList.remove(customerId);
                    }
                });
    }

}
