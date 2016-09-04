/**
 */
package kr.lul.steal.service.command;

import lombok.Data;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 */
@Data
public class CreateStealerCmd {
  private long   account;
  private String name;
  private String bio;
}
