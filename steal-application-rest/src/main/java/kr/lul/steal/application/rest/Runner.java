/**
 */
package kr.lul.steal.application.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.lul.steal.api.rest.ApiRestAnchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@SpringBootApplication(scanBasePackageClasses = { ApiRestAnchor.class })
public class Runner {
  /**
   * @param args
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }
}
