/**
 */
package kr.lul.steal.jpa.mapping;

import kr.lul.spring.data.jpa.common.mapping.IdMapping;

/**
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public abstract class StealerMapping {
  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final String ENTITY = "Stealer";
  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static final String TABLE  = "user_stealer";

  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static abstract class Entity extends IdMapping.IdEntity {
    /**
     * @author Just Burrow
     * @since 2016. 9. 3.
     */
    public static final String NAME = "name";
    /**
     * @author Just Burrow
     * @since 2016. 9. 3.
     */
    public static final String BIO  = "bio";

    public Entity() {
      throw new UnsupportedOperationException();
    }
  }

  /**
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public static abstract class Table extends IdMapping.IdTable {
    /**
     * @author Just Burrow
     * @since 2016. 9. 3.
     */
    public static final String NAME = Entity.NAME;

    /**
     * @author Just Burrow
     * @since 2016. 9. 3.
     */
    public static final String BIO  = Entity.BIO;

    public static abstract class Index {
      public static final String UQ_STEALER_NAME = "UQ_STEALER_NAME";

      public Index() {
        throw new UnsupportedOperationException();
      }
    }

    public Table() {
      throw new UnsupportedOperationException();
    }
  }

  public StealerMapping() {
    throw new UnsupportedOperationException();
  }
}
