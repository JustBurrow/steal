/**
 */
package kr.lul.steal.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.lul.steal.jpa.entity.StealerEntity;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Repository
public interface StealerRepository extends JpaRepository<StealerEntity, Integer> {
}
