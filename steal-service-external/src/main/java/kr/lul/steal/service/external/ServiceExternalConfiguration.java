/**
 */
package kr.lul.steal.service.external;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.lul.steal.service.internal.ServiceInternalAnchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Configuration
@ComponentScan(basePackageClasses = { ServiceInternalAnchor.class })
public class ServiceExternalConfiguration {
}
