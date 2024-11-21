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
  private Integer projectId;
  private Integer mgId;
  private String mgNm;
  private String customerNo;

  private Integer mgResourceId;
  private String rscNm;
  private Integer rtuId;
  private String rscKndCd;

  private Integer iedId;
  private Integer rtuPntMapId;
  private String daObjRef;

  private String name;
  private String description;
  private String dataTypeCd;

  public static RtuPointMapResponse fromVO(RtuPointMapVO rtuPointMapVO) {
    return RtuPointMapResponse.builder()
        .projectId(rtuPointMapVO.getProjectId())
        .mgId(rtuPointMapVO.getMgId())
        .mgNm(rtuPointMapVO.getMgNm())
        .customerNo(rtuPointMapVO.getCustomerNo())
        .mgResourceId(rtuPointMapVO.getMgResourceId())
        .rscNm(rtuPointMapVO.getRscNm())
        .rtuId(rtuPointMapVO.getRtuId())
        .rscKndCd(rtuPointMapVO.getRscKndCd())
        .iedId(rtuPointMapVO.getIedId())
        .rtuPntMapId(rtuPointMapVO.getRtuPntMapId())
        .daObjRef(rtuPointMapVO.getDaObjRef())
        .name(rtuPointMapVO.getName())
        .description(rtuPointMapVO.getDescription())
        .dataTypeCd(rtuPointMapVO.getDataTypeCd())
        .build();
  }
}