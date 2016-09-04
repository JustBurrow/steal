/**
 */
package kr.lul.api;

import lombok.Data;

/**
 * 다른 API의 정보를 제공한다.
 *
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Data
public class ApiOutput implements Output {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private ApiMethod                  method;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private String                  name;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private Class<? extends Input>  input;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private Class<? extends Output> output;

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public ApiOutput() {
  }

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   * @param method
   * @param name
   * @param input
   * @param output
   */
  public ApiOutput(ApiMethod method, String name, Class<? extends Input> input, Class<? extends Output> output) {
    this.method = method;
    this.name = name;
    this.input = input;
    this.output = output;
  }
}
