package kr.emarket.api.service;

import java.util.List;
import kr.emarket.api.dto.request.ResourceRequest;
import kr.emarket.api.dto.response.ResourceResponse;

public interface ResourceService {
  List<ResourceResponse> getResources(ResourceRequest resourceRequest);
  ResourceResponse getResource(String projectId,String mgResourceId);
}