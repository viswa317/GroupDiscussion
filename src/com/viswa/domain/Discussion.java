package com.viswa.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Discussion {

	private String topic;
	private Date createdDate;
	private User owner;
	private Set<Post> posts = new HashSet<Post>();
	private Community community;
	
	//For Hibernate
	private long id = -1;

	protected Discussion() {
		super();
		this.id = -1;
	}

	public Discussion(String topic, User owner){
		super();
		this.topic = topic;
		this.owner = owner;
		this.createdDate = new Date();
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	protected void setTopic(String topic) {
		this.topic = topic;
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

	public boolean addToPosts(Post post) {
		return this.posts.add(post);
	}

	public boolean removeFromPosts(Post post) {
		return this.posts.remove(post);
	}
	
	public Set<Post> getPosts() {
		return posts;
	}

	protected void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Community getCommunity() {
		return community;
	}

	protected void setCommunity(Community community) {
		this.community = community;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		Discussion other = (Discussion) obj;
		if (id != other.id)
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Discussion [topic=" + topic + ", createdDate=" + createdDate
				+ ", owner=" + owner + "]";
	}
}
