package kr.emarket.api.service.impl;

import java.util.List;
import kr.emarket.api.dto.request.RtuPointMapRequest;
import kr.emarket.api.dto.response.RtuPointMapResponse;
import kr.emarket.api.mapper.mg.RtuPointMapMapper;
import kr.emarket.api.service.RtuPointMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RtuPointMapServiceImpl implements RtuPointMapService {

  private final RtuPointMapMapper rtuPointMapMapper;

  @Override
  public List<RtuPointMapResponse> getRtuPointMaps(RtuPointMapRequest rtuPointMapRequest) {
    return rtuPointMapMapper.getRtuPointMaps(rtuPointMapRequest).stream().map(RtuPointMapResponse::fromVO).toList();
  }
}
