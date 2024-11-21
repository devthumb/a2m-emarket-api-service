package kr.emarket.api.mapper.mg;

import java.util.List;
import kr.emarket.api.dto.request.RtuPointMapRequest;
import kr.emarket.api.vo.RtuPointMapVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RtuPointMapMapper {
  List<RtuPointMapVO> getRtuPointMaps(RtuPointMapRequest rtuPointMapRequest);
}

