package kr.emarket.api.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
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
  @JsonProperty("MG_ID")
  private Integer mgId;
  @JsonProperty("MG_NM")
  private String mgNm;
  @JsonProperty("CUSTOMER_NO")
  private String customerNo;
  @JsonProperty("CNTR_PWR")
  private Integer cntrPwr;
  @JsonProperty("TEL")
  private String tel;
  @JsonProperty("ADDR")
  private String addr;

  public static CustomerResponse fromVO(CustomerVO customerVO) {
    return customerVO != null ?
        CustomerResponse.builder()
            .mgId(customerVO.getMgId())
            .mgNm(customerVO.getMgNm())
            .customerNo(customerVO.getCustomerNo())
            .cntrPwr(customerVO.getCntrPwr())
            .tel(customerVO.getTel())
            .addr(customerVO.getAddr())
            .build()
        : null;
  }
}