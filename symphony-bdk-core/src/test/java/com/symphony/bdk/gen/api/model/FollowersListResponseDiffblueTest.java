package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FollowersListResponseDiffblueTest {
  /**
   * Test {@link FollowersListResponse#addFollowersItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowersListResponse} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#addFollowersItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowersItem(Long); given FollowersListResponse (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersListResponse FollowersListResponse.addFollowersItem(Long)"})
  void testAddFollowersItem_givenFollowersListResponse() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();

    // Act and Assert
    assertSame(followersListResponse, followersListResponse.addFollowersItem(1L));
  }

  /**
   * Test {@link FollowersListResponse#addFollowersItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowersListResponse} (default constructor) followers {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#addFollowersItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowersItem(Long); given FollowersListResponse (default constructor) followers ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersListResponse FollowersListResponse.addFollowersItem(Long)"})
  void testAddFollowersItem_givenFollowersListResponseFollowersArrayList() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();
    followersListResponse.followers(new ArrayList<>());

    // Act and Assert
    assertSame(followersListResponse, followersListResponse.addFollowersItem(1L));
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}, and {@link FollowersListResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowersListResponse#equals(Object)}
   *   <li>{@link FollowersListResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();
    FollowersListResponse followersListResponse2 = new FollowersListResponse();

    // Act and Assert
    assertEquals(followersListResponse, followersListResponse2);
    int expectedHashCodeResult = followersListResponse.hashCode();
    assertEquals(expectedHashCodeResult, followersListResponse2.hashCode());
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}, and {@link FollowersListResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowersListResponse#equals(Object)}
   *   <li>{@link FollowersListResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();

    // Act and Assert
    assertEquals(followersListResponse, followersListResponse);
    int expectedHashCodeResult = followersListResponse.hashCode();
    assertEquals(expectedHashCodeResult, followersListResponse.hashCode());
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();
    followersListResponse.addFollowersItem(1L);

    // Act and Assert
    assertNotEquals(followersListResponse, new FollowersListResponse());
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();
    followersListResponse.count(3L);
    followersListResponse.addFollowersItem(1L);

    // Act and Assert
    assertNotEquals(followersListResponse, new FollowersListResponse());
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FollowersListResponse followersListResponse = new FollowersListResponse();
    followersListResponse.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(followersListResponse, new FollowersListResponse());
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowersListResponse(), null);
  }

  /**
   * Test {@link FollowersListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersListResponse.equals(Object)", "int FollowersListResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowersListResponse(), "Different type to FollowersListResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link FollowersListResponse}
   *   <li>{@link FollowersListResponse#count(Long)}
   *   <li>{@link FollowersListResponse#followers(List)}
   *   <li>{@link FollowersListResponse#pagination(Pagination)}
   *   <li>{@link FollowersListResponse#setCount(Long)}
   *   <li>{@link FollowersListResponse#setFollowers(List)}
   *   <li>{@link FollowersListResponse#setPagination(Pagination)}
   *   <li>{@link FollowersListResponse#toString()}
   *   <li>{@link FollowersListResponse#getCount()}
   *   <li>{@link FollowersListResponse#getFollowers()}
   *   <li>{@link FollowersListResponse#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FollowersListResponse.<init>()", "FollowersListResponse FollowersListResponse.count(Long)",
      "FollowersListResponse FollowersListResponse.followers(List)", "Long FollowersListResponse.getCount()",
      "List FollowersListResponse.getFollowers()", "Pagination FollowersListResponse.getPagination()",
      "FollowersListResponse FollowersListResponse.pagination(Pagination)", "void FollowersListResponse.setCount(Long)",
      "void FollowersListResponse.setFollowers(List)", "void FollowersListResponse.setPagination(Pagination)",
      "String FollowersListResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    FollowersListResponse actualFollowersListResponse = new FollowersListResponse();
    FollowersListResponse actualCountResult = actualFollowersListResponse.count(3L);
    FollowersListResponse actualFollowersResult = actualFollowersListResponse.followers(new ArrayList<>());
    FollowersListResponse actualPaginationResult = actualFollowersListResponse.pagination(new Pagination());
    actualFollowersListResponse.setCount(3L);
    ArrayList<Long> followers = new ArrayList<>();
    actualFollowersListResponse.setFollowers(followers);
    Pagination pagination = new Pagination();
    actualFollowersListResponse.setPagination(pagination);
    String actualToStringResult = actualFollowersListResponse.toString();
    Long actualCount = actualFollowersListResponse.getCount();
    List<Long> actualFollowers = actualFollowersListResponse.getFollowers();
    Pagination actualPagination = actualFollowersListResponse.getPagination();

    // Assert
    assertEquals("class FollowersListResponse {\n" + "    count: 3\n" + "    followers: []\n"
        + "    pagination: class Pagination {\n" + "        cursors: null\n" + "        previous: null\n"
        + "        next: null\n" + "    }\n" + "}", actualToStringResult);
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualFollowers.isEmpty());
    assertSame(actualFollowersListResponse, actualCountResult);
    assertSame(actualFollowersListResponse, actualFollowersResult);
    assertSame(actualFollowersListResponse, actualPaginationResult);
    assertSame(pagination, actualPagination);
    assertSame(followers, actualFollowers);
  }
}
