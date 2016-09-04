/**
 */
package kr.lul.steal.jpa.configuration;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public class StealJpaConfigurationAnchor implements Anchor {
  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final Package PACKAGE      = StealJpaConfigurationAnchor.class.getPackage();

  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final String  PACKAGE_NAME = PACKAGE.getName();

  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public StealJpaConfigurationAnchor() {
    throw new UnsupportedOperationException();
  }
}
