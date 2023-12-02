package in.shiv.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "shiv")
public class AppProperty {

	private Map<String, String> message = new HashMap<>();
	
}
