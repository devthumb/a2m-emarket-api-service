package kr.emarket.api.service.impl;

import java.util.List;
import kr.emarket.api.dto.request.ResourceRequest;
import kr.emarket.api.dto.response.ResourceResponse;
import kr.emarket.api.mapper.mg.ResourceMapper;
import kr.emarket.api.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

  private final ResourceMapper resourceMapper;

  @Override
  public List<ResourceResponse> getResources(ResourceRequest resourceRequest) {
    return resourceMapper.getResources(resourceRequest).stream().map(ResourceResponse::fromVO).toList();
  }

  @Override
  public ResourceResponse getResource(String projectId, String mgResourceId) {
    return ResourceResponse.fromVO(resourceMapper.getResource(projectId, mgResourceId));
  }
}
