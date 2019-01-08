package com.rcs.ind.common.entities.dtos;

public class HvzRicDocumentDTO extends GeneralDocumentDTO {
    private CustomerDTO customer;

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    
}