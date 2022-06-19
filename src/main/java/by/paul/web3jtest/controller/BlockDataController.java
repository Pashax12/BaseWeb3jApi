package by.paul.web3jtest.controller;

import by.paul.web3jtest.service.Web3jApiService;
import java.math.BigInteger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BlockDataController {

  private final Web3jApiService web3jApiService;

  @GetMapping("/blocknumber")
  public ResponseEntity<BigInteger> getBlockNumber(){
    return new ResponseEntity<>(web3jApiService.getEthBlockNumber(), HttpStatus.OK);
  }

}
