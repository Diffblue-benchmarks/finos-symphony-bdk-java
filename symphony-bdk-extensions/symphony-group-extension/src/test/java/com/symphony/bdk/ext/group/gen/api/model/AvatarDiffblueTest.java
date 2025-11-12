package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AvatarDiffblueTest {
  /**
   * Test {@link Avatar#equals(Object)}, and {@link Avatar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Avatar#equals(Object)}
   *   <li>{@link Avatar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Avatar avatar = new Avatar();
    Avatar avatar2 = new Avatar();

    // Act and Assert
    assertEquals(avatar, avatar2);
    assertEquals(avatar.hashCode(), avatar2.hashCode());
  }

  /**
   * Test {@link Avatar#equals(Object)}, and {@link Avatar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Avatar#equals(Object)}
   *   <li>{@link Avatar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Avatar avatar = new Avatar();

    // Act and Assert
    assertEquals(avatar, avatar);
    int expectedHashCodeResult = avatar.hashCode();
    assertEquals(expectedHashCodeResult, avatar.hashCode());
  }

  /**
   * Test {@link Avatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Avatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Avatar(), 1);
  }

  /**
   * Test {@link Avatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Avatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Avatar avatar = new Avatar();
    avatar.size("Size");

    // Act and Assert
    assertNotEquals(avatar, new Avatar());
  }

  /**
   * Test {@link Avatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Avatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Avatar avatar = new Avatar();
    avatar.url("https://example.org/example");

    // Act and Assert
    assertNotEquals(avatar, new Avatar());
  }

  /**
   * Test {@link Avatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Avatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Avatar(), null);
  }

  /**
   * Test {@link Avatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Avatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Avatar.equals(Object)", "int Avatar.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Avatar(), "Different type to Avatar");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Avatar}
   *   <li>{@link Avatar#setSize(String)}
   *   <li>{@link Avatar#setUrl(String)}
   *   <li>{@link Avatar#size(String)}
   *   <li>{@link Avatar#url(String)}
   *   <li>{@link Avatar#toString()}
   *   <li>{@link Avatar#getSize()}
   *   <li>{@link Avatar#getUrl()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Avatar.<init>()",
    "String Avatar.getSize()",
    "String Avatar.getUrl()",
    "void Avatar.setSize(String)",
    "void Avatar.setUrl(String)",
    "Avatar Avatar.size(String)",
    "String Avatar.toString()",
    "Avatar Avatar.url(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Avatar actualAvatar = new Avatar();
    actualAvatar.setSize("Size");
    actualAvatar.setUrl("https://example.org/example");
    Avatar actualSizeResult = actualAvatar.size("Size");
    Avatar actualUrlResult = actualAvatar.url("https://example.org/example");
    String actualToStringResult = actualAvatar.toString();
    String actualSize = actualAvatar.getSize();

    // Assert
    assertEquals("Size", actualSize);
    assertEquals(
        "class Avatar {\n    size: Size\n    url: https://example.org/example\n}",
        actualToStringResult);
    assertEquals("https://example.org/example", actualAvatar.getUrl());
    assertSame(actualAvatar, actualSizeResult);
    assertSame(actualAvatar, actualUrlResult);
  }
}
