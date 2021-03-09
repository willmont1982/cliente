package com.algaworks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String macaddress;
	
	@Column(nullable = false)
	private String profile;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String clientclass;
	
	@Column(nullable = false)
	private String downstreambandwidth;
	
	@Column(nullable = false)
	private String upstreambandwidth;
	
	@Column(nullable = false)
	private String downstreambandwidthmegabyte;
	
	@Column(nullable = false)
	private String upstreambandwidthemgabyte;
	
	@Column(nullable = false)
	private String isnat;
	
	@Column(nullable = false)
	private String uptime;
	
	@Column(nullable = false)
	private String isbootable;
	
	@Column(nullable = false)
	private String iscompatible;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMacaddress() {
		return macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClientclass() {
		return clientclass;
	}

	public void setClientclass(String clientclass) {
		this.clientclass = clientclass;
	}

	public String getDownstreambandwidth() {
		return downstreambandwidth;
	}

	public void setDownstreambandwidth(String downstreambandwidth) {
		this.downstreambandwidth = downstreambandwidth;
	}

	public String getUpstreambandwidth() {
		return upstreambandwidth;
	}

	public void setUpstreambandwidth(String upstreambandwidth) {
		this.upstreambandwidth = upstreambandwidth;
	}

	public String getDownstreambandwidthmegabyte() {
		return downstreambandwidthmegabyte;
	}

	public void setDownstreambandwidthmegabyte(String downstreambandwidthmegabyte) {
		this.downstreambandwidthmegabyte = downstreambandwidthmegabyte;
	}

	public String getUpstreambandwidthemgabyte() {
		return upstreambandwidthemgabyte;
	}

	public void setUpstreambandwidthemgabyte(String upstreambandwidthemgabyte) {
		this.upstreambandwidthemgabyte = upstreambandwidthemgabyte;
	}

	public String getIsnat() {
		return isnat;
	}

	public void setIsnat(String isnat) {
		this.isnat = isnat;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getIsbootable() {
		return isbootable;
	}

	public void setIsbootable(String isbootable) {
		this.isbootable = isbootable;
	}

	public String getIscompatible() {
		return iscompatible;
	}

	public void setIscompatible(String iscompatible) {
		this.iscompatible = iscompatible;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientclass == null) ? 0 : clientclass.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((downstreambandwidth == null) ? 0 : downstreambandwidth.hashCode());
		result = prime * result + ((downstreambandwidthmegabyte == null) ? 0 : downstreambandwidthmegabyte.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbootable == null) ? 0 : isbootable.hashCode());
		result = prime * result + ((iscompatible == null) ? 0 : iscompatible.hashCode());
		result = prime * result + ((isnat == null) ? 0 : isnat.hashCode());
		result = prime * result + ((macaddress == null) ? 0 : macaddress.hashCode());
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
		result = prime * result + ((upstreambandwidth == null) ? 0 : upstreambandwidth.hashCode());
		result = prime * result + ((upstreambandwidthemgabyte == null) ? 0 : upstreambandwidthemgabyte.hashCode());
		result = prime * result + ((uptime == null) ? 0 : uptime.hashCode());
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
		Cliente other = (Cliente) obj;
		if (clientclass == null) {
			if (other.clientclass != null)
				return false;
		} else if (!clientclass.equals(other.clientclass))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (downstreambandwidth == null) {
			if (other.downstreambandwidth != null)
				return false;
		} else if (!downstreambandwidth.equals(other.downstreambandwidth))
			return false;
		if (downstreambandwidthmegabyte == null) {
			if (other.downstreambandwidthmegabyte != null)
				return false;
		} else if (!downstreambandwidthmegabyte.equals(other.downstreambandwidthmegabyte))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isbootable == null) {
			if (other.isbootable != null)
				return false;
		} else if (!isbootable.equals(other.isbootable))
			return false;
		if (iscompatible == null) {
			if (other.iscompatible != null)
				return false;
		} else if (!iscompatible.equals(other.iscompatible))
			return false;
		if (isnat == null) {
			if (other.isnat != null)
				return false;
		} else if (!isnat.equals(other.isnat))
			return false;
		if (macaddress == null) {
			if (other.macaddress != null)
				return false;
		} else if (!macaddress.equals(other.macaddress))
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		if (upstreambandwidth == null) {
			if (other.upstreambandwidth != null)
				return false;
		} else if (!upstreambandwidth.equals(other.upstreambandwidth))
			return false;
		if (upstreambandwidthemgabyte == null) {
			if (other.upstreambandwidthemgabyte != null)
				return false;
		} else if (!upstreambandwidthemgabyte.equals(other.upstreambandwidthemgabyte))
			return false;
		if (uptime == null) {
			if (other.uptime != null)
				return false;
		} else if (!uptime.equals(other.uptime))
			return false;
		return true;
	}

	
}
