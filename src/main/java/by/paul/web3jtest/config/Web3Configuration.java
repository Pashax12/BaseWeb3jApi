package by.paul.web3jtest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3Configuration {

  @Value("${ethereum.node.provider}")
  private String urlProvider;

  @Bean
  public Web3j getWeb3j(){
    return Web3j.build(new HttpService(urlProvider));
  }

}
