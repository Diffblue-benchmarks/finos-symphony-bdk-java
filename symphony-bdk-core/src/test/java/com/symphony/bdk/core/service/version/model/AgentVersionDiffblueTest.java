package com.symphony.bdk.core.service.version.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AgentVersionDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AgentVersion#AgentVersion(int, int)}
   *   <li>{@link AgentVersion#getMajor()}
   *   <li>{@link AgentVersion#getMinor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AgentVersion.<init>(int, int)",
    "int AgentVersion.getMajor()",
    "int AgentVersion.getMinor()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    AgentVersion actualAgentVersion = new AgentVersion(1, 1);
    int actualMajor = actualAgentVersion.getMajor();

    // Assert
    assertEquals(1, actualMajor);
    assertEquals(1, actualAgentVersion.getMinor());
  }

  /**
   * Test {@link AgentVersion#isHigher(AgentVersion)}.
   *
   * <ul>
   *   <li>Given {@link AgentVersion#AgentVersion(int, int)} with major is twelve and minor is one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AgentVersion#isHigher(AgentVersion)}
   */
  @Test
  @DisplayName(
      "Test isHigher(AgentVersion); given AgentVersion(int, int) with major is twelve and minor is one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentVersion.isHigher(AgentVersion)"})
  void testIsHigher_givenAgentVersionWithMajorIsTwelveAndMinorIsOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new AgentVersion(12, 1).isHigher(AgentVersion.AGENT_24_12));
  }

  /**
   * Test {@link AgentVersion#isHigher(AgentVersion)}.
   *
   * <ul>
   *   <li>Given {@link AgentVersion#AgentVersion(int, int)} with major is twenty-four and minor is
   *       one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AgentVersion#isHigher(AgentVersion)}
   */
  @Test
  @DisplayName(
      "Test isHigher(AgentVersion); given AgentVersion(int, int) with major is twenty-four and minor is one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentVersion.isHigher(AgentVersion)"})
  void testIsHigher_givenAgentVersionWithMajorIsTwentyFourAndMinorIsOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new AgentVersion(24, 1).isHigher(AgentVersion.AGENT_24_12));
  }

  /**
   * Test {@link AgentVersion#isHigher(AgentVersion)}.
   *
   * <ul>
   *   <li>Given {@link AgentVersion#AGENT_24_12}.
   *   <li>When {@link AgentVersion#AGENT_24_12}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AgentVersion#isHigher(AgentVersion)}
   */
  @Test
  @DisplayName(
      "Test isHigher(AgentVersion); given AGENT_24_12; when AGENT_24_12; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentVersion.isHigher(AgentVersion)"})
  void testIsHigher_givenAgent_24_12_whenAgent_24_12_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(AgentVersion.AGENT_24_12.isHigher(AgentVersion.AGENT_24_12));
  }

  /**
   * Test {@link AgentVersion#isHigher(AgentVersion)}.
   *
   * <ul>
   *   <li>When {@link AgentVersion#AgentVersion(int, int)} with major is one and minor is one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AgentVersion#isHigher(AgentVersion)}
   */
  @Test
  @DisplayName(
      "Test isHigher(AgentVersion); when AgentVersion(int, int) with major is one and minor is one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AgentVersion.isHigher(AgentVersion)"})
  void testIsHigher_whenAgentVersionWithMajorIsOneAndMinorIsOne_thenReturnTrue() {
    // Arrange and Act
    boolean actualIsHigherResult = AgentVersion.AGENT_24_12.isHigher(new AgentVersion(1, 1));

    // Assert
    assertTrue(actualIsHigherResult);
  }
}
