package kr.emarket.api.vo;


import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomerVO {
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
}