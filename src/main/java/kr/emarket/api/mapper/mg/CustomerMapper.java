package kr.emarket.api.mapper.mg;

import java.util.List;
import kr.emarket.api.vo.CustomerVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
  List<CustomerVO> getCustomers();
  CustomerVO getCustomer(String cntrNo);
}
