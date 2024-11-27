package kr.emarket.api.dto.response;


import kr.emarket.api.vo.RtuPointMapVO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class RtuPointMapResponse {
  private String customerNo;
  private Integer mgId;
  private Integer mgResourceId;
  private String name;
  private String description;
  private String daObjRef;
  private String daName;
  private byte[] val;
  private byte[] updTime;
  private String valBtype;
  private String timeBtype;

  public static RtuPointMapResponse fromVO(RtuPointMapVO rtuPointMapVO) {
    return RtuPointMapResponse.builder()
        .customerNo(rtuPointMapVO.getCustomerNo())
        .mgId(rtuPointMapVO.getMgId())
        .mgResourceId(rtuPointMapVO.getMgResourceId())
        .name(rtuPointMapVO.getName())
        .description(rtuPointMapVO.getDescription())
        .daObjRef(rtuPointMapVO.getDaObjRef())
        .daName(rtuPointMapVO.getDaName())
        .val(rtuPointMapVO.getVal())
        .updTime(rtuPointMapVO.getUpdTime())
        .valBtype(rtuPointMapVO.getValBtype())
        .timeBtype(rtuPointMapVO.getTimeBtype())
        .build();
  }
}