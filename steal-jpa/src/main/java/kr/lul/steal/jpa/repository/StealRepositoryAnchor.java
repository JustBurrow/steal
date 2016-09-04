/**
 */
package kr.lul.steal.jpa.repository;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public class StealRepositoryAnchor implements Anchor {
  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final Package PACKAGE      = StealRepositoryAnchor.class.getPackage();

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
  public StealRepositoryAnchor() {
    throw new UnsupportedOperationException();
  }
}
