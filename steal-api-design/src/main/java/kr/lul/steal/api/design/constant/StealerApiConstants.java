/**
 */
package kr.lul.steal.api.design.constant;

import kr.lul.api.ApiGroup;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
public abstract class StealerApiConstants {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final String   GROUP_NAME   = "/stealers";
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final ApiGroup GROUP        = () -> GROUP_NAME;

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final String   CREATE_INPUT = "/new";

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final String   CREATE       = "";

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  protected StealerApiConstants() {
    throw new UnsupportedOperationException();
  }
}
