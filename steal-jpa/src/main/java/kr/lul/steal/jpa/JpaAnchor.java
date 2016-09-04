/**
 */
package kr.lul.steal.jpa;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public class JpaAnchor implements Anchor {
  public static final Package PACKAGE      = JpaAnchor.class.getPackage();

  public static final String  PACKAGE_NAME = PACKAGE.getName();

  protected JpaAnchor() {
    throw new UnsupportedOperationException();
  }
}
