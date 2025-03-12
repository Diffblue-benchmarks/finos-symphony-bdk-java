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

class FollowingListResponseDiffblueTest {
  /**
   * Test {@link FollowingListResponse#addFollowingItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowingListResponse} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#addFollowingItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowingItem(Long); given FollowingListResponse (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowingListResponse FollowingListResponse.addFollowingItem(Long)"})
  void testAddFollowingItem_givenFollowingListResponse() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();

    // Act and Assert
    assertSame(followingListResponse, followingListResponse.addFollowingItem(1L));
  }

  /**
   * Test {@link FollowingListResponse#addFollowingItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowingListResponse} (default constructor) following {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#addFollowingItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowingItem(Long); given FollowingListResponse (default constructor) following ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowingListResponse FollowingListResponse.addFollowingItem(Long)"})
  void testAddFollowingItem_givenFollowingListResponseFollowingArrayList() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();
    followingListResponse.following(new ArrayList<>());

    // Act and Assert
    assertSame(followingListResponse, followingListResponse.addFollowingItem(1L));
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}, and {@link FollowingListResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowingListResponse#equals(Object)}
   *   <li>{@link FollowingListResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();
    FollowingListResponse followingListResponse2 = new FollowingListResponse();

    // Act and Assert
    assertEquals(followingListResponse, followingListResponse2);
    int expectedHashCodeResult = followingListResponse.hashCode();
    assertEquals(expectedHashCodeResult, followingListResponse2.hashCode());
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}, and {@link FollowingListResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowingListResponse#equals(Object)}
   *   <li>{@link FollowingListResponse#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();

    // Act and Assert
    assertEquals(followingListResponse, followingListResponse);
    int expectedHashCodeResult = followingListResponse.hashCode();
    assertEquals(expectedHashCodeResult, followingListResponse.hashCode());
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();
    followingListResponse.addFollowingItem(1L);

    // Act and Assert
    assertNotEquals(followingListResponse, new FollowingListResponse());
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();
    followingListResponse.count(3L);
    followingListResponse.addFollowingItem(1L);

    // Act and Assert
    assertNotEquals(followingListResponse, new FollowingListResponse());
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FollowingListResponse followingListResponse = new FollowingListResponse();
    followingListResponse.pagination(new Pagination());

    // Act and Assert
    assertNotEquals(followingListResponse, new FollowingListResponse());
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowingListResponse(), null);
  }

  /**
   * Test {@link FollowingListResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowingListResponse#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowingListResponse.equals(Object)", "int FollowingListResponse.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowingListResponse(), "Different type to FollowingListResponse");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link FollowingListResponse}
   *   <li>{@link FollowingListResponse#count(Long)}
   *   <li>{@link FollowingListResponse#following(List)}
   *   <li>{@link FollowingListResponse#pagination(Pagination)}
   *   <li>{@link FollowingListResponse#setCount(Long)}
   *   <li>{@link FollowingListResponse#setFollowing(List)}
   *   <li>{@link FollowingListResponse#setPagination(Pagination)}
   *   <li>{@link FollowingListResponse#toString()}
   *   <li>{@link FollowingListResponse#getCount()}
   *   <li>{@link FollowingListResponse#getFollowing()}
   *   <li>{@link FollowingListResponse#getPagination()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FollowingListResponse.<init>()", "FollowingListResponse FollowingListResponse.count(Long)",
      "FollowingListResponse FollowingListResponse.following(List)", "Long FollowingListResponse.getCount()",
      "List FollowingListResponse.getFollowing()", "Pagination FollowingListResponse.getPagination()",
      "FollowingListResponse FollowingListResponse.pagination(Pagination)", "void FollowingListResponse.setCount(Long)",
      "void FollowingListResponse.setFollowing(List)", "void FollowingListResponse.setPagination(Pagination)",
      "String FollowingListResponse.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    FollowingListResponse actualFollowingListResponse = new FollowingListResponse();
    FollowingListResponse actualCountResult = actualFollowingListResponse.count(3L);
    FollowingListResponse actualFollowingResult = actualFollowingListResponse.following(new ArrayList<>());
    FollowingListResponse actualPaginationResult = actualFollowingListResponse.pagination(new Pagination());
    actualFollowingListResponse.setCount(3L);
    ArrayList<Long> following = new ArrayList<>();
    actualFollowingListResponse.setFollowing(following);
    Pagination pagination = new Pagination();
    actualFollowingListResponse.setPagination(pagination);
    String actualToStringResult = actualFollowingListResponse.toString();
    Long actualCount = actualFollowingListResponse.getCount();
    List<Long> actualFollowing = actualFollowingListResponse.getFollowing();
    Pagination actualPagination = actualFollowingListResponse.getPagination();

    // Assert
    assertEquals("class FollowingListResponse {\n" + "    count: 3\n" + "    following: []\n"
        + "    pagination: class Pagination {\n" + "        cursors: null\n" + "        previous: null\n"
        + "        next: null\n" + "    }\n" + "}", actualToStringResult);
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualFollowing.isEmpty());
    assertSame(actualFollowingListResponse, actualCountResult);
    assertSame(actualFollowingListResponse, actualFollowingResult);
    assertSame(actualFollowingListResponse, actualPaginationResult);
    assertSame(pagination, actualPagination);
    assertSame(following, actualFollowing);
  }
}
