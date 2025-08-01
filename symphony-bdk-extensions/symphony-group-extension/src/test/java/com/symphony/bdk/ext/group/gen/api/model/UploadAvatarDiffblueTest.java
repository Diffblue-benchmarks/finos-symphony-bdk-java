package com.symphony.bdk.ext.group.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UploadAvatarDiffblueTest {
  /**
   * Test {@link UploadAvatar#equals(Object)}, and {@link UploadAvatar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UploadAvatar#equals(Object)}
   *   <li>{@link UploadAvatar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UploadAvatar.equals(Object)", "int UploadAvatar.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UploadAvatar uploadAvatar = new UploadAvatar();
    UploadAvatar uploadAvatar2 = new UploadAvatar();

    // Act and Assert
    assertEquals(uploadAvatar, uploadAvatar2);
    int expectedHashCodeResult = uploadAvatar.hashCode();
    assertEquals(expectedHashCodeResult, uploadAvatar2.hashCode());
  }

  /**
   * Test {@link UploadAvatar#equals(Object)}, and {@link UploadAvatar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UploadAvatar#equals(Object)}
   *   <li>{@link UploadAvatar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UploadAvatar.equals(Object)", "int UploadAvatar.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UploadAvatar uploadAvatar = new UploadAvatar();

    // Act and Assert
    assertEquals(uploadAvatar, uploadAvatar);
    int expectedHashCodeResult = uploadAvatar.hashCode();
    assertEquals(expectedHashCodeResult, uploadAvatar.hashCode());
  }

  /**
   * Test {@link UploadAvatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UploadAvatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UploadAvatar.equals(Object)", "int UploadAvatar.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UploadAvatar(), null);
  }

  /**
   * Test {@link UploadAvatar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UploadAvatar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UploadAvatar.equals(Object)", "int UploadAvatar.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UploadAvatar(), "Different type to UploadAvatar");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UploadAvatar}
   *   <li>{@link UploadAvatar#image(byte[])}
   *   <li>{@link UploadAvatar#setImage(byte[])}
   *   <li>{@link UploadAvatar#toString()}
   *   <li>{@link UploadAvatar#getImage()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UploadAvatar.<init>()",
    "byte[] UploadAvatar.getImage()",
    "UploadAvatar UploadAvatar.image(byte[])",
    "void UploadAvatar.setImage(byte[])",
    "java.lang.String UploadAvatar.toString()"
  })
  void testGettersAndSetters() throws UnsupportedEncodingException {
    // Arrange and Act
    UploadAvatar actualUploadAvatar = new UploadAvatar();
    UploadAvatar actualImageResult = actualUploadAvatar.image("AXAXAXAX".getBytes("UTF-8"));
    byte[] image = "AXAXAXAX".getBytes("UTF-8");
    actualUploadAvatar.setImage(image);
    actualUploadAvatar.toString();
    byte[] actualImage = actualUploadAvatar.getImage();

    // Assert
    assertSame(actualUploadAvatar, actualImageResult);
    assertSame(image, actualImage);
    assertArrayEquals("AXAXAXAX".getBytes("UTF-8"), actualImage);
  }
}
