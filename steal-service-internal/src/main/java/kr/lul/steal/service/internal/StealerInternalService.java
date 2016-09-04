/**
 */
package kr.lul.steal.service.internal;

import org.springframework.transaction.annotation.Transactional;

import kr.lul.steal.domain.Stealer;
import kr.lul.steal.service.ctx.CreateStealerCtx;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Transactional
public interface StealerInternalService {
  /**
   * @param ctx
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public Stealer create(CreateStealerCtx ctx);
}
