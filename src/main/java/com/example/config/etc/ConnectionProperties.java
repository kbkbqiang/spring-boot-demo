package com.example.config.etc;

import lombok.Data;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="connection")
public class ConnectionProperties {
	
	@NotBlank
	private String remoteAddress;
}
