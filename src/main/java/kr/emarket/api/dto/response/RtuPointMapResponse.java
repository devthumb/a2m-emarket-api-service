package kr.emarket.api.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
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
  @JsonProperty("MG_ID")
  private Integer mgId;
  @JsonProperty("MG_RESOURCE_ID")
  private Integer mgResourceId;
  @JsonProperty("NAME")
  private String name;
  @JsonProperty("DESCRIPTION")
  private String description;
  @JsonProperty("DA_OBJ_REF")
  private String daObjRef;
  @JsonProperty("DA_NAME")
  private String daName;
  @JsonProperty("VAL")
  private byte[] val;
  @JsonProperty("UPD_TIME")
  private byte[] updTime;
  @JsonProperty("VAL_B_TYPE")
  private String valBtype;
  @JsonProperty("TIME_B_TYPE")
  private String timeBtype;

  public static RtuPointMapResponse fromVO(RtuPointMapVO rtuPointMapVO) {
    return RtuPointMapResponse.builder()
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