/**
 */
package kr.lul.api;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
public interface ApiSignature {
  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public ApiMethod getApiMethod();

  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public ApiGroup getGroup();

  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public String getName();

  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public Class<? extends Input> getInput();

  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public Class<? extends Output> getOutput();
}
