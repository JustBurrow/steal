/**
 */
package kr.lul.steal.jpa.entity;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public class StealEntityAnchor implements Anchor {
  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final Package PACKAGE      = StealEntityAnchor.class.getPackage();

  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final String  PACKAGE_NAME = PACKAGE.getName();

  /**
   * 인스턴스 만들지 마세요.
   *
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  protected StealEntityAnchor() {
    throw new UnsupportedOperationException();
  }
}
