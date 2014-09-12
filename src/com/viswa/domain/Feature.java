package com.viswa.domain;

public class Feature {

	private String featureName;
	
	//For Hibernate
	private long id = -1;

	protected Feature() {
		super();
		this.id = -1;
	}

	public Feature(String featureName){
		super();
		this.featureName = featureName;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getFeatureName() {
		return featureName;
	}

	protected void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((featureName == null) ? 0 : featureName.hashCode());
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
		Feature other = (Feature) obj;
		if (featureName == null) {
			if (other.featureName != null)
				return false;
		} else if (!featureName.equals(other.featureName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Feature [id=" + id + ", featureName=" + featureName + "]";
	}
	
}
