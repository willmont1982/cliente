package com.claro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
    @Column(nullable = false)
	private String macAddress;
	
	@Column(nullable = false)
	private String profile;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String clientClass;
	
	@Column(nullable = false)
    private String downstreamBandwidth;
	
	@Column(nullable = false)
    private String upstreamBandwidth;
	
	@Column(nullable = false)
    private String downstreamBandwidthMegabyte;
	
	@Column(nullable = false)
    private String upstreamBandwidthMegabyte;
	
	@Column(nullable = false)
    private String isNat;
	
	@Column(nullable = false)
	private String uptime;
	
	@Column(nullable = false)
	private String isBootable;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private String isCompatible;

	
}

