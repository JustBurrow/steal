/**
 */
package kr.lul.steal.api.design.signature;

import kr.lul.api.ApiGroup;
import kr.lul.api.ApiMethod;
import kr.lul.api.ApiSignature;
import kr.lul.api.Input;
import kr.lul.api.NonceOutput;
import kr.lul.api.Output;
import kr.lul.api.RestApiMethod;
import kr.lul.steal.api.design.constant.StealerApiConstants;
import kr.lul.steal.api.design.input.CreateStealerInput;
import kr.lul.steal.api.design.output.StealerOutput;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
public enum StealerApis implements ApiSignature {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  CREATE_INPUT(RestApiMethod.READ, StealerApiConstants.GROUP, StealerApiConstants.CREATE_INPUT,
      null, NonceOutput.class),
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  CREATE(RestApiMethod.CREATE, StealerApiConstants.GROUP, StealerApiConstants.CREATE,
      CreateStealerInput.class, StealerOutput.class);

  private ApiMethod               method;
  private ApiGroup                group;
  private String                  name;
  private Class<? extends Input>  input;
  private Class<? extends Output> output;

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   * @param method
   * @param group
   * @param name
   * @param input
   * @param output
   */
  private StealerApis(ApiMethod method, ApiGroup group, String name,
      Class<? extends Input> input, Class<? extends Output> output) {
    this.method = method;
    this.group = group;
    this.name = name;
    this.input = input;
    this.output = output;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>ApiSignature
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public ApiMethod getApiMethod() {
    return this.method;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public ApiGroup getGroup() {
    return this.group;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public String getName() {
    return this.name;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public Class<? extends Input> getInput() {
    return this.input;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @Override
  public Class<? extends Output> getOutput() {
    return this.output;
  }
}
