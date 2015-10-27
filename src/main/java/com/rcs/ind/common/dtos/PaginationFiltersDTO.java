package com.rcs.ind.common.dtos;

public class PaginationFiltersDTO {

	/**
	 * Common jqGrid and DataTables fields.
	 */
	private String sidx;
	private String sord;
	private Integer page;
	private Integer rows;

	/**
	 * DataTables specific field.
	 */
	private Integer draw;

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer start) {
		this.page = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer limit) {
		this.rows = limit;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}
}
