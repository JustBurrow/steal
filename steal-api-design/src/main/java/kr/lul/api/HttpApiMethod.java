/**
 */
package kr.lul.api;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
public enum HttpApiMethod implements ApiMethod {
  /**
   * Create
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  POST(RestApiMethod.CREATE),
  /**
   * Read
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  GET(RestApiMethod.READ),
  /**
   * Update
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  PATCH(RestApiMethod.UPDATE),
  /**
   * Delete
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  DELETE(RestApiMethod.DELETE);

  private RestApiMethod restApiMethod;

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   * @param restApiMethod
   */
  private HttpApiMethod(RestApiMethod restApiMethod) {
    this.restApiMethod = restApiMethod;
  }

  /**
   * @return
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public RestApiMethod getRestApiMethod() {
    return this.restApiMethod;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>Method
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public String getName() {
    return this.name();
  }
}
