/**
 */
package kr.lul.steal.api.rest.controller;

import static kr.lul.steal.api.design.constant.StealerApiConstants.CREATE;
import static kr.lul.steal.api.design.constant.StealerApiConstants.CREATE_INPUT;
import static kr.lul.steal.api.design.constant.StealerApiConstants.GROUP_NAME;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.lul.api.ApiOutput;
import kr.lul.api.NonceOutput;
import kr.lul.steal.api.design.input.CreateStealerInput;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@RequestMapping(name = GROUP_NAME)
public interface StealerController {
  /**
   * @param input
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @RequestMapping(name = CREATE_INPUT)
  public NonceOutput issueNonce();

  /**
   * @param input
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @RequestMapping(name = CREATE, method = RequestMethod.POST)
  public ApiOutput create(@RequestBody @Valid CreateStealerInput input);
}
