/**
 * 
 */
package de.evoila;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.util.Assert;

import de.evoila.cf.cpi.openstack.custom.props.DomainBasedCustomPropertyHandler;
import de.evoila.cf.cpi.openstack.custom.props.ElasticsearchCustomPropertyHandler;

/**
 * 
 * @author Johannes Hiemer.
 *
 */
@SpringBootApplication
public class Application {

	@Bean(name = "customProperties")
	public Map<String, String> customProperties() {
		Map<String, String> customProperties = new HashMap<String, String>();
		return customProperties;
	}
	
	@Bean
	public DomainBasedCustomPropertyHandler domainPropertyHandler() {
		return new ElasticsearchCustomPropertyHandler();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		Assert.notNull(ctx);
	}

}