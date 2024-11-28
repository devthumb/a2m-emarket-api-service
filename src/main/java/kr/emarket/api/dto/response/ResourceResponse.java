package kr.emarket.api.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import kr.emarket.api.vo.ResourceVO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class ResourceResponse {
  @JsonProperty("MG_ID")
  private Integer mgId;
  @JsonProperty("MG_RESOURCE_ID")
  private String mgResourceId;
  @JsonProperty("RSC_NM")
  private String rscNm;
  @JsonProperty("RSC_CAPA")
  private String rscCapa;
  @JsonProperty("DEV_CAPA")
  private String devCapa;

  public static ResourceResponse fromVO(ResourceVO resourceVO) {
    return ResourceResponse.builder()
        .mgId(resourceVO.getMgId())
        .mgResourceId(resourceVO.getMgResourceId())
        .rscNm(resourceVO.getRscNm())
        .rscCapa(resourceVO.getRscCapa())
        .devCapa(resourceVO.getDevCapa())
        .build();
  }
}