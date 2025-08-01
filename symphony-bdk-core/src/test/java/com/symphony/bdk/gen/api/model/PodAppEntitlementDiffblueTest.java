package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PodAppEntitlementDiffblueTest {
  /**
   * Test {@link PodAppEntitlement#equals(Object)}, and {@link PodAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodAppEntitlement#equals(Object)}
   *   <li>{@link PodAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    PodAppEntitlement podAppEntitlement2 = new PodAppEntitlement();

    // Act and Assert
    assertEquals(podAppEntitlement, podAppEntitlement2);
    int expectedHashCodeResult = podAppEntitlement.hashCode();
    assertEquals(expectedHashCodeResult, podAppEntitlement2.hashCode());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}, and {@link PodAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodAppEntitlement#equals(Object)}
   *   <li>{@link PodAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();

    // Act and Assert
    assertEquals(podAppEntitlement, podAppEntitlement);
    int expectedHashCodeResult = podAppEntitlement.hashCode();
    assertEquals(expectedHashCodeResult, podAppEntitlement.hashCode());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodAppEntitlement(), 1);
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    podAppEntitlement.appId("42");

    // Act and Assert
    assertNotEquals(podAppEntitlement, new PodAppEntitlement());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    podAppEntitlement.appName("App Name");

    // Act and Assert
    assertNotEquals(podAppEntitlement, new PodAppEntitlement());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    podAppEntitlement.enable(true);

    // Act and Assert
    assertNotEquals(podAppEntitlement, new PodAppEntitlement());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    podAppEntitlement.listed(true);

    // Act and Assert
    assertNotEquals(podAppEntitlement, new PodAppEntitlement());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    PodAppEntitlement podAppEntitlement = new PodAppEntitlement();
    podAppEntitlement.install(true);

    // Act and Assert
    assertNotEquals(podAppEntitlement, new PodAppEntitlement());
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodAppEntitlement(), null);
  }

  /**
   * Test {@link PodAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodAppEntitlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PodAppEntitlement.equals(Object)",
    "int PodAppEntitlement.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodAppEntitlement(), "Different type to PodAppEntitlement");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link PodAppEntitlement}
   *   <li>{@link PodAppEntitlement#appId(String)}
   *   <li>{@link PodAppEntitlement#appName(String)}
   *   <li>{@link PodAppEntitlement#enable(Boolean)}
   *   <li>{@link PodAppEntitlement#install(Boolean)}
   *   <li>{@link PodAppEntitlement#listed(Boolean)}
   *   <li>{@link PodAppEntitlement#setAppId(String)}
   *   <li>{@link PodAppEntitlement#setAppName(String)}
   *   <li>{@link PodAppEntitlement#setEnable(Boolean)}
   *   <li>{@link PodAppEntitlement#setInstall(Boolean)}
   *   <li>{@link PodAppEntitlement#setListed(Boolean)}
   *   <li>{@link PodAppEntitlement#toString()}
   *   <li>{@link PodAppEntitlement#getAppId()}
   *   <li>{@link PodAppEntitlement#getAppName()}
   *   <li>{@link PodAppEntitlement#getEnable()}
   *   <li>{@link PodAppEntitlement#getInstall()}
   *   <li>{@link PodAppEntitlement#getListed()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PodAppEntitlement.<init>()",
    "PodAppEntitlement PodAppEntitlement.appId(String)",
    "PodAppEntitlement PodAppEntitlement.appName(String)",
    "PodAppEntitlement PodAppEntitlement.enable(Boolean)",
    "String PodAppEntitlement.getAppId()",
    "String PodAppEntitlement.getAppName()",
    "Boolean PodAppEntitlement.getEnable()",
    "Boolean PodAppEntitlement.getInstall()",
    "Boolean PodAppEntitlement.getListed()",
    "PodAppEntitlement PodAppEntitlement.install(Boolean)",
    "PodAppEntitlement PodAppEntitlement.listed(Boolean)",
    "void PodAppEntitlement.setAppId(String)",
    "void PodAppEntitlement.setAppName(String)",
    "void PodAppEntitlement.setEnable(Boolean)",
    "void PodAppEntitlement.setInstall(Boolean)",
    "void PodAppEntitlement.setListed(Boolean)",
    "String PodAppEntitlement.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    PodAppEntitlement actualPodAppEntitlement = new PodAppEntitlement();
    PodAppEntitlement actualAppIdResult = actualPodAppEntitlement.appId("42");
    PodAppEntitlement actualAppNameResult = actualPodAppEntitlement.appName("App Name");
    PodAppEntitlement actualEnableResult = actualPodAppEntitlement.enable(true);
    PodAppEntitlement actualInstallResult = actualPodAppEntitlement.install(true);
    PodAppEntitlement actualListedResult = actualPodAppEntitlement.listed(true);
    actualPodAppEntitlement.setAppId("42");
    actualPodAppEntitlement.setAppName("App Name");
    actualPodAppEntitlement.setEnable(true);
    actualPodAppEntitlement.setInstall(true);
    actualPodAppEntitlement.setListed(true);
    String actualToStringResult = actualPodAppEntitlement.toString();
    String actualAppId = actualPodAppEntitlement.getAppId();
    String actualAppName = actualPodAppEntitlement.getAppName();
    Boolean actualEnable = actualPodAppEntitlement.getEnable();
    Boolean actualInstall = actualPodAppEntitlement.getInstall();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("App Name", actualAppName);
    assertEquals(
        "class PodAppEntitlement {\n"
            + "    appId: 42\n"
            + "    appName: App Name\n"
            + "    enable: true\n"
            + "    listed: true\n"
            + "    install: true\n"
            + "}",
        actualToStringResult);
    assertTrue(actualEnable);
    assertTrue(actualInstall);
    assertTrue(actualPodAppEntitlement.getListed());
    assertSame(actualPodAppEntitlement, actualAppIdResult);
    assertSame(actualPodAppEntitlement, actualAppNameResult);
    assertSame(actualPodAppEntitlement, actualEnableResult);
    assertSame(actualPodAppEntitlement, actualInstallResult);
    assertSame(actualPodAppEntitlement, actualListedResult);
  }
}
