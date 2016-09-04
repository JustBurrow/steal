/**
 */
package kr.lul.steal.api.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.lul.steal.service.external.ServiceExternalAnchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Configuration
@ComponentScan(basePackageClasses = { ServiceExternalAnchor.class })
public class ApiRestConfiguration {
}
