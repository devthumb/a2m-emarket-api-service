package kr.emarket.api.config;

import com.a2m.atom.cloud.auth.hmac.service.validator.HmacRequestPolicyValidator.HmacRequestPolicy;
import com.a2m.atom.cloud.auth.hmac.service.validator.impl.DefaultHmacRequestPolicyValidator.PolicyArguments;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomHmacRequestPolicy implements HmacRequestPolicy {

  @Override
  public boolean validate(HttpServletRequest request, PolicyArguments arguments) {
    return arguments.isMarkedAsVerifiedHmacRequest(request)
        || arguments.isMarkedAsHmacRequest(request)
        || arguments.checkAllowedAndDisallowedPatterns(request.getServletPath());
//    return true;
  }
}
