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

class AgentInfoDiffblueTest {
  /**
   * Test {@link AgentInfo#equals(Object)}, and {@link AgentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AgentInfo#equals(Object)}
   *   <li>{@link AgentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    AgentInfo agentInfo2 = new AgentInfo();

    // Act and Assert
    assertEquals(agentInfo, agentInfo2);
    assertEquals(agentInfo.hashCode(), agentInfo2.hashCode());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}, and {@link AgentInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AgentInfo#equals(Object)}
   *   <li>{@link AgentInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();

    // Act and Assert
    assertEquals(agentInfo, agentInfo);
    int expectedHashCodeResult = agentInfo.hashCode();
    assertEquals(expectedHashCodeResult, agentInfo.hashCode());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AgentInfo(), 1);
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.ipAddress("42 Main St");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.hostname("localhost");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.serverFqdn("Server Fqdn");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.version("1.0.2");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.url("https://example.org/example");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.onPrem(true);

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.mt(true);

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    AgentInfo agentInfo = new AgentInfo();
    agentInfo.commitId("42");

    // Act and Assert
    assertNotEquals(agentInfo, new AgentInfo());
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AgentInfo(), null);
  }

  /**
   * Test {@link AgentInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AgentInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentInfo.equals(Object)", "int AgentInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AgentInfo(), "Different type to AgentInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AgentInfo}
   *   <li>{@link AgentInfo#commitId(String)}
   *   <li>{@link AgentInfo#hostname(String)}
   *   <li>{@link AgentInfo#ipAddress(String)}
   *   <li>{@link AgentInfo#mt(Boolean)}
   *   <li>{@link AgentInfo#onPrem(Boolean)}
   *   <li>{@link AgentInfo#serverFqdn(String)}
   *   <li>{@link AgentInfo#setCommitId(String)}
   *   <li>{@link AgentInfo#setHostname(String)}
   *   <li>{@link AgentInfo#setIpAddress(String)}
   *   <li>{@link AgentInfo#setMt(Boolean)}
   *   <li>{@link AgentInfo#setOnPrem(Boolean)}
   *   <li>{@link AgentInfo#setServerFqdn(String)}
   *   <li>{@link AgentInfo#setUrl(String)}
   *   <li>{@link AgentInfo#setVersion(String)}
   *   <li>{@link AgentInfo#url(String)}
   *   <li>{@link AgentInfo#version(String)}
   *   <li>{@link AgentInfo#toString()}
   *   <li>{@link AgentInfo#getCommitId()}
   *   <li>{@link AgentInfo#getHostname()}
   *   <li>{@link AgentInfo#getIpAddress()}
   *   <li>{@link AgentInfo#getMt()}
   *   <li>{@link AgentInfo#getOnPrem()}
   *   <li>{@link AgentInfo#getServerFqdn()}
   *   <li>{@link AgentInfo#getUrl()}
   *   <li>{@link AgentInfo#getVersion()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AgentInfo.<init>()",
    "AgentInfo AgentInfo.commitId(String)",
    "String AgentInfo.getCommitId()",
    "String AgentInfo.getHostname()",
    "String AgentInfo.getIpAddress()",
    "Boolean AgentInfo.getMt()",
    "Boolean AgentInfo.getOnPrem()",
    "String AgentInfo.getServerFqdn()",
    "String AgentInfo.getUrl()",
    "String AgentInfo.getVersion()",
    "AgentInfo AgentInfo.hostname(String)",
    "AgentInfo AgentInfo.ipAddress(String)",
    "AgentInfo AgentInfo.mt(Boolean)",
    "AgentInfo AgentInfo.onPrem(Boolean)",
    "AgentInfo AgentInfo.serverFqdn(String)",
    "void AgentInfo.setCommitId(String)",
    "void AgentInfo.setHostname(String)",
    "void AgentInfo.setIpAddress(String)",
    "void AgentInfo.setMt(Boolean)",
    "void AgentInfo.setOnPrem(Boolean)",
    "void AgentInfo.setServerFqdn(String)",
    "void AgentInfo.setUrl(String)",
    "void AgentInfo.setVersion(String)",
    "String AgentInfo.toString()",
    "AgentInfo AgentInfo.url(String)",
    "AgentInfo AgentInfo.version(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AgentInfo actualAgentInfo = new AgentInfo();
    AgentInfo actualCommitIdResult = actualAgentInfo.commitId("42");
    AgentInfo actualHostnameResult = actualAgentInfo.hostname("localhost");
    AgentInfo actualIpAddressResult = actualAgentInfo.ipAddress("42 Main St");
    AgentInfo actualMtResult = actualAgentInfo.mt(true);
    AgentInfo actualOnPremResult = actualAgentInfo.onPrem(true);
    AgentInfo actualServerFqdnResult = actualAgentInfo.serverFqdn("Server Fqdn");
    actualAgentInfo.setCommitId("42");
    actualAgentInfo.setHostname("localhost");
    actualAgentInfo.setIpAddress("42 Main St");
    actualAgentInfo.setMt(true);
    actualAgentInfo.setOnPrem(true);
    actualAgentInfo.setServerFqdn("Server Fqdn");
    actualAgentInfo.setUrl("https://example.org/example");
    actualAgentInfo.setVersion("1.0.2");
    AgentInfo actualUrlResult = actualAgentInfo.url("https://example.org/example");
    AgentInfo actualVersionResult = actualAgentInfo.version("1.0.2");
    String actualToStringResult = actualAgentInfo.toString();
    String actualCommitId = actualAgentInfo.getCommitId();
    String actualHostname = actualAgentInfo.getHostname();
    String actualIpAddress = actualAgentInfo.getIpAddress();
    Boolean actualMt = actualAgentInfo.getMt();
    Boolean actualOnPrem = actualAgentInfo.getOnPrem();
    String actualServerFqdn = actualAgentInfo.getServerFqdn();
    String actualUrl = actualAgentInfo.getUrl();

    // Assert
    assertEquals("1.0.2", actualAgentInfo.getVersion());
    assertEquals("42 Main St", actualIpAddress);
    assertEquals("42", actualCommitId);
    assertEquals("Server Fqdn", actualServerFqdn);
    assertEquals(
        "class AgentInfo {\n"
            + "    ipAddress: 42 Main St\n"
            + "    hostname: localhost\n"
            + "    serverFqdn: Server Fqdn\n"
            + "    version: 1.0.2\n"
            + "    url: https://example.org/example\n"
            + "    onPrem: true\n"
            + "    mt: true\n"
            + "    commitId: 42\n"
            + "}",
        actualToStringResult);
    assertEquals("https://example.org/example", actualUrl);
    assertEquals("localhost", actualHostname);
    assertTrue(actualMt);
    assertTrue(actualOnPrem);
    assertSame(actualAgentInfo, actualCommitIdResult);
    assertSame(actualAgentInfo, actualHostnameResult);
    assertSame(actualAgentInfo, actualIpAddressResult);
    assertSame(actualAgentInfo, actualMtResult);
    assertSame(actualAgentInfo, actualOnPremResult);
    assertSame(actualAgentInfo, actualServerFqdnResult);
    assertSame(actualAgentInfo, actualUrlResult);
    assertSame(actualAgentInfo, actualVersionResult);
  }
}
