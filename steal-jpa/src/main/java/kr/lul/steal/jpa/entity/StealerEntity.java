/**
 */
package kr.lul.steal.jpa.entity;

import static kr.lul.steal.jpa.mapping.StealerMapping.ENTITY;
import static kr.lul.steal.jpa.mapping.StealerMapping.TABLE;
import static kr.lul.steal.jpa.mapping.StealerMapping.Table.BIO;
import static kr.lul.steal.jpa.mapping.StealerMapping.Table.NAME;
import static kr.lul.steal.jpa.mapping.StealerMapping.Table.Index.UQ_STEALER_NAME;
import static kr.lul.util.Asserts.matches;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kr.lul.spring.data.jpa.common.entity.AbstractIntIdEntity;
import kr.lul.steal.domain.Stealer;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
@Entity(name = ENTITY)
@Table(name = TABLE,
    uniqueConstraints = { @UniqueConstraint(name = UQ_STEALER_NAME, columnNames = { NAME }) })
public class StealerEntity extends AbstractIntIdEntity implements Stealer {
  @Column(name = NAME, length = NAME_LENGTH, unique = true, nullable = false)
  private String name;
  @Column(name = BIO)
  private String bio;

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public StealerEntity() {
  }

  /**
   * @author Just Burrow
   * @since 2016. 9. 4.
   * @param name
   * @param bio
   */
  public StealerEntity(String name, String bio) {
    this.setName(name);
    this.setBio(bio);
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <I>Stealer
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  public String getName() {
    return this.name;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  public void setName(String name) {
    matches(name, NAME_REGEX, "name");
    this.name = name;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  public String getBio() {
    return this.bio;
  }

  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  public void setBio(String bio) {
    this.bio = bio;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // <A>AbstractIntIdEntity
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  protected Class<? extends AbstractIntIdEntity> implClass() {
    return StealerEntity.class;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Object
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /*
   * (non-Javadoc)
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  @Override
  public String toString() {
    return new StringBuilder(StealerEntity.class.getSimpleName())
        .append(" [name=").append(this.name)
        .append(", bio=").append(this.bio)
        .append("]").toString();
  }
}
