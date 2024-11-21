package kr.emarket.api.vo;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RtuPointMapVO {
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
}