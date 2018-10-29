package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.CustomerDTO;
import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

public class HvzDocumentDTO extends GeneralDocumentDTO {

    private CustomerDTO customer;

    public HvzDocumentDTO() {
    }

    public HvzDocumentDTO(CustomerDTO customer) {
        this.customer = customer;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}
