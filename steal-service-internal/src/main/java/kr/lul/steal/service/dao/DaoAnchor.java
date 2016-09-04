/**
 */
package kr.lul.steal.service.dao;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public abstract class DaoAnchor implements Anchor {
  public static final Package PACKAGE      = DaoAnchor.class.getPackage();

  public static final String  PACKAGE_NAME = PACKAGE.getName();

  protected DaoAnchor() {
    throw new UnsupportedOperationException();
  }
}
