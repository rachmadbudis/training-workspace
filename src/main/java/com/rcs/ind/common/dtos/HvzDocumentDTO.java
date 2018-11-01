package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.CustomerDTO;
import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

public class HvzDocumentDTO extends GeneralDocumentDTO {

    private CustomerDTO customer;

    public HvzDocumentDTO() {
    }

    public HvzDocumentDTO(Long documentId, String fileName, CustomerDTO customer) {
        super.setDocumentId(documentId);
        super.setFileName(fileName);
        this.customer = customer;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}
