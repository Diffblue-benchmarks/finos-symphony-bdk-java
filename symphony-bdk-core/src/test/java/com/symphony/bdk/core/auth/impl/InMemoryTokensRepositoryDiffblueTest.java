package com.symphony.bdk.core.auth.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InMemoryTokensRepositoryDiffblueTest {
  /**
   * Test {@link InMemoryTokensRepository#save(String, String)}.
   * <p>
   * Method under test: {@link InMemoryTokensRepository#save(String, String)}
   */
  @Test
  @DisplayName("Test save(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void InMemoryTokensRepository.save(String, String)"})
  void testSave() {
    // Arrange
    InMemoryTokensRepository inMemoryTokensRepository = new InMemoryTokensRepository();

    // Act
    inMemoryTokensRepository.save("ABC123", "ABC123");

    // Assert
    Optional<String> getResult = inMemoryTokensRepository.get("ABC123");
    assertEquals("ABC123", getResult.get());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link InMemoryTokensRepository#get(String)}.
   * <p>
   * Method under test: {@link InMemoryTokensRepository#get(String)}
   */
  @Test
  @DisplayName("Test get(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Optional InMemoryTokensRepository.get(String)"})
  void testGet() {
    // Arrange, Act and Assert
    assertFalse((new InMemoryTokensRepository()).get("ABC123").isPresent());
  }
}
