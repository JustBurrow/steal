/**
 */
package kr.lul.steal.service.external;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public abstract class ServiceExternalAnchor implements Anchor {
  public static final Package PACKAGE      = ServiceExternalAnchor.class.getPackage();

  public static final String  PACKAGE_NAME = PACKAGE.getName();

  protected ServiceExternalAnchor() {
    throw new UnsupportedOperationException();
  }
}
