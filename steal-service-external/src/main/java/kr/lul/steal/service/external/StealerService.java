/**
 */
package kr.lul.steal.service.external;

import org.springframework.transaction.annotation.Transactional;

import kr.lul.steal.service.command.CreateStealerCmd;
import kr.lul.steal.service.dto.StealerDto;
import kr.lul.util.Lazy;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Transactional
public interface StealerService {
  /**
   * @param cmd
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public Lazy<StealerDto> create(CreateStealerCmd cmd);
}
