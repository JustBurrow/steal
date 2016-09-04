/**
 */
package kr.lul.steal.service.internal;

import kr.lul.util.Anchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public class ServiceInternalAnchor implements Anchor {
  public static final Package PACKAGE      = ServiceInternalAnchor.class.getPackage();

  public static final String  PACKAGE_NAME = PACKAGE.getName();

  protected ServiceInternalAnchor() {
    throw new UnsupportedOperationException();
  }
}
