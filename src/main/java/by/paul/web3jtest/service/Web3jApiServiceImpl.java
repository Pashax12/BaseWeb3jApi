package by.paul.web3jtest.service;

import java.math.BigInteger;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;


@Service
@RequiredArgsConstructor
public class Web3jApiServiceImpl implements Web3jApiService {

  private final Web3j web3j;

  @Override
  @SneakyThrows
  public BigInteger getEthBlockNumber() {
    return web3j.ethBlockNumber().sendAsync().get().getBlockNumber();
  }
}
