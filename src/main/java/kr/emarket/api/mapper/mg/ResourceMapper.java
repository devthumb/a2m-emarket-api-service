package kr.emarket.api.mapper.mg;

import java.util.List;
import kr.emarket.api.dto.request.ResourceRequest;
import kr.emarket.api.vo.ResourceVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResourceMapper {
  List<ResourceVO> getResources(ResourceRequest resourceRequest);
  List<ResourceVO> getResource(String customerNo);
}