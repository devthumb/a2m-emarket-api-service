package kr.emarket.api.mapper.mg;

import java.util.List;
import kr.emarket.api.vo.CustomerVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
  public List<CustomerVO> getCustomers();
  public CustomerVO getCustomer(String cntrNo);
}