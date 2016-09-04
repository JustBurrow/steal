/**
 */
package kr.lul.steal.api.design.output;

import java.time.Instant;

import kr.lul.api.Output;
import lombok.Data;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Data
public class StealerOutput implements Output {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private long    key;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private String  name;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private String  bio;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private Instant create;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private Instant update;
}
