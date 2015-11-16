package com.rcs.ind.common.liferay.service.dtos;



public class LiferayDLFolderDTO extends LiferayGeneralDTO{
	
	private long folderId;
	private long companyId;
	private long groupId;
	private long userId;
	private String userName;
	private long repositoryId;
	private boolean mountPoint;
	private long parentFolderId;
	private String name;
	private String description;
	private int status;
	
		
	
	public long getFolderId() {
		return folderId;
	}

	
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}

	public long getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	
	public long getGroupId() {
		return groupId;
	}
	
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getRepositoryId() {
		return repositoryId;
	}
	
	public void setRepositoryId(long repositoryId) {
		this.repositoryId = repositoryId;
	}
	
	public boolean isMountPoint() {
		return mountPoint;
	}
	
	public void setMountPoint(boolean mountPoint) {
		this.mountPoint = mountPoint;
	}
	
	public long getParentFolderId() {
		return parentFolderId;
	}
	
	public void setParentFolderId(long parentFolderId) {
		this.parentFolderId = parentFolderId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
