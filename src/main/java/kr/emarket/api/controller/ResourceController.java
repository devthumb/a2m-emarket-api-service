package kr.emarket.api.controller;

import java.util.List;
import kr.emarket.api.dto.request.ResourceRequest;
import kr.emarket.api.dto.response.ResourceResponse;
import kr.emarket.api.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ResourceController {

  private final ResourceService resourceService;

  @GetMapping("/resources")
  public ResponseEntity<List<ResourceResponse>> getResources(ResourceRequest resourceRequest) {
    return ResponseEntity.ok(resourceService.getResources(resourceRequest));
  }

  @GetMapping("/resources/{projectId}/{mgResourceId}")
  public ResponseEntity<ResourceResponse> getResource(@PathVariable String projectId, @PathVariable String mgResourceId) {
    return ResponseEntity.ok(resourceService.getResource(projectId, mgResourceId));
  }
}