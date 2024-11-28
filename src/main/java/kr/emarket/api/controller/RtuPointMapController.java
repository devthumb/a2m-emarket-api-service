package kr.emarket.api.controller;

import java.util.List;
import kr.emarket.api.dto.request.RtuPointMapRequest;
import kr.emarket.api.dto.response.RtuPointMapResponse;
import kr.emarket.api.service.RtuPointMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/measure/data")
@RequiredArgsConstructor
public class RtuPointMapController {

  private final RtuPointMapService rtuPointMapService;

  @GetMapping("/pv")
  public ResponseEntity<List<RtuPointMapResponse>> getData(RtuPointMapRequest rtuPointMapRequest) {
    return ResponseEntity.ok(rtuPointMapService.getRtuPointMaps(rtuPointMapRequest));
  }

  @GetMapping("/pv/{customerNo}")
  public ResponseEntity<List<RtuPointMapResponse>> getData(@PathVariable String customerNo) {
    RtuPointMapRequest rtuPointMapRequest = new RtuPointMapRequest();
    rtuPointMapRequest.setCustomerNo(customerNo);
    return ResponseEntity.ok(rtuPointMapService.getRtuPointMaps(rtuPointMapRequest));
  }
}