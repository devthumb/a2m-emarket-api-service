package kr.emarket.api.service;

import java.util.List;
import kr.emarket.api.dto.request.RtuPointMapRequest;
import kr.emarket.api.dto.response.RtuPointMapResponse;

public interface RtuPointMapService {
  List<RtuPointMapResponse> getRtuPointMaps(RtuPointMapRequest rtuPointMapRequest);
}