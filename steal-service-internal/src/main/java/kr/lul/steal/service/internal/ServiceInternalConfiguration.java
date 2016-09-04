/**
 */
package kr.lul.steal.service.internal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.lul.steal.jpa.JpaAnchor;
import kr.lul.steal.service.dao.DaoAnchor;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Configuration
@ComponentScan(basePackageClasses = { DaoAnchor.class, JpaAnchor.class })
public class ServiceInternalConfiguration {
}
