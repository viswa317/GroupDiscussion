package com.viswa.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Community {
	
	private long id;
	private User owner;
	private Date createdDate;
	private String communityName;
	private Set<User> members = new HashSet<User>();
	private Set<Discussion> discussions = new HashSet<Discussion>();

	protected Community() {
		super();
		this.id = -1;
	}
	
	public Community(String communityName, User owner){
		super();
		this.communityName = communityName;
		this.owner = owner;
		this.createdDate = new Date();
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	protected void setOwner(User owner) {
		this.owner = owner;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	protected void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCommunityName() {
		return communityName;
	}

	protected void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public boolean addToDiscussions(Discussion discussion) {
		return this.discussions.add(discussion);
	}

	public boolean removeFromDiscussions(Discussion discussion) {
		return this.discussions.remove(discussion);
	}
	
	public boolean addToMembers(User user) {
		return this.members.add(user);
	}

	public boolean removeFromMembers(User user) {
		return this.members.remove(user);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((communityName == null) ? 0 : communityName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Community other = (Community) obj;
		if (communityName == null) {
			if (other.communityName != null)
				return false;
		} else if (!communityName.equals(other.communityName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Community [owner=" + owner + ", communityName=" + communityName
				+ "]";
	}

}
