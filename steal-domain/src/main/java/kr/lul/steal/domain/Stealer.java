/**
 */
package kr.lul.steal.domain;

import kr.lul.data.IntIdDomainObject;

/**
 * 게임 내의 게임 플레이어.
 *
 * @author Just Burrow
 * @since 2016. 9. 3.
 */
public interface Stealer extends IntIdDomainObject {
  /**
   * 이름 최대 길이.
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final int    NAME_LENGTH = 50;
  /**
   * 이름 형식.
   *
   * @author Just Burrow
   * @since 2016. 9. 4.
   */
  public static final String NAME_REGEX  = "\\S.{0," + (NAME_LENGTH - 2) + "}\\S";

  /**
   * @return
   *         도둑놈 이름.
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public String getName();

  /**
   * @param name
   *          도둑놈 이름.
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public void setName(String name);

  /**
   * @return 도둑놈 자기 소개.
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public String getBio();

  /**
   * @param bio
   *          도둑놈 자기 소개.
   * @author Just Burrow
   * @since 2016. 9. 3.
   */
  public void setBio(String bio);
}
