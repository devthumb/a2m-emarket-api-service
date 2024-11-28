package kr.emarket.api.controller;

import java.util.List;
import kr.emarket.api.dto.response.CustomerResponse;
import kr.emarket.api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/common/mg-info")
@RestController
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/allCustomer")
  public ResponseEntity<List<CustomerResponse>> getCustomers() {
    return ResponseEntity.ok(customerService.getCustomers());
  }

  @GetMapping("/findByCustomer/{cntrNo}")
  public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String cntrNo) {
    return ResponseEntity.ok(customerService.getCustomer(cntrNo));
  }
}