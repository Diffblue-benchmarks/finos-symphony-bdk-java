package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProfileAllOfDiffblueTest {
  /**
   * Test {@link ProfileAllOf#addAvatarsItem(Avatar)}.
   *
   * <ul>
   *   <li>Given {@link ProfileAllOf} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName("Test addAvatarsItem(Avatar); given ProfileAllOf (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileAllOf ProfileAllOf.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenProfileAllOf() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();

    // Act
    ProfileAllOf actualAddAvatarsItemResult = profileAllOf.addAvatarsItem(new Avatar());

    // Assert
    assertSame(profileAllOf, actualAddAvatarsItemResult);
  }

  /**
   * Test {@link ProfileAllOf#addAvatarsItem(Avatar)}.
   *
   * <ul>
   *   <li>Given {@link ProfileAllOf} (default constructor) avatars {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#addAvatarsItem(Avatar)}
   */
  @Test
  @DisplayName(
      "Test addAvatarsItem(Avatar); given ProfileAllOf (default constructor) avatars ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProfileAllOf ProfileAllOf.addAvatarsItem(Avatar)"})
  void testAddAvatarsItem_givenProfileAllOfAvatarsArrayList() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();
    profileAllOf.avatars(new ArrayList<>());

    // Act
    ProfileAllOf actualAddAvatarsItemResult = profileAllOf.addAvatarsItem(new Avatar());

    // Assert
    assertSame(profileAllOf, actualAddAvatarsItemResult);
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}, and {@link ProfileAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ProfileAllOf#equals(Object)}
   *   <li>{@link ProfileAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();
    ProfileAllOf profileAllOf2 = new ProfileAllOf();

    // Act and Assert
    assertEquals(profileAllOf, profileAllOf2);
    assertEquals(profileAllOf.hashCode(), profileAllOf2.hashCode());
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}, and {@link ProfileAllOf#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ProfileAllOf#equals(Object)}
   *   <li>{@link ProfileAllOf#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();

    // Act and Assert
    assertEquals(profileAllOf, profileAllOf);
    int expectedHashCodeResult = profileAllOf.hashCode();
    assertEquals(expectedHashCodeResult, profileAllOf.hashCode());
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();
    profileAllOf.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(profileAllOf, new ProfileAllOf());
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ProfileAllOf profileAllOf = new ProfileAllOf();
    profileAllOf.id("42");
    profileAllOf.addAvatarsItem(new Avatar());

    // Act and Assert
    assertNotEquals(profileAllOf, new ProfileAllOf());
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProfileAllOf(), null);
  }

  /**
   * Test {@link ProfileAllOf#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ProfileAllOf#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProfileAllOf.equals(Object)", "int ProfileAllOf.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProfileAllOf(), "Different type to ProfileAllOf");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ProfileAllOf}
   *   <li>{@link ProfileAllOf#avatars(List)}
   *   <li>{@link ProfileAllOf#id(String)}
   *   <li>{@link ProfileAllOf#setAvatars(List)}
   *   <li>{@link ProfileAllOf#setId(String)}
   *   <li>{@link ProfileAllOf#toString()}
   *   <li>{@link ProfileAllOf#getAvatars()}
   *   <li>{@link ProfileAllOf#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ProfileAllOf.<init>()",
    "ProfileAllOf ProfileAllOf.avatars(List)",
    "List ProfileAllOf.getAvatars()",
    "String ProfileAllOf.getId()",
    "ProfileAllOf ProfileAllOf.id(String)",
    "void ProfileAllOf.setAvatars(List)",
    "void ProfileAllOf.setId(String)",
    "String ProfileAllOf.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ProfileAllOf actualProfileAllOf = new ProfileAllOf();
    ProfileAllOf actualAvatarsResult = actualProfileAllOf.avatars(new ArrayList<>());
    ProfileAllOf actualIdResult = actualProfileAllOf.id("42");
    ArrayList<Avatar> avatars = new ArrayList<>();
    actualProfileAllOf.setAvatars(avatars);
    actualProfileAllOf.setId("42");
    String actualToStringResult = actualProfileAllOf.toString();
    List<Avatar> actualAvatars = actualProfileAllOf.getAvatars();

    // Assert
    assertEquals("42", actualProfileAllOf.getId());
    assertEquals("class ProfileAllOf {\n    id: 42\n    avatars: []\n}", actualToStringResult);
    assertTrue(actualAvatars.isEmpty());
    assertSame(actualProfileAllOf, actualAvatarsResult);
    assertSame(actualProfileAllOf, actualIdResult);
    assertSame(avatars, actualAvatars);
  }
}
