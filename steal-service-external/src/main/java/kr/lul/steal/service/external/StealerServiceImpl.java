/**
 */
package kr.lul.steal.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.lul.steal.domain.Stealer;
import kr.lul.steal.service.command.CreateStealerCmd;
import kr.lul.steal.service.ctx.CreateStealerCtx;
import kr.lul.steal.service.dto.StealerDto;
import kr.lul.steal.service.external.converter.StealerConverter;
import kr.lul.steal.service.internal.StealerInternalService;
import kr.lul.util.Lazy;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Service
class StealerServiceImpl implements StealerService {
  @Autowired
  private StealerInternalService stealerInternalService;
  @Autowired
  private StealerConverter       stealerConverter;

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>StealerService
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public Lazy<StealerDto> create(CreateStealerCmd cmd) {

    CreateStealerCtx ctx = new CreateStealerCtx();
    Stealer stealer = this.stealerInternalService.create(ctx);
    return () -> this.stealerConverter.convert(stealer);
  }
}
