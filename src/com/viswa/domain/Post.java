package com.viswa.domain;

import java.util.Date;

public class Post {

	private String postText;
	private Date createdDate;
	private User owner;
	private Discussion discussion;
	
	//For Hibernate
	private long id = -1;

	protected Post() {
		super();
		this.id = -1;
	}

	public Post(String postText, User owner){
		super();
		this.postText = postText;
		this.owner = owner;
		this.createdDate = new Date();
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getPostText() {
		return postText;
	}

	protected void setPostText(String postText) {
		this.postText = postText;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	protected void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getOwner() {
		return owner;
	}

	protected void setOwner(User owner) {
		this.owner = owner;
	}

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((postText == null) ? 0 : postText.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id != other.id)
			return false;
		if (postText == null) {
			if (other.postText != null)
				return false;
		} else if (!postText.equals(other.postText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Post [postText=" + postText + ", owner=" + owner + "]";
	}
	
}
