package com.symphony.bdk.gen.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ApplicationInfoDiffblueTest {
  /**
   * Test {@link ApplicationInfo#equals(Object)}, and {@link ApplicationInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApplicationInfo#equals(Object)}
   *   <li>{@link ApplicationInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    ApplicationInfo applicationInfo2 = new ApplicationInfo();

    // Act and Assert
    assertEquals(applicationInfo, applicationInfo2);
    int expectedHashCodeResult = applicationInfo.hashCode();
    assertEquals(expectedHashCodeResult, applicationInfo2.hashCode());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}, and {@link ApplicationInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApplicationInfo#equals(Object)}
   *   <li>{@link ApplicationInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();

    // Act and Assert
    assertEquals(applicationInfo, applicationInfo);
    int expectedHashCodeResult = applicationInfo.hashCode();
    assertEquals(expectedHashCodeResult, applicationInfo.hashCode());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationInfo(), 1);
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    applicationInfo.appId("42");

    // Act and Assert
    assertNotEquals(applicationInfo, new ApplicationInfo());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    applicationInfo.name("Name");

    // Act and Assert
    assertNotEquals(applicationInfo, new ApplicationInfo());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    applicationInfo.appUrl("https://example.org/example");

    // Act and Assert
    assertNotEquals(applicationInfo, new ApplicationInfo());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    applicationInfo.domain("Domain");

    // Act and Assert
    assertNotEquals(applicationInfo, new ApplicationInfo());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo();
    applicationInfo.publisher("Publisher");

    // Act and Assert
    assertNotEquals(applicationInfo, new ApplicationInfo());
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationInfo(), null);
  }

  /**
   * Test {@link ApplicationInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApplicationInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean ApplicationInfo.equals(Object)", "int ApplicationInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationInfo(), "Different type to ApplicationInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ApplicationInfo}
   *   <li>{@link ApplicationInfo#appId(String)}
   *   <li>{@link ApplicationInfo#appUrl(String)}
   *   <li>{@link ApplicationInfo#domain(String)}
   *   <li>{@link ApplicationInfo#name(String)}
   *   <li>{@link ApplicationInfo#publisher(String)}
   *   <li>{@link ApplicationInfo#setAppId(String)}
   *   <li>{@link ApplicationInfo#setAppUrl(String)}
   *   <li>{@link ApplicationInfo#setDomain(String)}
   *   <li>{@link ApplicationInfo#setName(String)}
   *   <li>{@link ApplicationInfo#setPublisher(String)}
   *   <li>{@link ApplicationInfo#toString()}
   *   <li>{@link ApplicationInfo#getAppId()}
   *   <li>{@link ApplicationInfo#getAppUrl()}
   *   <li>{@link ApplicationInfo#getDomain()}
   *   <li>{@link ApplicationInfo#getName()}
   *   <li>{@link ApplicationInfo#getPublisher()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ApplicationInfo.<init>()", "ApplicationInfo ApplicationInfo.appId(String)",
      "ApplicationInfo ApplicationInfo.appUrl(String)", "ApplicationInfo ApplicationInfo.domain(String)",
      "String ApplicationInfo.getAppId()", "String ApplicationInfo.getAppUrl()", "String ApplicationInfo.getDomain()",
      "String ApplicationInfo.getName()", "String ApplicationInfo.getPublisher()",
      "ApplicationInfo ApplicationInfo.name(String)", "ApplicationInfo ApplicationInfo.publisher(String)",
      "void ApplicationInfo.setAppId(String)", "void ApplicationInfo.setAppUrl(String)",
      "void ApplicationInfo.setDomain(String)", "void ApplicationInfo.setName(String)",
      "void ApplicationInfo.setPublisher(String)", "String ApplicationInfo.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    ApplicationInfo actualApplicationInfo = new ApplicationInfo();
    ApplicationInfo actualAppIdResult = actualApplicationInfo.appId("42");
    ApplicationInfo actualAppUrlResult = actualApplicationInfo.appUrl("https://example.org/example");
    ApplicationInfo actualDomainResult = actualApplicationInfo.domain("Domain");
    ApplicationInfo actualNameResult = actualApplicationInfo.name("Name");
    ApplicationInfo actualPublisherResult = actualApplicationInfo.publisher("Publisher");
    actualApplicationInfo.setAppId("42");
    actualApplicationInfo.setAppUrl("https://example.org/example");
    actualApplicationInfo.setDomain("Domain");
    actualApplicationInfo.setName("Name");
    actualApplicationInfo.setPublisher("Publisher");
    String actualToStringResult = actualApplicationInfo.toString();
    String actualAppId = actualApplicationInfo.getAppId();
    String actualAppUrl = actualApplicationInfo.getAppUrl();
    String actualDomain = actualApplicationInfo.getDomain();
    String actualName = actualApplicationInfo.getName();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("Domain", actualDomain);
    assertEquals("Name", actualName);
    assertEquals("Publisher", actualApplicationInfo.getPublisher());
    assertEquals(
        "class ApplicationInfo {\n" + "    appId: 42\n" + "    name: Name\n"
            + "    appUrl: https://example.org/example\n" + "    domain: Domain\n" + "    publisher: Publisher\n" + "}",
        actualToStringResult);
    assertEquals("https://example.org/example", actualAppUrl);
    assertSame(actualApplicationInfo, actualAppIdResult);
    assertSame(actualApplicationInfo, actualAppUrlResult);
    assertSame(actualApplicationInfo, actualDomainResult);
    assertSame(actualApplicationInfo, actualNameResult);
    assertSame(actualApplicationInfo, actualPublisherResult);
  }
}
