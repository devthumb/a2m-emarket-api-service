package kr.emarket.api.controller;

import java.util.List;
import kr.emarket.api.dto.request.RtuPointMapRequest;
import kr.emarket.api.dto.response.RtuPointMapResponse;
import kr.emarket.api.service.RtuPointMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class RtuPointMapController {

  private final RtuPointMapService rtuPointMapService;

  @GetMapping("/rtu/point-map")
  public ResponseEntity<List<RtuPointMapResponse>> getResources(RtuPointMapRequest rtuPointMapRequest) {
    return ResponseEntity.ok(rtuPointMapService.getRtuPointMaps(rtuPointMapRequest));
  }

}