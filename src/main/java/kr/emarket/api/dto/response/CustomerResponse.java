package kr.emarket.api.dto.response;


import java.time.LocalDateTime;
import kr.emarket.api.vo.CustomerVO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class CustomerResponse {
  private Integer projectId;
  private Integer mgId;
  private String mgNm;
  private String customerNo;
  private Integer cntrPwr;
  private String svcKndCd;
  private String custKndCd;
  private String mdmsYn;
  private String ksicCd;
  private Integer idstryCplxAreaId;
  private Integer dlId;
  private String tel;
  private String addr;
  private String geom;
  private String useYn;
  private LocalDateTime regDate;
  private String custImg;

  public static CustomerResponse fromVO(CustomerVO customerVO) {
    return customerVO != null ?
        CustomerResponse.builder()
            .projectId(customerVO.getProjectId())
            .mgId(customerVO.getMgId())
            .mgNm(customerVO.getMgNm())
            .customerNo(customerVO.getCustomerNo())
            .cntrPwr(customerVO.getCntrPwr())
            .svcKndCd(customerVO.getSvcKndCd())
            .custKndCd(customerVO.getCustKndCd())
            .mdmsYn(customerVO.getMdmsYn())
            .ksicCd(customerVO.getKsicCd())
            .idstryCplxAreaId(customerVO.getIdstryCplxAreaId())
            .dlId(customerVO.getDlId())
            .tel(customerVO.getTel())
            .addr(customerVO.getAddr())
            .geom(customerVO.getGeom())
            .useYn(customerVO.getUseYn())
            .regDate(customerVO.getRegDate())
            .custImg(customerVO.getCustImg())
            .build()
        : null;
  }
}