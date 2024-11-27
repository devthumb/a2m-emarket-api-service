package kr.emarket.api.vo;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RtuPointMapVO {
  private String customerNo;
  private Integer mgId;
  private Integer mgResourceId;
  private String name;
  private String description;
  private String daObjRef;
  private String daName;
  private byte[] val;
  private byte[] updTime;
  private String valBtype;
  private String timeBtype;

}