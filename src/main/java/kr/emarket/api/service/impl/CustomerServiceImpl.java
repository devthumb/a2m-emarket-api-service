package kr.emarket.api.service.impl;

import java.util.List;
import kr.emarket.api.dto.response.CustomerResponse;
import kr.emarket.api.mapper.mg.CustomerMapper;
import kr.emarket.api.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

  private final CustomerMapper customerMapper;

  public List<CustomerResponse> getCustomers() {
    return customerMapper.getCustomers().stream().map(CustomerResponse::fromVO).toList();
  }

  public CustomerResponse getCustomer(String cntrNo) {
    return CustomerResponse.fromVO(customerMapper.getCustomer(cntrNo));
  }
}
