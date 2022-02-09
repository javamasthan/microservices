package com.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

@Configuration
public class RibbonConfiguration {
	
	@Autowired
	private IClientConfig iClientConfig;
	
	public IRule getIRule(IClientConfig iClientConfig){
		return new WeightedResponseTimeRule();
	}
	
	public IPing getIPing(IClientConfig iClientConfig){
		return new PingUrl();
	}

}
