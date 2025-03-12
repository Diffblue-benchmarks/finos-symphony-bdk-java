package com.symphony.bdk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.gen.api.model.UserV2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SymphonyBdkTestContextDiffblueTest {
  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}, and {@link SymphonyBdkTestContext#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkTestContext#equals(Object)}
   *   <li>{@link SymphonyBdkTestContext#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SymphonyBdkTestContext symphonyBdkTestContext = new SymphonyBdkTestContext(new UserV2());
    SymphonyBdkTestContext symphonyBdkTestContext2 = new SymphonyBdkTestContext(new UserV2());

    // Act and Assert
    assertEquals(symphonyBdkTestContext, symphonyBdkTestContext2);
    int expectedHashCodeResult = symphonyBdkTestContext.hashCode();
    assertEquals(expectedHashCodeResult, symphonyBdkTestContext2.hashCode());
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}, and {@link SymphonyBdkTestContext#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkTestContext#equals(Object)}
   *   <li>{@link SymphonyBdkTestContext#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    SymphonyBdkTestContext symphonyBdkTestContext = new SymphonyBdkTestContext(null);
    SymphonyBdkTestContext symphonyBdkTestContext2 = new SymphonyBdkTestContext(null);

    // Act and Assert
    assertEquals(symphonyBdkTestContext, symphonyBdkTestContext2);
    int expectedHashCodeResult = symphonyBdkTestContext.hashCode();
    assertEquals(expectedHashCodeResult, symphonyBdkTestContext2.hashCode());
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}, and {@link SymphonyBdkTestContext#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkTestContext#equals(Object)}
   *   <li>{@link SymphonyBdkTestContext#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SymphonyBdkTestContext symphonyBdkTestContext = new SymphonyBdkTestContext(new UserV2());

    // Act and Assert
    assertEquals(symphonyBdkTestContext, symphonyBdkTestContext);
    int expectedHashCodeResult = symphonyBdkTestContext.hashCode();
    assertEquals(expectedHashCodeResult, symphonyBdkTestContext.hashCode());
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestContext#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SymphonyBdkTestContext symphonyBdkTestContext = new SymphonyBdkTestContext(null);

    // Act and Assert
    assertNotEquals(symphonyBdkTestContext, new SymphonyBdkTestContext(new UserV2()));
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestContext#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SymphonyBdkTestContext symphonyBdkTestContext = new SymphonyBdkTestContext(mock(UserV2.class));

    // Act and Assert
    assertNotEquals(symphonyBdkTestContext, new SymphonyBdkTestContext(new UserV2()));
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestContext#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SymphonyBdkTestContext(new UserV2()), null);
  }

  /**
   * Test {@link SymphonyBdkTestContext#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SymphonyBdkTestContext#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SymphonyBdkTestContext.equals(Object)", "int SymphonyBdkTestContext.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SymphonyBdkTestContext(new UserV2()), "Different type to SymphonyBdkTestContext");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SymphonyBdkTestContext#SymphonyBdkTestContext(UserV2)}
   *   <li>{@link SymphonyBdkTestContext#toString()}
   *   <li>{@link SymphonyBdkTestContext#getBotInfo()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SymphonyBdkTestContext.<init>(UserV2)", "UserV2 SymphonyBdkTestContext.getBotInfo()",
      "String SymphonyBdkTestContext.toString()"})
  void testGettersAndSetters() {
    // Arrange
    UserV2 botInfo = new UserV2();

    // Act
    SymphonyBdkTestContext actualSymphonyBdkTestContext = new SymphonyBdkTestContext(botInfo);
    String actualToStringResult = actualSymphonyBdkTestContext.toString();

    // Assert
    assertEquals("SymphonyBdkTestContext(botInfo=class UserV2 {\n" + "    id: null\n" + "    emailAddress: null\n"
        + "    firstName: null\n" + "    lastName: null\n" + "    displayName: null\n" + "    title: null\n"
        + "    company: null\n" + "    username: null\n" + "    location: null\n" + "    accountType: null\n"
        + "    avatars: null\n" + "    workPhoneNumber: null\n" + "    mobilePhoneNumber: null\n"
        + "    jobFunction: null\n" + "    department: null\n" + "    division: null\n" + "    roles: null\n" + "})",
        actualToStringResult);
    assertSame(botInfo, actualSymphonyBdkTestContext.getBotInfo());
  }
}
