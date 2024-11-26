package kr.emarket.api.config;

import com.a2m.atom.cloud.auth.hmac.dto.request.HmacRequest;
import com.a2m.atom.cloud.auth.hmac.service.validator.HmacRequestPolicyValidator.HmacRequestPolicy;
import com.a2m.atom.cloud.auth.hmac.service.validator.impl.DefaultHmacRequestPolicyValidator.PolicyArguments;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomHmacRequestPolicy implements HmacRequestPolicy {

  @Override
  public boolean validate(HmacRequest hmacRequest, PolicyArguments arguments) {
    return arguments.isMarkedAsVerifiedHmacRequest(hmacRequest)
        || arguments.isMarkedAsHmacRequest(hmacRequest)
        || arguments.checkAllowedAndDisallowedPatterns(hmacRequest.getServletPath());
  }
}