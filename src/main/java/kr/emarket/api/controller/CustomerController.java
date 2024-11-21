package kr.emarket.api.controller;

import java.util.List;
import kr.emarket.api.dto.response.CustomerResponse;
import kr.emarket.api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/customers")
  public ResponseEntity<List<CustomerResponse>> getCustomers() {
    return ResponseEntity.ok(customerService.getCustomers());
  }

  @GetMapping("/customers/{cntrNo}")
  public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String cntrNo) {
    return ResponseEntity.ok(customerService.getCustomer(cntrNo));
  }
}