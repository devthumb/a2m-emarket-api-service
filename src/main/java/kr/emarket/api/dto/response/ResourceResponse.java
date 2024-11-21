package kr.emarket.api.dto.response;


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
  private String customerNo;
  private String projectId;
  private String mgResourceId;
  private String rscNm;
  private Integer rscKndCd;
  private String rscCapa;
  private String rscCapaUnitId;
  private String meaYn;
  private String maaTestYn;
  private String cntlYn;
  private String cntrTestYn;
  private String devTypeCd;
  private String devCapa;
  private String devCapaUnitId;

  public static ResourceResponse fromVO(ResourceVO resourceVO) {
    return ResourceResponse.builder()
        .customerNo(resourceVO.getCustomerNo())
        .projectId(resourceVO.getProjectId())
        .mgResourceId(resourceVO.getMgResourceId())
        .rscNm(resourceVO.getRscNm())
        .rscKndCd(resourceVO.getRscKndCd())
        .rscCapa(resourceVO.getRscCapa())
        .rscCapaUnitId(resourceVO.getRscCapaUnitId())
        .meaYn(resourceVO.getMeaYn())
        .maaTestYn(resourceVO.getMaaTestYn())
        .cntlYn(resourceVO.getCntlYn())
        .cntrTestYn(resourceVO.getCntrTestYn())
        .devTypeCd(resourceVO.getDevTypeCd())
        .devCapa(resourceVO.getDevCapa())
        .devCapaUnitId(resourceVO.getDevCapaUnitId())
        .build();
  }
}