/**
 */
package kr.lul.steal.api.design.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import kr.lul.api.Input;
import kr.lul.steal.domain.Stealer;
import lombok.Data;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Data
public class CreateStealerInput implements Input {
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  @NotNull
  @Size(min = 2, max = Stealer.NAME_LENGTH)
  private String name;
  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  private String bio;
}
