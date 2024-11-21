package kr.emarket.api.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResourceRequest {
  private String customerNo;
  private Integer projectId;
  private Integer mgResourceId;
}
