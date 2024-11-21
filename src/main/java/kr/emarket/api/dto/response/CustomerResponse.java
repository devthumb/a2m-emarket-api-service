package kr.emarket.api.dto.response;


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
  private String cntrNo;
  private String aplyStYmd;
  private String aplyEndYmd;
  private Integer cntrPwr;
  private String lhvClcd;
  private String mrDd;
  private String hdqrCd;
  private String brofCd;
  private String sidoCd;
  private String sgngCd;
  private String dongCd;
  private String custNm;
  private String trna;

  public static CustomerResponse fromVO(CustomerVO customerVO) {
    return CustomerResponse.builder()
        .cntrNo(customerVO.getCntrNo())
        .aplyStYmd(customerVO.getAplyStYmd())
        .aplyEndYmd(customerVO.getAplyEndYmd())
        .cntrPwr(customerVO.getCntrPwr())
        .lhvClcd(customerVO.getLhvClcd())
        .mrDd(customerVO.getMrDd())
        .hdqrCd(customerVO.getHdqrCd())
        .brofCd(customerVO.getBrofCd())
        .sidoCd(customerVO.getSidoCd())
        .sgngCd(customerVO.getSgngCd())
        .dongCd(customerVO.getDongCd())
        .custNm(customerVO.getCustNm())
        .trna(customerVO.getTrna())
        .build();
  }
}