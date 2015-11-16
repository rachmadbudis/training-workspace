package com.rcs.ind.common.liferay.service.dtos;


public class LiferayFileEntryDTO extends LiferayGeneralDTO{
	
	public static final String LIFERAY_CLASS_NAME="com.liferay.portlet.documentlibrary.model.DLFileEntry";
	
	private long fileEntryId;
	private long companyId;
	private long groupId;
	private long userId;
	private String userName;
	private long repositoryId;
	private long folderId;
	private String treePath;
	private String name;
	private String description;
	private String extension;
	private String mimeType;
	private String title;
	private int fileEntryTypeId;
	private String version;
	private String size;
	private String fileURL;
	
	public long getFileEntryId() {
		return fileEntryId;
	}
	
	public void setFileEntryId(long fileEntryId) {
		this.fileEntryId = fileEntryId;
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
	
	public long getFolderId() {
		return folderId;
	}
	
	public void setFolderId(long folderId) {
		this.folderId = folderId;
	}
	
	public String getTreePath() {
		return treePath;
	}
	
	public void setTreePath(String treePath) {
		this.treePath = treePath;
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
	
	public String getExtension() {
		return extension;
	}
	
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getFileEntryTypeId() {
		return fileEntryTypeId;
	}
	
	public void setFileEntryTypeId(int fileEntryTypeId) {
		this.fileEntryTypeId = fileEntryTypeId;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	
	public String getFileURL() {
		return fileURL;
	}

	
	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	}
	
	
	

}
