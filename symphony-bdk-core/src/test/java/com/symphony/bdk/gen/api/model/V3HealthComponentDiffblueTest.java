package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class V3HealthComponentDiffblueTest {
  /**
   * Test {@link V3HealthComponent#equals(Object)}, and {@link V3HealthComponent#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3HealthComponent#equals(Object)}
   *   <li>{@link V3HealthComponent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();
    V3HealthComponent v3HealthComponent2 = new V3HealthComponent();

    // Act and Assert
    assertEquals(v3HealthComponent, v3HealthComponent2);
    int expectedHashCodeResult = v3HealthComponent.hashCode();
    assertEquals(expectedHashCodeResult, v3HealthComponent2.hashCode());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}, and {@link V3HealthComponent#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3HealthComponent#equals(Object)}
   *   <li>{@link V3HealthComponent#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();

    // Act and Assert
    assertEquals(v3HealthComponent, v3HealthComponent);
    int expectedHashCodeResult = v3HealthComponent.hashCode();
    assertEquals(expectedHashCodeResult, v3HealthComponent.hashCode());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3HealthComponent(), 1);
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();
    v3HealthComponent.authType(V3HealthAuthType.RSA);

    // Act and Assert
    assertNotEquals(v3HealthComponent, new V3HealthComponent());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();
    v3HealthComponent.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(v3HealthComponent, new V3HealthComponent());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();
    v3HealthComponent.status(V3HealthStatus.UP);

    // Act and Assert
    assertNotEquals(v3HealthComponent, new V3HealthComponent());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V3HealthComponent v3HealthComponent = new V3HealthComponent();
    v3HealthComponent.version("1.0.2");

    // Act and Assert
    assertNotEquals(v3HealthComponent, new V3HealthComponent());
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3HealthComponent(), null);
  }

  /**
   * Test {@link V3HealthComponent#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3HealthComponent#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean V3HealthComponent.equals(Object)", "int V3HealthComponent.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3HealthComponent(), "Different type to V3HealthComponent");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3HealthComponent}
   *   <li>{@link V3HealthComponent#authType(V3HealthAuthType)}
   *   <li>{@link V3HealthComponent#message(String)}
   *   <li>{@link V3HealthComponent#setAuthType(V3HealthAuthType)}
   *   <li>{@link V3HealthComponent#setMessage(String)}
   *   <li>{@link V3HealthComponent#setStatus(V3HealthStatus)}
   *   <li>{@link V3HealthComponent#setVersion(String)}
   *   <li>{@link V3HealthComponent#status(V3HealthStatus)}
   *   <li>{@link V3HealthComponent#version(String)}
   *   <li>{@link V3HealthComponent#toString()}
   *   <li>{@link V3HealthComponent#getAuthType()}
   *   <li>{@link V3HealthComponent#getMessage()}
   *   <li>{@link V3HealthComponent#getStatus()}
   *   <li>{@link V3HealthComponent#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void V3HealthComponent.<init>()",
      "V3HealthComponent V3HealthComponent.authType(V3HealthAuthType)",
      "V3HealthAuthType V3HealthComponent.getAuthType()", "String V3HealthComponent.getMessage()",
      "V3HealthStatus V3HealthComponent.getStatus()", "String V3HealthComponent.getVersion()",
      "V3HealthComponent V3HealthComponent.message(String)", "void V3HealthComponent.setAuthType(V3HealthAuthType)",
      "void V3HealthComponent.setMessage(String)", "void V3HealthComponent.setStatus(V3HealthStatus)",
      "void V3HealthComponent.setVersion(String)", "V3HealthComponent V3HealthComponent.status(V3HealthStatus)",
      "String V3HealthComponent.toString()", "V3HealthComponent V3HealthComponent.version(String)"})
  void testGettersAndSetters() {
    // Arrange and Act
    V3HealthComponent actualV3HealthComponent = new V3HealthComponent();
    V3HealthComponent actualAuthTypeResult = actualV3HealthComponent.authType(V3HealthAuthType.RSA);
    V3HealthComponent actualMessageResult = actualV3HealthComponent.message("Not all who wander are lost");
    actualV3HealthComponent.setAuthType(V3HealthAuthType.RSA);
    actualV3HealthComponent.setMessage("Not all who wander are lost");
    actualV3HealthComponent.setStatus(V3HealthStatus.UP);
    actualV3HealthComponent.setVersion("1.0.2");
    V3HealthComponent actualStatusResult = actualV3HealthComponent.status(V3HealthStatus.UP);
    V3HealthComponent actualVersionResult = actualV3HealthComponent.version("1.0.2");
    String actualToStringResult = actualV3HealthComponent.toString();
    V3HealthAuthType actualAuthType = actualV3HealthComponent.getAuthType();
    String actualMessage = actualV3HealthComponent.getMessage();
    V3HealthStatus actualStatus = actualV3HealthComponent.getStatus();

    // Assert
    assertEquals("1.0.2", actualV3HealthComponent.getVersion());
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("class V3HealthComponent {\n" + "    authType: RSA\n" + "    message: Not all who wander are lost\n"
        + "    status: UP\n" + "    version: 1.0.2\n" + "}", actualToStringResult);
    assertEquals(V3HealthAuthType.RSA, actualAuthType);
    assertEquals(V3HealthStatus.UP, actualStatus);
    assertSame(actualV3HealthComponent, actualAuthTypeResult);
    assertSame(actualV3HealthComponent, actualMessageResult);
    assertSame(actualV3HealthComponent, actualStatusResult);
    assertSame(actualV3HealthComponent, actualVersionResult);
  }
}
