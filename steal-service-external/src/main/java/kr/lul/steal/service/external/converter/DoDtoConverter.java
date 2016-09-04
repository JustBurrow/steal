/**
 */
package kr.lul.steal.service.external.converter;

/**
 * @author Just Burrow
 * @since 2016. 9. 4.
 * @param <DO>
 *          Domain Object(Domain Entity)
 * @param <DTO>
 *          Data Transfer Object
 */
public interface DoDtoConverter<DO, DTO> {
  /**
   * @param entity
   *          domain object(entity)
   * @return dto
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public DTO convert(DO entity);
}
