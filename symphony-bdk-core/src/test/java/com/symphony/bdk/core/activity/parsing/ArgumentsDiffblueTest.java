package com.symphony.bdk.core.activity.parsing;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArgumentsDiffblueTest {
  /**
   * Test {@link Arguments#Arguments(Map)}.
   *
   * <p>Method under test: {@link Arguments#Arguments(Map)}
   */
  @Test
  @DisplayName("Test new Arguments(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Arguments.<init>(Map)"})
  void testNewArguments() {
    // Arrange, Act and Assert
    assertTrue(new Arguments(new HashMap<>()).getArgumentNames().isEmpty());
  }

  /**
   * Test {@link Arguments#Arguments()}.
   *
   * <p>Method under test: {@link Arguments#Arguments()}
   */
  @Test
  @DisplayName("Test new Arguments()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Arguments.<init>()"})
  void testNewArguments2() {
    // Arrange, Act and Assert
    assertTrue(new Arguments().getArgumentNames().isEmpty());
  }

  /**
   * Test {@link Arguments#getArgumentNames()}.
   *
   * <p>Method under test: {@link Arguments#getArgumentNames()}
   */
  @Test
  @DisplayName("Test getArgumentNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set Arguments.getArgumentNames()"})
  void testGetArgumentNames() {
    // Arrange, Act and Assert
    assertTrue(new Arguments().getArgumentNames().isEmpty());
  }

  /**
   * Test {@link Arguments#get(String)} with {@code argumentName}.
   *
   * <p>Method under test: {@link Arguments#get(String)}
   */
  @Test
  @DisplayName("Test get(String) with 'argumentName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object Arguments.get(String)"})
  void testGetWithArgumentName() {
    // Arrange, Act and Assert
    assertNull(new Arguments().get("Argument Name"));
  }

  /**
   * Test {@link Arguments#getAsString(String)}.
   *
   * <p>Method under test: {@link Arguments#getAsString(String)}
   */
  @Test
  @DisplayName("Test getAsString(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Arguments.getAsString(String)"})
  void testGetAsString() {
    // Arrange, Act and Assert
    assertNull(new Arguments().getAsString("Argument Name"));
  }

  /**
   * Test {@link Arguments#getString(String)}.
   *
   * <p>Method under test: {@link Arguments#getString(String)}
   */
  @Test
  @DisplayName("Test getString(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Arguments.getString(String)"})
  void testGetString() {
    // Arrange, Act and Assert
    assertNull(new Arguments().getString("Argument Name"));
  }

  /**
   * Test {@link Arguments#getHashtag(String)}.
   *
   * <p>Method under test: {@link Arguments#getHashtag(String)}
   */
  @Test
  @DisplayName("Test getHashtag(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.activity.parsing.Hashtag Arguments.getHashtag(String)"})
  void testGetHashtag() {
    // Arrange, Act and Assert
    assertNull(new Arguments().getHashtag("Argument Name"));
  }

  /**
   * Test {@link Arguments#getCashtag(String)}.
   *
   * <p>Method under test: {@link Arguments#getCashtag(String)}
   */
  @Test
  @DisplayName("Test getCashtag(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.activity.parsing.Cashtag Arguments.getCashtag(String)"})
  void testGetCashtag() {
    // Arrange, Act and Assert
    assertNull(new Arguments().getCashtag("Argument Name"));
  }

  /**
   * Test {@link Arguments#getMention(String)}.
   *
   * <p>Method under test: {@link Arguments#getMention(String)}
   */
  @Test
  @DisplayName("Test getMention(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.symphony.bdk.core.activity.parsing.Mention Arguments.getMention(String)"})
  void testGetMention() {
    // Arrange, Act and Assert
    assertNull(new Arguments().getMention("Argument Name"));
  }
}
