package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.CustomerDTO;
import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

import java.util.List;
import java.util.Set;

public class HvzDocumentDTO extends GeneralDocumentDTO {

    private List<CustomerDTO> customers;

    public HvzDocumentDTO() {
    }

    public HvzDocumentDTO(Long documentId, String fileName, List<CustomerDTO> customers) {
        super.setDocumentId(documentId);
        super.setFileName(fileName);
        this.customers = customers;
    }

    public List<CustomerDTO> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}
