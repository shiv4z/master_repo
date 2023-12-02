package in.shiv.filter;

import java.util.List;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ApiFiler implements GlobalFilter{

	org.slf4j.Logger logger =LoggerFactory.getLogger(ApiFiler.class);
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("filter() executed.");
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		keySet.forEach(key->{
			List<String> values = headers.get(key);
			System.out.println(key +"::"+ values);
		});
		return chain.filter(exchange);
	}

}
