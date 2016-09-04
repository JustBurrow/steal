/**
 */
package kr.lul.steal.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.lul.steal.jpa.repository.StealerRepository;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Component
class StealerDaoImpl implements StealerDao {
  @Autowired
  private StealerRepository stealerRepository;
}
