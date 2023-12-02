package in.shiv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.shiv.binding.User;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory getFactory() {
		JedisConnectionFactory factory=new JedisConnectionFactory();
		//factory.setHostName(hostName);
		//factory.setPassword(password);
		//factory.setPort(port);
		return factory;
	}

	@Bean
	@Primary
	public RedisTemplate<String, User> getTemplate(JedisConnectionFactory factory){
		RedisTemplate<String, User> rt = new RedisTemplate<String, User>();
		rt.setConnectionFactory(factory);
		return rt;
	}
}
