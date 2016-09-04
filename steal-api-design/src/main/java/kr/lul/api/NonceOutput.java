/**
 */
package kr.lul.api;

import java.time.Instant;

import lombok.Data;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Data
public class NonceOutput implements Output {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private Instant issued;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private int     ttl;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private String  nonce;
}
