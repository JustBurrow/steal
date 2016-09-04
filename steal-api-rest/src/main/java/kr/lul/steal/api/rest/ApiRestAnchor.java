/**
 */
package kr.lul.steal.api.rest;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public abstract class ApiRestAnchor implements Anchor {
  public static final Package PACKAGE      = ApiRestAnchor.class.getPackage();

  public static final String  PACKAGE_NAME = PACKAGE.getName();

  protected ApiRestAnchor() {
    throw new UnsupportedOperationException();
  }
}
