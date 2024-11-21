package kr.emarket.api.mapper.mg;

import java.util.List;
import kr.emarket.api.dto.request.ResourceRequest;
import kr.emarket.api.vo.ResourceVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResourceMapper {
  public List<ResourceVO> getResources(ResourceRequest resourceRequest);
  public ResourceVO getResource(String projectId, String mgResourceId);
}

