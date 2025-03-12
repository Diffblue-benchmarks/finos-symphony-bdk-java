package com.symphony.bdk.test.mockito;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.symphony.bdk.core.service.message.model.Message;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessageMatchersDiffblueTest {
  /**
   * Test {@link MessageMatchers#hasContentAndData(Message)}.
   * <p>
   * Method under test: {@link MessageMatchers#hasContentAndData(Message)}
   */
  @Test
  @DisplayName("Test hasContentAndData(Message)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Message MessageMatchers.hasContentAndData(Message)"})
  void testHasContentAndData() {
    // Arrange, Act and Assert
    assertNull(MessageMatchers.hasContentAndData(null));
  }

  /**
   * Test {@link MessageMatchers#containsContent(String)}.
   * <p>
   * Method under test: {@link MessageMatchers#containsContent(String)}
   */
  @Test
  @DisplayName("Test containsContent(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Message MessageMatchers.containsContent(String)"})
  void testContainsContent() {
    // Arrange, Act and Assert
    assertNull(MessageMatchers.containsContent("Not all who wander are lost"));
  }
}
