package kr.emarket.api.vo;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResourceVO {
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
}