package com.rcs.ind.common;

import com.rcs.ind.common.dtos.PaginationDTO;
import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.dtos.ServiceResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class JqGridResponse<T> extends BackendResponse {

	private Long total;
	private Integer page;
	private Long records;
	private List<T> rows;

	public void setValues(ServiceResponseDTO<PaginationDTO<T>> result, PaginationFiltersDTO filters) {
		this.setRows(result != null ? result.getPayload().getRows() : new ArrayList<T>());
		this.setRecords(result != null ? result.getPayload().getTotalCount() : 0);
		this.setPage(filters.getPage());
		this.setTotal(Math.round(Math.ceil((double) this.getRecords() / filters.getRows())));
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Long getRecords() {
		return records;
	}

	public void setRecords(Long records) {
		this.records = records;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}