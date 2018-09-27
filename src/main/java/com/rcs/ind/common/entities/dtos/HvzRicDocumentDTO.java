package com.rcs.ind.common.entities.dtos;

import java.util.List;

public class HvzRicDocumentDTO extends GeneralDocumentDTO {
    private List<CustomerDTO> customers;

    public List<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}