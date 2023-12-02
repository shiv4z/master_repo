package in.shiv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory getConnection() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		//factory.setHostName(hostName);
		//factory.setPort(port);
		//factory.setPassword(password);
		return factory;
	}
	
	@Bean
	@Primary
	public RedisTemplate<String, String> getRedisTemplate(JedisConnectionFactory factory){
		RedisTemplate<String, String> rt=new RedisTemplate<String, String>();
		rt.setConnectionFactory(factory);
		return rt;
	}

}
