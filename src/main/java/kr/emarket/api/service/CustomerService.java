package kr.emarket.api.service;

import java.util.List;
import kr.emarket.api.dto.response.CustomerResponse;

public interface CustomerService {
  List<CustomerResponse> getCustomers();
  CustomerResponse getCustomer(String cntrNo);
}