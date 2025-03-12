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

class FollowersListDiffblueTest {
  /**
   * Test {@link FollowersList#addFollowersItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowersList} (default constructor) followers {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersList#addFollowersItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowersItem(Long); given FollowersList (default constructor) followers ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersList FollowersList.addFollowersItem(Long)"})
  void testAddFollowersItem_givenFollowersListFollowersArrayList() {
    // Arrange
    FollowersList followersList = new FollowersList();
    followersList.followers(new ArrayList<>());

    // Act and Assert
    assertSame(followersList, followersList.addFollowersItem(1L));
  }

  /**
   * Test {@link FollowersList#addFollowersItem(Long)}.
   * <ul>
   *   <li>Given {@link FollowersList} (default constructor).</li>
   *   <li>Then return Followers size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersList#addFollowersItem(Long)}
   */
  @Test
  @DisplayName("Test addFollowersItem(Long); given FollowersList (default constructor); then return Followers size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FollowersList FollowersList.addFollowersItem(Long)"})
  void testAddFollowersItem_givenFollowersList_thenReturnFollowersSizeIsOne() {
    // Arrange
    FollowersList followersList = new FollowersList();

    // Act
    FollowersList actualAddFollowersItemResult = followersList.addFollowersItem(1L);

    // Assert
    List<Long> followers = actualAddFollowersItemResult.getFollowers();
    assertEquals(1, followers.size());
    assertEquals(1L, followers.get(0).longValue());
    assertSame(followersList, actualAddFollowersItemResult);
  }

  /**
   * Test {@link FollowersList#equals(Object)}, and {@link FollowersList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowersList#equals(Object)}
   *   <li>{@link FollowersList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersList.equals(Object)", "int FollowersList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FollowersList followersList = new FollowersList();
    FollowersList followersList2 = new FollowersList();

    // Act and Assert
    assertEquals(followersList, followersList2);
    int expectedHashCodeResult = followersList.hashCode();
    assertEquals(expectedHashCodeResult, followersList2.hashCode());
  }

  /**
   * Test {@link FollowersList#equals(Object)}, and {@link FollowersList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FollowersList#equals(Object)}
   *   <li>{@link FollowersList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersList.equals(Object)", "int FollowersList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FollowersList followersList = new FollowersList();

    // Act and Assert
    assertEquals(followersList, followersList);
    int expectedHashCodeResult = followersList.hashCode();
    assertEquals(expectedHashCodeResult, followersList.hashCode());
  }

  /**
   * Test {@link FollowersList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersList.equals(Object)", "int FollowersList.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FollowersList followersList = new FollowersList();
    followersList.addFollowersItem(1L);

    // Act and Assert
    assertNotEquals(followersList, new FollowersList());
  }

  /**
   * Test {@link FollowersList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersList.equals(Object)", "int FollowersList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowersList(), null);
  }

  /**
   * Test {@link FollowersList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FollowersList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FollowersList.equals(Object)", "int FollowersList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FollowersList(), "Different type to FollowersList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link FollowersList}
   *   <li>{@link FollowersList#followers(List)}
   *   <li>{@link FollowersList#setFollowers(List)}
   *   <li>{@link FollowersList#toString()}
   *   <li>{@link FollowersList#getFollowers()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FollowersList.<init>()", "FollowersList FollowersList.followers(List)",
      "List FollowersList.getFollowers()", "void FollowersList.setFollowers(List)", "String FollowersList.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    FollowersList actualFollowersList = new FollowersList();
    FollowersList actualFollowersResult = actualFollowersList.followers(new ArrayList<>());
    ArrayList<Long> followers = new ArrayList<>();
    actualFollowersList.setFollowers(followers);
    String actualToStringResult = actualFollowersList.toString();
    List<Long> actualFollowers = actualFollowersList.getFollowers();

    // Assert
    assertEquals("class FollowersList {\n    followers: []\n}", actualToStringResult);
    assertTrue(actualFollowers.isEmpty());
    assertSame(actualFollowersList, actualFollowersResult);
    assertSame(followers, actualFollowers);
  }
}
