package kr.emarket.api.vo;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomerVO {
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
}