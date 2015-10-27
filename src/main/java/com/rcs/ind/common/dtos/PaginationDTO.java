package com.rcs.ind.common.dtos;

import java.util.List;

public class PaginationDTO<T> {

	private long totalCount;
	private List<T> rows;

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}