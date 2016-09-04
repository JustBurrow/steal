/**
 */
package kr.lul.steal.api.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.lul.api.ApiOutput;
import kr.lul.api.NonceOutput;
import kr.lul.steal.api.design.input.CreateStealerInput;
import kr.lul.steal.service.command.CreateStealerCmd;
import kr.lul.steal.service.dto.StealerDto;
import kr.lul.steal.service.external.StealerService;
import kr.lul.util.Lazy;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@RestController
class StealerControllerImpl extends AbstractController implements StealerController {
  @Autowired
  private StealerService stealerService;

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>StealerController
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public NonceOutput issueNonce() {
    // TODO Auto-generated method stub
    return null;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public ApiOutput create(@RequestBody @Valid CreateStealerInput input) {

    CreateStealerCmd cmd = new CreateStealerCmd();
    Lazy<StealerDto> rv = this.stealerService.create(cmd);
    return null;
  }
}
