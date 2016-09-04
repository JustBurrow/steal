/**
 */
package kr.lul.steal.service.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.lul.steal.domain.Stealer;
import kr.lul.steal.jpa.entity.StealerEntity;
import kr.lul.steal.jpa.repository.StealerRepository;
import kr.lul.steal.service.ctx.CreateStealerCtx;
import kr.lul.steal.service.dao.StealerDao;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Service
class StealerInternalServiceImpl implements StealerInternalService {
  @Autowired
  private StealerDao        stealerDao;
  @Autowired
  private StealerRepository stealerRepository;

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>StealerInternalService
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public Stealer create(CreateStealerCtx ctx) {
    StealerEntity stealer = new StealerEntity(ctx.getName(), ctx.getBio());
    stealer = this.stealerRepository.save(stealer);
    return stealer;
  }
}
