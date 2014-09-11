package com.viswa.domain;

import java.util.HashSet;
import java.util.Set;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private String url;
	private String emailId;
	private String password;
	private String userName;
	private Set<Role> roles = new HashSet<Role>();
	private Set<Community> communities = new HashSet<Community>();
	
	protected User() {
		super();
		this.id = -1;
	}

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUrl() {
		return url;
	}

	protected void setUrl(String url) {
		this.url = url;
	}

	public String getEmailId() {
		return emailId;
	}

	protected void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayName() {
		return userName;
	}

	protected void setDisplayName(String displayName) {
		this.userName = displayName;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public boolean addToRoles(Role role) {
		return this.roles.add(role);
	}

	public boolean removeFromRoles(Role role) {
		return this.roles.remove(role);
	}

	public boolean addToCommunities(Community community) {
		return this.communities.add(community);
	}

	public boolean removeFromCommunities(Community community) {
		return this.communities.remove(community);
	}
	
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + "]";
	}


}
